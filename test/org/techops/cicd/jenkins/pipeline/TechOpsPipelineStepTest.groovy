package org.techops.cicd.jenkins.pipeline

import org.techops.cicd.jenkins.IStepExecutor
import org.techops.cicd.jenkins.ioc.ContextRegistry
import org.techops.cicd.jenkins.ioc.IContext
import org.junit.Before
import org.junit.Test
import org.mockito.InOrder

import static org.junit.Assert.*
import static org.mockito.Mockito.*

class TechOpsPipelineStepTest {
    private IContext _context
    private IStepExecutor _steps
    private Object _env

    private class Env {
        static String GIT_URL = "git@git"
        static String BRANCH_NAME = "master"
        static String NEXUS_URL = ""
        static String NEXUS_CRED = "username:password"
        static String WORKSPACE = "/workspace/unittest"
        static String CHANGE_ID = "100"
    }

    @Before
    void setup() {
        _context = mock(IContext.class)
        _steps = mock(IStepExecutor.class)
        //_env = mock(Object.class)

        when(_context.getStepExecutor()).thenReturn(_steps)
        when(_context.getEnvironmentVariable()).thenReturn(Env)

        ContextRegistry.registerContext(_context)
    }

    @Test
    void checkOutFrom_successful() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        String githubproject = "git.test.com"
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.checkOutFrom("${githubproject}", "master")

        // verify
        inOrder.verify(_steps).deleteDir()
        inOrder.verify(_steps).checkout(any(LinkedHashMap))
        assertFalse("A build loop is present", techOpsPipelineStep.hasJenkinsCommit)

    }

    @Test
    void assembleArtifact_ranSuccessfully() {
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.assembleArtifact()

        // verify
        verify(_steps).recordIssues(any(LinkedHashMap))
        verify(_steps).stash(any(LinkedHashMap))


    }

    @Test
    void testAndRecordCodeCoverage_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.testAndRecordCodeCoverage()

        // verify
        //inOrder.verify(_steps).xunit(any(LinkedHashMap))
        inOrder.verify(_steps).sh("./gradlew clean test jacocoTestReport -i")
        inOrder.verify(_steps).jacoco(any(LinkedHashMap))
        //verify(_steps).JUnit(any(LinkedHashMap))
    }

    @Test
    void checkCodeAnalysis_ranSuccessfully() {
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.checkCodeAnalysis()

        // verify
        verify(_steps, times(3)).recordIssues(any(LinkedHashMap))
    }

    @Test
    void checkCodeAnalysisForKotlin_ranSuccessfully() {
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.checkCodeAnalysisForKotlin()

        // verify
        verify(_steps, times(1)).recordIssues(any(LinkedHashMap))
    }

    @Test
    void generateGitTag_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        def version = "1.0.1"

        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']
        LinkedHashMap gitTag = [returnStdout: true, script: "git tag $version"]
        LinkedHashMap gitPush = [returnStdout: true, script: "git push origin $version -v"]

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")
        when(_steps.readFile("./build/version.txt")).thenReturn(version)
        when(_steps.sh(gitTag)).thenReturn("tag created for test")
        when(_steps.sh(gitPush)).thenReturn("push for test")

        // execute
        techOpsPipelineStep.generateGitTag()

        // verify
        inOrder.verify(_steps).readFile(any(String))
        inOrder.verify(_steps).sh(gitTag)
        inOrder.verify(_steps).sh(gitPush)
    }

    @Test
    void publishJarToNexus_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        def version = "1.0.1"

        // execute
        techOpsPipelineStep.publishJarToNexus("uname:passwrd")

        // verify
        verify(_steps, times(2)).sh(any(String))
        inOrder.verify(_steps).readFile(any(String))
    }

    @Test
    void publishGemToNexus_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap listGemName = [returnStdout: true, script: "ls ./*.gem"]

        //mock
        when(_steps.sh(listGemName)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.publishGemToNexus()

        // verify
        verify(_steps, times(1)).sh(any(String))

    }

    @Test
    void publishImageToNexus_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        def version = "1.0.1"

        // execute
        techOpsPipelineStep.publishImageToNexus("myImage", "dir/here")

        // verify
        inOrder.verify(_steps).readFile(any(String))
        verify(_steps, times(2)).sh(any(String))

    }

    @Test
    void generateChangelog_ranSuccessfully() {
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitlog = [returnStdout: true, script: 'git log -1 --pretty=%B']

        //mock
        when(_steps.sh(gitlog)).thenReturn("this is a unit test mock")

        // execute
        techOpsPipelineStep.generateChangelog()

        // verify
        inOrder.verify(_steps).sh("./gradlew generateChangeLog -i")
        inOrder.verify(_steps).sh("git commit -m \"Changelog updated by Jenkins\" --allow-empty")
    }

    @Test
    void logIntoDockerRegistry_ranSuccessfully(){
        InOrder inOrder = inOrder(ignoreStubs(_steps))
        //mock
        when(_steps.credentials("52773302-db3b-468a-a63a-091fd3164aa9")).thenReturn("username:password")

        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()

        // execute
        techOpsPipelineStep.logIntoDockerRegistry()

        //TODO add verifiers
        verify(_steps, times(2)).sh(any(String))
        inOrder.verify(_steps).sh("docker login -u username -p password "+TechOpsPipelineStep.DOCKER_REGISTRY)
    }

    @Test
    void buildDockerImage_ranSuccessfully(){
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()

        // execute
        techOpsPipelineStep.buildDockerImage("dir/myfile","testTag")

        //TODO add verifiers
    }

    @Test
    void tagDockerImage_ranSuccessfully(){
        InOrder inOrder = inOrder(ignoreStubs(_steps))

        // prepare
        def version = '1.0.1'
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()
        LinkedHashMap gitTag = [returnStdout: true, script: "git tag $version"]
        LinkedHashMap gitPush = [returnStdout: true, script: "git push origin $version -v"]


        //mock
        when(_steps.readFile(any(String))).thenReturn(version)
        when(_steps.sh(gitTag)).thenReturn("tag created for test")
        when(_steps.sh(gitPush)).thenReturn("push for test")

        // execute
        techOpsPipelineStep.tagDockerImage("testImage","dir/myFile")

        //verify
        inOrder.verify(_steps).readFile(any(String))
        inOrder.verify(_steps).sh(gitTag)
        inOrder.verify(_steps).sh(gitPush)
    }

    @Test
    void updateDockerImageVersion_ranSuccessfully(){
        // prepare
        TechOpsPipelineStep techOpsPipelineStep = new TechOpsPipelineStep()

        // execute
        techOpsPipelineStep.updateDockerImageVersion()

        //TODO add verifiers
    }

}