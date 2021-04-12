

import org.techops.cicd.jenkins.ioc.ContextRegistry
import org.techops.cicd.jenkins.pipeline.TechOpsPipelineStep

/**
 * Custom step for easy use of the various Types of Builders used inside
 * our Jenkinsfiles
 * @param config Map to hold Type and Command for the builder
 * @return
 *
 * @Author linton.russell@uscis.dhs.gov
 */
def call(Map config) {
    ContextRegistry.registerDefaultContext(this,env)

    def techOpsPipelineStep = new TechOpsPipelineStep()

    if (config.type == "gradle") {
        techOpsPipelineStep.executeGradle(config.command)
    } else if (config.type == "rake") {
        techOpsPipelineStep.executeRake(config.command)
    } else if (config.type == "berk") {
        techOpsPipelineStep.executeBerk(config.command)
    } else if (config.type == "docker") {
        techOpsPipelineStep.executeDocker(config.command)
    }
}