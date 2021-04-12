package org.techops.cicd.jenkins.pipeline

import org.techops.cicd.jenkins.IStepExecutor


/**
 * Class that encasulate various common build steps used withing PCS pipelines.
 * */
class TechOpsPipelineStep implements Serializable {
    def hasJenkinsCommit = false //Abort the build to prevent a loop. Due to build being triggered by previous update to changelog by Jenkins
    def extraJacocoExclusion = [] // Project defined exclusion for jacoco
    static String MSG_ABORT_BY_JENKINS = "Aborting the build to prevent a loop. Due to build being triggered by previous update to changelog by Jenkins"
    static String DOCKER_REGISTRY = ':8136'
    static String MSG_CHANGELOG_LOOP = /Changelog updated by Jenkins/
    static String MSG_VERSION_LOOP = /version updated by Jenkins/
    static String NEXUS_MAVEN_URL = ''
    static String NEXUS_RUBYGEM_URL = ''
    static String NEXUS_DOCKER_URL = ''
    static String NEXUS_CRED = "52773302-db3b-468a-a63a-091fd3164aa9"

//    techOpsPipelineStep(){
//        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
//    }

    /**
     * An enhanced github checkout Steps building on top of the existing git checkout plugin.
     * @param gitHubProject
     * @param srcBranch
     * */
    def checkOutFrom(gitHubProject, srcBranch) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        steps.deleteDir()
        steps.checkout([$class                           : 'GitSCM', branches: [[name: "refs/heads/${srcBranch}"]],
                        doGenerateSubmoduleConfigurations: false,
                        extensions                       : [[$class: 'LocalBranch', localBranch: "${srcBranch}"],
                                                            [$class: 'LocalBranch']],
                        submoduleCfg                     : [],
                        userRemoteConfigs                : [[credentialsId: 'jenkins-privateKey', url: "git@git/${gitHubProject}"]]
        ])
        return this
    }
    /**
     * An enhanced github checkout Steps building on top of the existing git checkout plugin.
     * */
    def checkOutBranch() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        String gitUrl = env.GIT_URL
        if (gitUrl.contains("https")){
            gitUrl = gitUrl.replace('https://','git@').replace('/PROJ',':PROJ')
        }
        steps.echo("git url is: $gitUrl")
        steps.echo("Checking out branch:[ ${env.BRANCH_NAME} ]")

        steps.deleteDir()
        steps.checkout([$class                           : 'GitSCM', branches: [[name: "*/${env.BRANCH_NAME}"]],
                        doGenerateSubmoduleConfigurations: false,
                        extensions                       : [[$class: 'LocalBranch', localBranch: "${env.BRANCH_NAME}"],
                                                            [$class: 'LocalBranch']],
                        submoduleCfg                     : [],
                        userRemoteConfigs                : [[credentialsId: 'jenkins-privateKey', url: gitUrl]]
        ])
        return this
    }

    /**
     * Step that will run `gradle clean assemble` tasks then records any console warnings
     * */
    def assembleArtifact(boolean shouldCheckOutBranch = true) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        if (env.CHANGE_ID) {
            steps.echo("changeId is :${env.CHANGE_ID}")
        }
        else if (shouldCheckOutBranch) {
          checkOutBranch()
        }
        executeGradle("clean assemble")
        steps.recordIssues enabledForFailure: true, tools: [steps.java(), steps.javaDoc()]
        steps.stash includes: '**/build/libs/*.jar', name: 'jar_files'

        return this
    }

    /**
     * Step that run `gradle test jacocoTestReport` tasks then records the test and code coverage results.
     * */
    def testAndRecordCodeCoverage() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        executeGradle("clean test jacocoTestReport")

        steps.xunit thresholds: [steps.failed(failureNewThreshold: '2', failureThreshold: '3', unstableNewThreshold: '1', unstableThreshold: '2')],
                tools: [steps.JUnit(deleteOutputFiles: true, failIfNotNew: true, pattern: '**/build/test-results/**/*.xml', skipNoTestFiles: true, stopProcessingIfError: true)]

        def exclusion = '**/*Test.*, **/*IT.*'

        if (!extraJacocoExclusion.isEmpty()) {
            exclusion += ",${extraJacocoExclusion.join(",")}"
        }

        steps.jacoco exclusionPattern: exclusion,
                maximumBranchCoverage: '5', maximumClassCoverage: '5', maximumComplexityCoverage: '5',
                maximumInstructionCoverage: '5', maximumLineCoverage: '5', maximumMethodCoverage: '5',
                minimumBranchCoverage: '1', minimumClassCoverage: '1', minimumComplexityCoverage: '1',
                minimumInstructionCoverage: '1', minimumLineCoverage: '1', minimumMethodCoverage: '1'
        return this
    }


    /**
     * Step that runs gradle checkstyle spotbugs and pmd static code analyzers then records the reports
     * */
    def checkCodeAnalysis() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        executeGradle("clean checkstyleMain spotbugsMain pmdMain")
        steps.recordIssues enabledForFailure: true, tool: steps.checkStyle(pattern: '**/build/reports/checkstyle/main.xml')
        steps.recordIssues enabledForFailure: true, tool: steps.spotBugs(pattern: '**/build/reports/spotbugs/main.xml')
        steps.recordIssues enabledForFailure: true, tool: steps.pmdParser(pattern: '**/build/reports/pmd/main.xml')

        return this
    }

    /**
     * To be used for Kotlin project. ktlint generates a checkstyle and detekt performs SCA.
     *
     * To include checkstyle with ktlint. The ktlint argument field must include the checkstyle path.
     *
     * args "--reporter=plain", "--reporter=checkstyle,output=${buildDir}/reports/checkstyle/main.xml", "src/**\/*.kt"
     */
    def checkCodeAnalysisForKotlin() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        executeGradle("clean ktlint detekt")
        steps.recordIssues enabledForFailure: true, tool: steps.checkStyle(pattern: '**/build/reports/checkstyle/main.xml')

        return this
    }

    /**
     * Step to create a git tag version.txt file.
     * */
    def generateGitTag() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        checkOutBranch()
        executeGradle("generateVersionFile")
        steps.stash includes: "**/build/version*", name: "version_file"
        generateGitTag("./build/version.txt")
        return this
    }

    /**
     * Step to create a git tag version.txt file.
     * @param version
     * */
    def generateGitTag(String versionFileDir) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        def version = steps.readFile(versionFileDir)

        steps.sh(returnStdout: true, script: "git tag $version").trim()
        steps.sh(returnStdout: true, script: "git push origin $version -v").trim()

        return this
    }

    /**
     * Step to publish project artifacts to our Nexus artifacts repository.
     *
     * @param nexusCred - (username:password) access credentials to nexus server
     * */
    def publishJarToNexus(nexusCred) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        def USERNAME = nexusCred.split(':')[0]
        def PASSWORD = nexusCred.split(':')[1]
        steps.unstash 'jar_files'
        executeGradle(" -PrepoUsername=$USERNAME -PrepoPassword=$PASSWORD publishMavenJavaPublicationToMavenRepository")
        executeGradle("verifyNexusArtifact")
        //the verified.txt file is generated by the gradle task verifyNexusArtifact, if the artifact was found in nexus
        def verified = steps.readFile("./build/verified.txt")

        return this
    }

    /**
     * Step to publish project artifacts to our Nexus artifacts repository.
     *
     * */
    def publishJarToNexus() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        def USERNAME = env.NEXUS_CRED.split(':')[0]
        def PASSWORD = env.NEXUS_CRED.split(':')[1]
        steps.unstash 'jar_files'
        executeGradle(" -PrepoUsername=$USERNAME -PrepoPassword=$PASSWORD publishMavenJavaPublicationToMavenRepository")
        executeGradle("verifyNexusArtifact")
        //the verified.txt file is generated by the gradle task verifyNexusArtifact, if the artifact was found in nexus
        def verified = steps.readFile("./build/verified.txt")



        return this
    }
    /**
     * Step to publish gem project artifacts to our Nexus artifacts repository.
     *
     * */
    def publishGemToNexus() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        //files are being unstashed after being stached by the assemble stage.
        steps.unstash 'gem_files'
        def gemName = steps.sh(returnStdout: true, script: "ls ./*.gem").trim()
        executeWithBundle("gem nexus --clear-repo --url ${env.NEXUS_URL} --credential ${env.NEXUS_CRED} $gemName")

        return this
    }

    /**
     * Step to publish docker images to the Nexus docker repository.
     * @param imageName - Is the name of the image to publish
     * @param versionFileDir - the directory location of the VERSION file, to be used to push a specific version.
     * */
    def publishImageToNexus(String imageName, String versionFileDir){
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        steps.unstash "version_file"
        def version = steps.readFile("$versionFileDir/VERSION")

        executeDocker("push ${DOCKER_REGISTRY}/$imageName:latest")
        executeDocker("push ${DOCKER_REGISTRY}/$imageName:$version")

        return this
    }

    /**
     * Different implementation of publishImageToNexus to support refactored pipeline patterns.
     * @param tagPrefix - Is the image tag prefix, typically microservice name
     * @param tagSuffix - Is the image tag suffix, typically pipeline_id
     * */
    def tagAndPublishImageToNexus(tagPrefix, tagSuffix){
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        executeDocker("push ${DOCKER_REGISTRY}/$tagPrefix:$tagSuffix")

        return this
    }

    /**
     * Step to create or update (if already exist) a git CHANGELOG.md file and push to remote master.
     * */
    def generateChangelog() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        executeGradle("generateChangeLog")
        steps.unstash "version_file"
        steps.sh "git add -A"
        steps.sh "git commit -m \"Changelog updated by Jenkins\" --allow-empty"
        steps.sh "git push -u origin ${env.BRANCH_NAME}"

        return this
    }

    /**
     * Step to login to the docker registry
     * */
    def logIntoDockerRegistry() {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()
        def USERNAME = env.NEXUS_CRED.split(':')[0]
        def PASSWORD = env.NEXUS_CRED.split(':')[1]
        steps.sh '''
              docker_state=$(docker info >/dev/null 2>&1)
              if [[ $? -ne 0 ]]; then
                echo "Docker does not seem to be running, starting docker now"
                sudo service docker start
              fi
          '''
        executeDocker("login -u $USERNAME -p $PASSWORD $DOCKER_REGISTRY")

        return this
    }

    /**
     * Step to bump the version number within the VERSION file to be used for image versioning.
     * @param versionDir - Is the directory location to the VERSION file
     * */
    def updateDockerImageVersion(versionFileDir){
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        executeDocker("run --rm -v $env.WORKSPACE/$versionFileDir:/app treeder/bump patch")
        steps.stash includes: "$versionFileDir/VERSION", name: 'version_file'

        return this
    }

    /**
     * Step to bump the version number within the VERSION file to be used for image versioning.
     * using a gradle a task for the file update.
     * */
    def updateDockerImageVersionWithGradle(){
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()

        executeGradle("generateVersionFile")
        steps.sh "cp ./build/version.txt ${env.WORKSPACE}/VERSION"
        steps.stash includes: '**/VERSION*', name: 'version_file'

        return this
    }

    // NOTE: buildDockerImage supports two different sets of parameters (Method Overloading)
    // First would be used if tag latest is always wanted and want to pass path to Dockerfile explicitly
    // Second would be used if wanting to use custom tags, and pass path where Dockefile exists
    /**
     * Step to invoke docker build command.
     * @param fileLoc - Is the Dockerfile location to be used with the -f option
     * @param tag - Is the image tag name, to be use with the -t option
     * This function always tags "latest" after tag param
     * */
    def buildDockerImage(fileLoc, tag){
        executeDocker("build --force-rm --no-cache -f $fileLoc -t ${DOCKER_REGISTRY}/$tag .")
        return this
    }

    /**
     * Step to invoke docker build command.
     * @param dockerFileDir - Is the Dockerfile directory which also sets build context
     * @param tagPrefix - Is the image tag prefix, typically microservice name
     * @param tagSuffix - Is the image tag suffix, typically pipeline_id
     * */
    def buildDockerImage(dockerFileDir, tagPrefix, tagSuffix){
        executeDocker("build --force-rm --no-cache $dockerFileDir -t ${DOCKER_REGISTRY}/$tagPrefix:$tagSuffix")
        return this
    }

    /**
     * Step to invoke docker build command.
     * @param imageName - Is the name of the image
     * @param versionFileDir - Is the directory path to the VERSION file
     * */
    def tagDockerImage(String imageName, String versionFileDir){
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()

        steps.unstash "version_file"
        generateGitTag("$versionFileDir/VERSION")
        def version = steps.readFile("$versionFileDir/VERSION")
        steps.echo "Create docker Tag on Image"
        executeDocker("tag ${DOCKER_REGISTRY}/$imageName:latest ${DOCKER_REGISTRY}/$imageName:$version")
    }
    /**
     * Step to invoke gradle build tool to perform build process
     * @param args
     * */
    def executeGradle(args) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        steps.echo("..... EXECUTING GRADLE COMMAND: [ ./gradlew $args -i ] .....")
        steps.sh "./gradlew $args -i"
        return this
    }

    /**
     * Step to setup rvm environment for ruby processes
     * @param ruby_version
     * @param project_name
     * */
    def setupRvm(ruby_version, project_name) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()
        steps.echo("..... SETTING UP RVM ENVIRONMENT .....")
        steps.sh """#!/bin/bash -le
            rvm use $ruby_version@$project_name --create --install
            export | egrep -i "(ruby|rvm)" > '${env.WORKSPACE}/rvm.env'
            gem install bundler -v 1.17.3
            rvm use $ruby_version@$project_name
            bundle install
        """
    }

    /**
     * Step to invoke rake build tool to perform build process
     * @param args
     * */
    def executeRake(args) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()
        steps.echo("..... EXECUTING RAKE COMMAND: [ . ${env.WORKSPACE}/rvm.env/rvm.env; bundle exec rake $args ] .....")
        steps.sh ". '${env.WORKSPACE}/rvm.env'; bundle exec rake $args"
        return this
    }

    /**
     * Step to invoke an arbitrary shell command with respect to already built bundle (gemset)
     * @param args
     * */
    def executeWithBundle(args) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()
        steps.echo("..... EXECUTING SH COMMAND WITH RVM ENV: [ . ${env.WORKSPACE}/rvm.env/rvm.env; bundle exec $args ] .....")
        steps.sh ". '${env.WORKSPACE}/rvm.env'; bundle exec $args"
        return this
    }

    /**
     * Step to invoke berkshelf build tool to perform build process
     * @param args
     * */
    def executeBerk(args) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        Object env =  ContextRegistry.getContext().getEnvironmentVariable()
        steps.echo("..... EXECUTING BERK COMMAND: [ . ${env.WORKSPACE}/rvm.env; bundle exec berks $args ] .....")
        steps.sh ". '${env.WORKSPACE}/rvm.env'; bundle exec berks $args"
        return this
    }

    /**
     * Step to invoke docker tool to perform docker commands
     * @param args
     * */
    def executeDocker(args) {
        IStepExecutor steps = ContextRegistry.getContext().getStepExecutor()
        steps.echo("..... EXECUTING DOCKER COMMAND: [ docker $args ] .....")
        steps.sh "docker $args"
        return this
    }

}