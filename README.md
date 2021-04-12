# pcim-jenkins-shared-library
This repository implements various helper methods and common 
steps used within the PCIM Jenkins pipeline. This repository contains a 
shared library for Jenkins that can be unit tested with JUnit and Mockito. 
The general idea is:

1. Keep the custom steps inside `vars` as small as possible and without 
any logic. Instead do everything inside classes (inside `src`).
2. Create an interface `IStepExecutor` which declares methods for all required 
Jenkins steps (sh, bat, error, etc.). The classes call steps only through 
this interface.
3. Write unit tests for your classes like you normally would. Use your favorite 
mocking and dependency framework to mock IStepExecutor.

This way you should be able to:

* Compile and execute your library/unit tests without Jenkins
* Test that your classes work as intended
* Test that Jenkins steps are called with the right parameters
* Test the behaviour of your code when a Jenkins step fails
* Build, test, run metrics and deploy your Jenkins Pipeline Library through Jenkins itself


### Directory && File structure
The directory structure of a Shared Library is as follows:

```
   .
   ├─ src
   │    └ org
   │        └ Bar.groovy
   ├─ test
   │    └ org
   │        └ Bar.groovy
   ├─ resources                   # resource files (external libraries only)
   │    └ org
   │        └ bar.json            # static helper data for org.foo.Bar
   ├─ vars
   │    ├ foo.groovy              # for global 'foo' variable
   │    └ foo.txt                 # help for 'foo' variable
   ├─ JenkinsFile
   └─ build.gradle                # build file
```


## Credit
This work was inspired by the following article, would like to give credit where due.
[blog post](https://dev.to/kuperadrian/how-to-setup-a-unit-testable-jenkins-shared-pipeline-library-2e62) on dev.to,  if you want a tutorial/more detailed explanation.

## Example Jenkinsfile

```groovy
// add the following line and replace necessary values if you are not loading the library implicitly
// @Library('pcim-jenkins-shared-library')_

import org.techops.cicd.jenkins.pipeline.TechOpsPipelineStep
import gov.dhs.uscis.pcim.pcs.ioc.ContextRegistry

ContextRegistry.registerDefaultContext(this, env)
def techOpsPipelineStep = new techOpsPipelineStep()

pipeline {
  stages{
    stage ('build') {
      step {
       script {
          techOpsPipelineStep.assembleArtifact()
        }
      }
    }
    stage ('chaining example'){
      step {
       script {
          techOpsPipelineStep
                  .checkOutBranch()
                  .createVersionFile()
                  .updateDockerImageVersionWithGradle()
                  .tagDockerImage(ARTIFACT_NAME, env.WORKSPACE)
        }
      }
    }
  }

}
```