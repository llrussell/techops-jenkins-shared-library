#!groovy

pipeline {
    agent { label 'nonprod-agent' }

    //triggers { pollSCM('H/1 * * * *') }
    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '20'))
    }
    environment {
        //GITHUB_REPO = "pcim-jenkins-shared-library.git"
        GIT_SSL_NO_VERIFY = true
        MSG_CHANGELOG_LOOP = /Changelog updated by Jenkins/
        NEXUS_CRED = credentials("52773302-db3b-468a-a63a-091fd3164aa9")
    }

    stages {
        stage('Build') {
            when {
                not { changelog "$MSG_CHANGELOG_LOOP" }
            }
            steps {
                pcimArtifact type: 'jar', task: 'build'
            }
        }
        stage('Test & Code Coverage') {
            when {
                not { changelog "$MSG_CHANGELOG_LOOP" }
                beforeAgent true
            }
            steps {
                pcimArtifact type: 'jar', task: 'test'
                xunit thresholds: [failed(failureNewThreshold: '2', failureThreshold: '3', unstableNewThreshold: '1', unstableThreshold: '2')], tools: [JUnit(deleteOutputFiles: true, failIfNotNew: true, pattern: '**/build/test-results/**/*.xml', skipNoTestFiles: true, stopProcessingIfError: true)]
            }

        }
        stage('Code Analysis') {
            when {
                not { changelog "$MSG_CHANGELOG_LOOP" }
                beforeAgent true
            }
            steps {
                pcimArtifact type: 'jar', task: 'check'
            }
        }
        stage('Create git tag on master') {
            when {
                branch 'master'
                expression { "${currentBuild.currentResult}" == "SUCCESS"}
                not { changelog "$MSG_CHANGELOG_LOOP" }
                beforeAgent true
            }
            steps {
                pcimArtifact type: 'jar', task: 'createGitTag'
            }
        }
        stage('Publish to Nexus') {
            when {
                branch 'master'
                expression { currentBuild.currentResult == "SUCCESS" }
                not { changelog "$MSG_CHANGELOG_LOOP" }
                beforeAgent true
            }
            steps {
                pcimArtifact type: 'jar', task: 'publish'
                pcimArtifact type: 'jar', task: 'changelog'
            }
        }
    }
    post {
        success {
            slackSend(color: "good", message: "SUCCESSFUL: Job. ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)")
        }
        unstable {
            slackSend(color: "warn", message: "UNSTABLE: Job. ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)")
        }
        failure {
            slackSend color: 'danger', message: "FAILED: Job. ${env.JOB_NAME} ${env.BUILD_NUMBER} (<${env.BUILD_URL}|Open>)"
        }
    }
}