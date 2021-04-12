package org.techops.cicd.jenkins.ioc

import org.techops.cicd.jenkins.IStepExecutor
import org.techops.cicd.jenkins.StepExecutor

class DefaultContext implements IContext, Serializable {
    private _steps
    private _env

    DefaultContext(steps) {
        this._steps = steps
    }
    DefaultContext(steps, env) {
        this._steps = steps
        this._env = env
    }

    @Override
    IStepExecutor getStepExecutor() {
        return new StepExecutor(this._steps)
    }

    @Override
    Object getEnvironmentVariable(){
        return this._env
    }
}
