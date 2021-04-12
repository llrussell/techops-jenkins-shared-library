package org.techops.cicd.jenkins

/**
 * Interface for calling any necessary Jenkins steps. This will be mocked in unit tests.
 */
interface IStepExecutor {
    int sh(String command)

    Object sh(LinkedHashMap values)

    void error(String message)

    void echo(String message)

    void deleteDir()

    void checkout(LinkedHashMap values)

    void recordIssues(LinkedHashMap values)

    void stash(LinkedHashMap values)

    void unstash(String fileName)

    void java()

    void javaDoc()

    void xunit(LinkedHashMap values)

    Object JUnit(LinkedHashMap values)

    void jacoco(LinkedHashMap values)

    Object readFile(String filePath)

    void checkStyle(LinkedHashMap values)

    void spotBugs(LinkedHashMap values)

    void pmdParser(LinkedHashMap values)

    void nexusPublisher(LinkedHashMap values)

    void git (LinkedHashMap values)

    void failed (LinkedHashMap values)

    Object credentials(String credentialId)
}
