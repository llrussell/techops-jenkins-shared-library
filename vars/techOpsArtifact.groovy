import org.techops.cicd.jenkins.pipeline.TechOpsPipelineStep

/**
 * Custom step for easy use of Gradle inside Jenkinsfiles
 * @param config Map to hold Type and Command for the builder
 * @return
 *
 * @Author linton.russell@uscis.dhs.gov
 */
def call(Map config) {
    ContextRegistry.registerDefaultContext(this,env)

    def techOpsPipelineStep = new TechOpsPipelineStep()

    if (config.type == "jar") {
        if (config.task == "build") {
            techOpsPipelineStep.assembleArtifact()
        } else if (config.task == "test") {
            techOpsPipelineStep.testAndRecordCodeCoverage()
        } else if (config.task == "check") {
            techOpsPipelineStep.checkCodeAnalysis()
        } else if (config.task == "createGitTag") {
            techOpsPipelineStep
                    .checkOutBranch()
                    .generateGitTag()
        } else if (config.task == "publish") {
            techOpsPipelineStep.publishJarToNexus()
        } else if (config.task == "changelog") {
            techOpsPipelineStep.generateChangelog()
        }
    } else if (config.type == "gem"){
        echo "TODO still to be implemented"
    }

}