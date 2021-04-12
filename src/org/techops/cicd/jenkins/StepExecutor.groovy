package org.techops.cicd.jenkins

class StepExecutor implements IStepExecutor {
    private _steps

    StepExecutor(steps) {
        this._steps = steps
    }

    @Override
    int sh(String command) {
        int returnStatus = this._steps.sh returnStatus: true, script: "${command}"
        if (returnStatus != 0) {
            error(String.format("script returned exit code %d", returnStatus))
        }

        return returnStatus
    }

    @Override
    Object sh(LinkedHashMap command) {
        this._steps.sh command
    }


    @Override
    void error(String message) {
        this._steps.error(message)
    }

    @Override
    void echo(String message) {
        this._steps.echo(message)
    }

    @Override
    void deleteDir() {
        this._steps.deleteDir()
    }

    @Override
    void checkout(LinkedHashMap values) {
        this._steps.checkout(values)
    }

    @Override
    void recordIssues(LinkedHashMap values) {
        this._steps.recordIssues(values)
    }

    @Override
    void stash(LinkedHashMap values) {
        this._steps.stash(values)
    }

    @Override
    void unstash(String fileName) {
        this._steps.unstash(fileName)
    }

    @Override
    void java() {
        this._steps.java()
    }

    @Override
    void javaDoc() {
        this._steps.javaDoc()
    }

    @Override
    void xunit(LinkedHashMap values) {
        this._steps.xunit(values)
    }

    @Override
    Object JUnit(LinkedHashMap values) {
        this._steps.JUnit(values)
    }

    @Override
    void jacoco(LinkedHashMap values) {
        this._steps.jacoco(values)
    }

    @Override
    Object readFile(String filePath) {
        return this._steps.readFile(filePath)
    }

    @Override
    void checkStyle(LinkedHashMap values) {
        this._steps.checkStyle(values)
    }

    @Override
    void spotBugs(LinkedHashMap values) {
        this._steps.spotBugs(values)
    }

    @Override
    void pmdParser(LinkedHashMap values) {
        this._steps.pmdParser(values)
    }

    @Override
    void nexusPublisher(LinkedHashMap values) {
        this._steps.nexusPublisher(values)
    }

    @Override
    void git(LinkedHashMap values) {
        this._steps.git(values)
    }

    @Override
    void failed(LinkedHashMap values) {
        this._steps.failed(values)
    }

    @Override
    Object credentials(String credentialId) {
        return this._steps.credentials(credentialId)
    }
}
