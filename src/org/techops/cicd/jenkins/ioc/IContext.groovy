package org.techops.cicd.jenkins.ioc

import org.techops.cicd.jenkins.IStepExecutor


interface IContext {
    IStepExecutor getStepExecutor()
    Object getEnvironmentVariable()
}

