
## 1.4.29 (2019-12-27 20:38:50)
### No issue

**fix publishGemToNexus**

* this custom step will now execute with the appropriate rvm environment/bundle instead of relying on a system &#39;nexus&#39; gem. This step will now also clear the last set of cached Nexus credentials with the &#39;--clear-repo&#39; option. Without this updates to the Nexus credential in the Jenkins credential store would not take effect without a manual operation on the Jenkins build agent.

[564dcb6a07c16cf](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/564dcb6a07c16cf) jpstrick *2019-12-27 16:59:16*

**remove use of sudo**


[7629466b889b753](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7629466b889b753) jpstrick *2019-12-27 16:55:24*

**Changelog updated by Jenkins**


[807ad9fcb4d4f8d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/807ad9fcb4d4f8d) svc-sid-jenkins *2019-12-23 20:16:27*

## 1.4.25 (2019-12-23 20:15:09)
### No issue

**Debug (#8)**

* install bundler in rvm step
* add rvm use again
* add rvm shel exec
* rm checkstyleMain
* rm tmp param
* rm spotbugsMain
* rvert changes to checkCodeAnalysis
* add staticanalysis2
* dont stash away jar
* add comment
* rm . from dockerbuild
* switch docker command to keep build context
* update tag
* rm temp method
* rm outdated comment
* update documentation
* update documentation
* update documentation
* update documentation
* modify assemble artifact for testing
* fix syntax
* update based on pr review
* verbiage update
* verbiage update

[802a53b64f67fb0](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/802a53b64f67fb0) Petro, Christopher L *2019-12-23 20:15:09*

**Changelog updated by Jenkins**


[b9ac789b3b0b92f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b9ac789b3b0b92f) svc-sid-jenkins *2019-12-18 19:04:52*

## 1.4.23 (2019-12-18 19:02:03)
### No issue

**Revert "remove use of sudo in pipeline steps"**

* This reverts commit 98054d61228a80e925c6180cd3daeb757882db9d.

[a32fefac48d0809](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a32fefac48d0809) jpstrick *2019-12-18 19:02:03*

**Changelog updated by Jenkins**


[de0e8b36c52a0f4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/de0e8b36c52a0f4) svc-sid-jenkins *2019-12-18 18:12:36*

## 1.4.21 (2019-12-18 18:11:24)
### No issue

**add env object to generateChangelog**


[1f0616eeea84b98](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1f0616eeea84b98) jpstrick *2019-12-18 17:39:24*

**fix pushing when upstream branch is not set**


[62cd3d277b20294](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/62cd3d277b20294) jpstrick *2019-12-18 17:34:57*

**remove use of sudo in pipeline steps**


[98054d61228a80e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/98054d61228a80e) jpstrick *2019-12-18 17:32:00*

**Changelog updated by Jenkins**


[8cc798b85ecb9c3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8cc798b85ecb9c3) svc-sid-jenkins *2019-09-18 16:59:55*

## 1.4.16 (2019-09-18 16:57:44)
### No issue

**move where version stashing occurs**


[03d6fa270b4f1c6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/03d6fa270b4f1c6) llrussel *2019-09-18 16:57:44*

**Changelog updated by Jenkins**


[3e5e706d0e91107](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3e5e706d0e91107) svc-sid-jenkins *2019-09-16 17:30:57*

## 1.4.14 (2019-09-16 17:27:57)
### No issue

**fixed broken unit test**


[08be75aae59fed7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/08be75aae59fed7) llrussel *2019-09-16 17:27:57*

**update regex for version file**


[c6a6a5ed2a8a32d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c6a6a5ed2a8a32d) llrussel *2019-09-16 15:45:18*

**Add stashing of the version file within the generateGitTag function.**


[779777874bd8b3f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/779777874bd8b3f) llrussel *2019-09-16 15:17:46*

**trying to print change Id**


[7e23eccee7dcff4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7e23eccee7dcff4) llrussel *2019-08-30 19:51:19*

**add a change id conditional to allow and extra checkout when the brnach is a PR branch**


[8d5c15a37adab24](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8d5c15a37adab24) llrussel *2019-08-30 19:21:14*

## 1.4.9 (2019-08-30 17:35:14)
### No issue

**minor updates to keep the branch insync**


[13d344d068084ed](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/13d344d068084ed) llrussel *2019-08-30 17:35:14*

## 1.4.8 (2019-08-30 17:28:15)
### No issue

**minor updates to keep the branch insync**


[4e12a5104521735](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4e12a5104521735) llrussel *2019-08-30 17:28:15*

**Changelog updated by Jenkins**


[3ea4dcede4d0b62](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3ea4dcede4d0b62) svc-sid-jenkins *2019-08-29 19:26:31*

## 1.4.6 (2019-08-29 19:23:51)
### No issue

**unstash version file**


[022c5d4ed8eb067](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/022c5d4ed8eb067) llrussel *2019-08-29 19:23:43*

**Changelog updated by Jenkins**


[3af9fd9355e97ae](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3af9fd9355e97ae) svc-sid-jenkins *2019-08-29 15:17:54*

## 1.4.3 (2019-08-29 15:15:36)
### No issue

**minor tweak**


[7e0484a6a9920d1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7e0484a6a9920d1) llrussel *2019-08-29 15:15:28*

**Changelog updated by Jenkins**


[b2eec20e0c98f33](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b2eec20e0c98f33) svc-sid-jenkins *2019-08-29 14:18:15*

## 1.4.0 (2019-08-29 14:15:36)
### No issue

**remove clean from nexus publishing**


[eff58e498923345](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/eff58e498923345) llrussel *2019-08-29 14:15:36*

**Changelog updated by Jenkins**


[452365a4b7601d6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/452365a4b7601d6) svc-sid-jenkins *2019-08-28 19:52:07*

## 1.3.98 (2019-08-28 19:50:33)
### No issue

**fix broken test**


[96a8af1da4ee139](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/96a8af1da4ee139) llrussel *2019-08-28 19:50:33*

**add step to setup rvm environment**

* this supports the use of project specific gemsets and ruby versions (to prevent conflicts between pipelines)

[93726dfb84a7f17](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/93726dfb84a7f17) jpstrick *2019-08-27 19:47:42*

**fix issue with spaces in workspace path**


[95ca803a59d3274](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/95ca803a59d3274) jpstrick *2019-08-27 19:24:32*

**remove the checkout step from inside the tagDocker step**


[e8916e47737e93c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e8916e47737e93c) llrussel *2019-08-27 19:19:50*

**unstash jar_files before publish to nexus**


[ed11189d858b189](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ed11189d858b189) llrussel *2019-08-27 19:08:54*

**get environment object**


[f2e7cea71980629](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f2e7cea71980629) jpstrick *2019-08-27 18:59:59*

**fix path to rvm file**


[242f21d2fedcc5f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/242f21d2fedcc5f) jpstrick *2019-08-27 18:54:01*

**load rvm environment from file**

* the rvm environment is not carried over between shell steps and needs to be loaded for each run

[70c0ae3643937c8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/70c0ae3643937c8) jpstrick *2019-08-27 18:34:06*

**print the branch being checked out**


[f416ea6e7f92cf5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f416ea6e7f92cf5) llrussel *2019-08-27 17:44:42*

**update stash regex**


[6e263e08f6f0725](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6e263e08f6f0725) llrussel *2019-08-27 16:06:31*

**update docker VERSION file bump function with gradle**


[a4be14e534144aa](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a4be14e534144aa) llrussel *2019-08-27 15:55:55*

**add brackets to workspace env call**


[212c16b8becc472](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/212c16b8becc472) llrussel *2019-08-27 14:41:51*

**Changelog updated by Jenkins**


[60767eb71a32c89](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/60767eb71a32c89) svc-sid-jenkins *2019-08-26 14:52:21*

## 1.3.84 (2019-08-26 14:50:46)
### No issue

**update README**


[4a0adc90e02c469](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4a0adc90e02c469) llrussel *2019-08-26 14:50:46*

**Changelog updated by Jenkins**


[d2a41c266240142](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d2a41c266240142) svc-sid-jenkins *2019-08-22 18:32:14*

## 1.3.82 (2019-08-22 18:30:40)
### No issue

**More documentation**


[77190c9ae61ed5d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/77190c9ae61ed5d) siayoub *2019-08-22 18:23:30*

**Add exclusion for jacoco in pipeline**


[5c69506ccd4245d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5c69506ccd4245d) siayoub *2019-08-22 18:20:57*

**Changelog updated by Jenkins**


[97825e529c8b7fc](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/97825e529c8b7fc) svc-sid-jenkins *2019-08-22 17:58:25*

**Add exclusion for jacoco in pipeline**


[346d36345b8a8b5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/346d36345b8a8b5) siayoub *2019-08-22 17:52:21*

**Changelog updated by Jenkins**


[10b874175047074](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/10b874175047074) svc-sid-jenkins *2019-08-19 12:41:48*

## 1.3.78 (2019-08-22 17:56:50)
### No issue

**Changelog updated by Jenkins**


[543693abe3c5d2d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/543693abe3c5d2d) svc-sid-jenkins *2019-08-22 17:52:32*

## 1.3.74 (2019-08-22 17:50:03)
### No issue

**address code review comments**


[4de2a0766692d51](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4de2a0766692d51) llrussel *2019-08-22 17:45:34*

**reactivate xunit reporting step**


[26eca99f70de25b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/26eca99f70de25b) llrussel *2019-08-21 22:23:54*

**add git add -A**


[7953af10f195900](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7953af10f195900) llrussel *2019-08-21 22:12:02*

**add new method updateDockerImageVersionWithGradle**


[b779685bd39b882](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b779685bd39b882) llrussel *2019-08-21 21:49:01*

**update unit test and added a few echo message to provide info on executor methods**


[ad6ecd91941c03c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ad6ecd91941c03c) llrussel *2019-08-20 12:24:28*

**Now we are able to just use the executeDocker method to simplify even further.**


[f12c6147544602e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f12c6147544602e) llrussel *2019-08-20 12:15:38*

**get the env variable from the context to use. using the WORKSPACE variable**


[28a5d02ea8fbad4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/28a5d02ea8fbad4) llrussel *2019-08-20 12:11:57*

**get the env variable from the context to use. 2**


[c4275fdaa9f7d42](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c4275fdaa9f7d42) llrussel *2019-08-20 12:08:00*

**get the env variable from the context to use.**


[dc2877ece039cdc](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dc2877ece039cdc) llrussel *2019-08-20 12:01:33*

**escape the quotes around PWD**


[97b678fbb30d8d4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/97b678fbb30d8d4) llrussel *2019-08-20 11:59:10*

**simplify the updateDockerImageVersion method.**


[954fd9fffe8329f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/954fd9fffe8329f) llrussel *2019-08-20 11:58:05*

**revert last commited changes**


[a236b7c5fe79180](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a236b7c5fe79180) llrussel *2019-08-19 20:27:46*

**testing --build-arg "https_proxy=http://el2-dt-preproxy.uscis.dhs.gov:80/" 2**


[b91b37a11c78154](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b91b37a11c78154) llrussel *2019-08-19 19:29:58*

**testing --build-arg "https_proxy=http://el2-dt-preproxy.uscis.dhs.gov:80/"**


[1160d822eca966a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1160d822eca966a) llrussel *2019-08-19 19:26:40*

**remove unnecessary unstash steps**


[3cd04b90d6ee1c9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3cd04b90d6ee1c9) llrussel *2019-08-19 16:59:46*

**try unstashing, though i suspect its directory location**


[297df7a1fc328b8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/297df7a1fc328b8) llrussel *2019-08-19 16:42:04*

**variable passed to triple quote shell call requires concatenation at the moment.**


[90de035d020496c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/90de035d020496c) llrussel *2019-08-19 16:31:16*

**testing something here 3**


[949d500b9541341](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/949d500b9541341) llrussel *2019-08-19 16:22:06*

**testing something here 2**


[8179734b657d098](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8179734b657d098) llrussel *2019-08-19 16:20:06*

**testing something here**


[fd82f40be1a6228](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fd82f40be1a6228) llrussel *2019-08-19 16:16:49*

**remove {} around versionFileDir**


[ce7de26ce2dd4db](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ce7de26ce2dd4db) llrussel *2019-08-19 16:09:17*

**was missing the double quotes "" to resolve variable for versionFileDir**


[9a5f7336c558f5e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9a5f7336c558f5e) llrussel *2019-08-19 16:01:50*

**use env.NEXUS_CRED**


[03cb6dd3997af2c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/03cb6dd3997af2c) llrussel *2019-08-19 15:45:51*

**i suspect a naming conflict; trying to confirm that here.**


[877f63c5020e233](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/877f63c5020e233) llrussel *2019-08-19 15:38:10*

**try casting**


[6239bac4dd89bb3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6239bac4dd89bb3) llrussel *2019-08-19 15:35:55*

**echo credential for testing**


[d53fecfedaea98d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d53fecfedaea98d) llrussel *2019-08-19 15:32:23*

**update unit test and define credtial as a String variable instead of trying**

* to imply

[5b04c2b72e6d31e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5b04c2b72e6d31e) llrussel *2019-08-19 15:24:04*

**create a local variable for credential**


[89b185ef4bea089](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/89b185ef4bea089) llrussel *2019-08-19 15:00:28*

**move the cred call to the specific calling method**


[551818aa2e6bd3b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/551818aa2e6bd3b) llrussel *2019-08-19 14:56:47*

**very minor change**


[db6d3ba96ee767a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/db6d3ba96ee767a) llrussel *2019-08-10 03:54:11*

**add test to all the new functions**


[742a125c24307b2](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/742a125c24307b2) llrussel *2019-08-10 03:49:16*

**add docker registry login step**


[7b803921cfa4bcd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7b803921cfa4bcd) llrussel *2019-08-09 21:19:44*

## 1.3.39 (2019-08-19 12:40:13)
### No issue

**fix error message**


[786581fabac0d6a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/786581fabac0d6a) jpstrick *2019-08-16 20:05:36*

**fail step with error message**


[034ea244a8e1732](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/034ea244a8e1732) jpstrick *2019-08-16 20:05:26*

**Changelog updated by Jenkins**


[e9de769317b60f0](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e9de769317b60f0) svc-sid-jenkins *2019-08-09 20:32:43*

## 1.3.35 (2019-08-09 20:31:12)
### No issue

**add docker builder**


[b62ee3854199e2a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b62ee3854199e2a) llrussel *2019-08-09 20:31:06*

**Changelog updated by Jenkins**


[edde6e865203ae7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/edde6e865203ae7) svc-sid-jenkins *2019-08-09 20:22:26*

## 1.3.32 (2019-08-09 20:20:07)
### No issue

**add missing assignment**


[a5845d11ce4a8a7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a5845d11ce4a8a7) llrussel *2019-08-09 20:18:50*

**Changelog updated by Jenkins**


[40ade23393c5800](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/40ade23393c5800) svc-sid-jenkins *2019-08-09 20:14:12*

## 1.3.29 (2019-08-09 20:12:03)
### No issue

**fix syntax error**


[b0557af02712754](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b0557af02712754) llrussel *2019-08-09 20:12:03*

**assigned env.GIT_URL to a local variable before string manipulation.**


[c6cc1344611eea9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c6cc1344611eea9) llrussel *2019-08-09 20:07:51*

**Changelog updated by Jenkins**


[0823a8d0191e06a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0823a8d0191e06a) svc-sid-jenkins *2019-08-09 20:02:34*

## 1.3.25 (2019-08-09 20:00:18)
### No issue

**print out git url**


[393aff2d68af8e5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/393aff2d68af8e5) llrussel *2019-08-09 19:52:57*

**Changelog updated by Jenkins**


[af8df07454dced4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/af8df07454dced4) svc-sid-jenkins *2019-08-09 19:47:40*

## 1.3.22 (2019-08-09 19:46:05)
### No issue

**add conditional to process string manipulations for https vs git@ protocol for cloning git.**


[c6c665c6dd6bcfb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c6c665c6dd6bcfb) llrussel *2019-08-09 19:45:58*

**Changelog updated by Jenkins**


[f9680662ff75a5d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f9680662ff75a5d) svc-sid-jenkins *2019-08-09 19:32:16*

## 1.3.19 (2019-08-09 19:30:41)
### No issue

**add conditional for https vs git@ protocol for cloning git.**


[e99d1b5769363a1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e99d1b5769363a1) llrussel *2019-08-09 19:30:35*

**Changelog updated by Jenkins**


[610ce390079c060](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/610ce390079c060) svc-sid-jenkins *2019-08-09 19:14:21*

## 1.3.16 (2019-08-09 19:10:27)
### No issue

**revert previous commit**


[c1efd0dad8f785e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c1efd0dad8f785e) llrussel *2019-08-09 19:10:27*

**use a different git creds due to jgit**


[46714b10b0b697b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/46714b10b0b697b) llrussel *2019-08-09 19:04:51*

**Changelog updated by Jenkins**


[82e5b56c71e52ee](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/82e5b56c71e52ee) svc-sid-jenkins *2019-08-09 18:00:40*

## 1.3.12 (2019-08-09 17:58:58)
### No issue

**New pipeline process with env as part of the Context**


[323558037a34c30](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/323558037a34c30) llrussel *2019-08-09 17:58:47*

**Changelog updated by Jenkins**


[3ff2a9384e7f49e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3ff2a9384e7f49e) svc-sid-jenkins *2019-08-09 16:56:57*

**refactor DefaultContext constructors 2**


[f186590f36ffb78](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f186590f36ffb78) llrussel *2019-08-09 16:55:25*

**Changelog updated by Jenkins**


[44c8ecc6adbe531](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/44c8ecc6adbe531) svc-sid-jenkins *2019-08-09 14:59:15*

**refactor DefaultContext constructors**


[b01821918850b64](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b01821918850b64) llrussel *2019-08-09 14:57:55*

**remove ContextRegistry environment variables from checkOutFrom step**


[4f9641abf98241f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4f9641abf98241f) llrussel *2019-08-09 14:55:32*

**Update ContextRegistry to provide environment variables to scripts**


[9469e89b3e93c5d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9469e89b3e93c5d) llrussel *2019-08-09 14:31:12*

**testing env vars**


[99c85301f68bc40](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/99c85301f68bc40) llrussel *2019-08-09 13:00:52*

**Minor cleanup.**

* Remove some commented code, also remove generateLog dependency from the build task

[f4b5399ec5b5ffd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f4b5399ec5b5ffd) llrussel *2019-08-09 12:47:07*

**bump pcim-gradle-plugin to version 1.5.31**


[b9226c7531d033c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b9226c7531d033c) llrussel *2019-08-08 00:06:41*

**update the publish step adding 'cred' keyvalue**


[55b4455a97db003](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/55b4455a97db003) llrussel *2019-08-07 23:53:34*

**update the publish step**


[cc2184fa850cee8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/cc2184fa850cee8) llrussel *2019-08-07 23:44:25*

**add verification to pipeline nexus step**


[999ec86583ef370](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/999ec86583ef370) llrussel *2019-08-07 21:06:46*

**update generateGitTagAndChangeLog**


[800e8326f9f7401](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/800e8326f9f7401) llrussel *2019-08-06 19:52:03*

**update generateGitTagAndChangeLog to now include the generateChangelog**

* method

[77b6dc51cabce36](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/77b6dc51cabce36) llrussel *2019-08-06 19:16:22*

**refactor publishToNexus to publishJarToNexus**


[20a4eef622cdd70](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/20a4eef622cdd70) llrussel *2019-08-06 19:13:18*

**remove loop check**


[dfa4b17f56dec33](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dfa4b17f56dec33) llrussel *2019-08-06 18:15:03*

**update to 1.4.25**


[aaa05c6f765dd98](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/aaa05c6f765dd98) llrussel *2019-08-06 17:50:42*

**update nexus publishing pipeline step**


[81111d18b8d3f1d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/81111d18b8d3f1d) llrussel *2019-08-06 17:33:47*

**update passing param to gradle syntax**


[2eeda7094880735](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2eeda7094880735) llrussel *2019-08-05 20:18:16*

**missing the step executor**


[41c85691b437883](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/41c85691b437883) llrussel *2019-08-05 18:46:19*

**add some nexus cred validation**


[2dac0e8bfa3f685](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2dac0e8bfa3f685) llrussel *2019-08-05 18:41:48*

**pass nexus credential to gradle command**


[53043bde69425b5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/53043bde69425b5) llrussel *2019-08-05 17:23:53*

**switch to use gradle nexus publishing versus the jenkins nexus plugin**


[881f1957b4c9de3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/881f1957b4c9de3) llrussel *2019-08-05 16:15:49*

**switch to use gradle nexus publishing versus the jenkins nexus plugin**


[1a0ff143b65efcb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1a0ff143b65efcb) llrussel *2019-08-05 16:04:12*

**switch to use gradle nexus publishing versus the jenkins nexus plugin**


[f434bc544e3712c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f434bc544e3712c) llrussel *2019-08-05 15:49:24*

**fix the group name for nexus maven groudIds**


[b0934315e62457c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b0934315e62457c) llrussel *2019-08-02 19:07:28*

**add generate git Tag function**


[3fe1f5527b6eaba](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3fe1f5527b6eaba) llrussel *2019-08-02 19:02:47*

## 1.2.82 (2019-07-23 03:17:01)
### No issue

**Disable Changelog generation from the Pipeline scince its acting up for**

* this repository; Need to investigate other Repos.

[ee3ce887f39db4f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ee3ce887f39db4f) llrussel *2019-07-23 03:16:47*

**Changelog updated by Jenkins**


[bef159585a07e5e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bef159585a07e5e) svc-sid-jenkins *2019-07-23 02:59:08*

## 1.2.79 (2019-07-23 02:57:44)
### No issue

**update changelog 9**


[f9c3dc8140ccc2c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f9c3dc8140ccc2c) llrussel *2019-07-23 02:57:37*

**Changelog updated by Jenkins**


[cab5a7eb64622b6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/cab5a7eb64622b6) svc-sid-jenkins *2019-07-23 02:51:04*

## 1.2.76 (2019-07-23 02:49:35)
### No issue

**update changelog 8**


[5a5e61b9734933f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5a5e61b9734933f) llrussel *2019-07-23 02:49:27*

**Changelog updated by Jenkins**


[61eb90a0d9729e1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/61eb90a0d9729e1) svc-sid-jenkins *2019-07-23 02:46:17*

## 1.2.73 (2019-07-23 02:44:55)
### No issue

**update changelog 7**


[7b9c3844528a421](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7b9c3844528a421) llrussel *2019-07-23 02:44:55*

**update changelog 6**


[e92701c26a709a5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e92701c26a709a5) llrussel *2019-07-23 02:43:25*

**Changelog updated by Jenkins**


[2f20d8707cf00a3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2f20d8707cf00a3) svc-sid-jenkins *2019-07-23 02:40:39*

## 1.2.69 (2019-07-23 02:39:20)
### No issue

**update changelog 5**


[921d27daa6af3dc](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/921d27daa6af3dc) llrussel *2019-07-23 02:39:15*

**Changelog updated by Jenkins**


[d5488ab2e3f22d0](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d5488ab2e3f22d0) svc-sid-jenkins *2019-07-23 02:32:25*

## 1.2.66 (2019-07-23 02:30:28)
### No issue

**update changelog 3**


[bd200604c622c1e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bd200604c622c1e) llrussel *2019-07-23 02:30:22*

**Changelog updated by Jenkins**


[f7d339b631b2944](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f7d339b631b2944) svc-sid-jenkins *2019-07-23 02:26:48*

## 1.2.63 (2019-07-23 02:25:00)
### No issue

**update changelog**


[913a7632f4cd2af](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/913a7632f4cd2af) llrussel *2019-07-23 02:24:13*

**Changelog updated by Jenkins**


[a2dff42fc25edc4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a2dff42fc25edc4) svc-sid-jenkins *2019-07-23 02:22:41*

## 1.2.60 (2019-07-23 02:21:17)
### No issue

**update expression 5**


[97d850b68fe1610](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/97d850b68fe1610) llrussel *2019-07-23 02:21:17*

**update expression 4**


[da4dd540ee059a1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/da4dd540ee059a1) llrussel *2019-07-23 02:04:50*

**Changelog updated by Jenkins**


[e8093fa80af4de3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e8093fa80af4de3) svc-sid-jenkins *2019-07-23 02:00:37*

## 1.2.56 (2019-07-23 01:59:19)
### No issue

**update expression 3**


[704c7f96d1ba905](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/704c7f96d1ba905) llrussel *2019-07-23 01:59:13*

**Changelog updated by Jenkins**


[26f64095c4c737e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/26f64095c4c737e) svc-sid-jenkins *2019-07-23 01:50:49*

## 1.2.53 (2019-07-23 01:49:32)
### No issue

**update expression 2**


[81abc4cf14dce6e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/81abc4cf14dce6e) llrussel *2019-07-23 01:49:32*

**update expression**


[d9b72a0eee58ec7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d9b72a0eee58ec7) llrussel *2019-07-23 01:45:10*

**all test passing**


[1dde64397e14ddb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1dde64397e14ddb) llrussel *2019-07-23 01:32:37*

**changelog generation was kinda messed up**


[e40b0a2eb46f6e5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e40b0a2eb46f6e5) llrussel *2019-07-23 01:24:08*

**testing the unstable; stop the pipeline from creating gittags and pushing to nexus**

* if build is not successful

[b464ffca2e380a3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b464ffca2e380a3) llrussel *2019-07-23 01:05:10*

**Changelog updated by Jenkins**


[2151826cb0ac984](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2151826cb0ac984) svc-sid-jenkins *2019-07-23 01:00:35*

## 1.2.46 (2019-07-23 00:59:21)
### No issue

**testing the unstable; stop the pipeline from creating gittags and pushing to nexus**


[40cc1642bbf647f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/40cc1642bbf647f) llrussel *2019-07-23 00:59:15*

**Changelog updated by Jenkins**


[fdc64b770471a95](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fdc64b770471a95) svc-sid-jenkins *2019-07-23 00:43:00*

## 1.2.43 (2019-07-23 00:41:44)
### No issue

**testing the unstable run 8**


[f0c7f794525d46c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f0c7f794525d46c) llrussel *2019-07-23 00:41:38*

**Changelog updated by Jenkins**


[d639ee6e2fdc9b3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d639ee6e2fdc9b3) svc-sid-jenkins *2019-07-23 00:39:41*

## 1.2.40 (2019-07-23 00:38:27)
### No issue

**testing the unstable run 7**


[b6be8a228fa4594](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b6be8a228fa4594) llrussel *2019-07-23 00:38:22*

**Changelog updated by Jenkins**


[bf97e77b349e263](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bf97e77b349e263) svc-sid-jenkins *2019-07-23 00:12:27*

## 1.2.37 (2019-07-23 00:11:12)
### No issue

**testing the unstable run 6**


[dd586cabf9bb466](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dd586cabf9bb466) llrussel *2019-07-23 00:11:12*

**testing the unstable run 5**


[ab2529f0f12e7c8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ab2529f0f12e7c8) llrussel *2019-07-22 23:51:01*

**Changelog updated by Jenkins**


[d73d01e63eaff13](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d73d01e63eaff13) svc-sid-jenkins *2019-07-22 23:46:29*

## 1.2.33 (2019-07-22 23:45:15)
### No issue

**testing the unstable run 4**


[72de8703f303915](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/72de8703f303915) llrussel *2019-07-22 23:45:10*

**Changelog updated by Jenkins**


[ad8f03ecaafea64](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ad8f03ecaafea64) svc-sid-jenkins *2019-07-22 23:36:08*

## 1.2.30 (2019-07-22 23:34:50)
### No issue

**testing the unstable run 3**


[e1d4a8b2cb76965](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e1d4a8b2cb76965) llrussel *2019-07-22 23:34:50*

**testing the unstable run 2**


[6540cacbf14016b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6540cacbf14016b) llrussel *2019-07-22 23:01:26*

**testing the unstable run**


[2b1fb2e7c28e255](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2b1fb2e7c28e255) llrussel *2019-07-22 22:55:31*

**all test are now passing**


[4f620b5b744543c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4f620b5b744543c) llrussel *2019-07-22 22:46:59*

**fixed another test**


[d6a747c7d34ac59](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d6a747c7d34ac59) llrussel *2019-07-22 22:41:49*

**check for unstable status**


[e7a64efbe8426f9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e7a64efbe8426f9) llrussel *2019-07-22 22:37:05*

**fix 3 of the 5 test.**


[ec0e399a6599373](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ec0e399a6599373) llrussel *2019-07-22 22:27:55*

**updates reporting**


[6b18a01acef50fe](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6b18a01acef50fe) llrussel *2019-07-22 22:13:50*

**Changelog updated by Jenkins**


[a79733553f74556](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a79733553f74556) svc-sid-jenkins *2019-07-22 21:29:08*

## 1.2.20 (2019-07-22 21:27:54)
### No issue

**testing the test reports**


[0d725853db78583](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0d725853db78583) llrussel *2019-07-22 21:27:48*

**Changelog updated by Jenkins**


[3777896a7070979](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/3777896a7070979) svc-sid-jenkins *2019-07-22 21:25:03*

## 1.2.17 (2019-07-22 21:23:46)
### No issue

**update stage post action 3**


[12afddb7ab35d10](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/12afddb7ab35d10) llrussel *2019-07-22 21:23:46*

**update stage post action 2**


[4a9bf7531593363](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4a9bf7531593363) llrussel *2019-07-22 21:21:37*

**Changelog updated by Jenkins**


[edd7224a183cc87](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/edd7224a183cc87) svc-sid-jenkins *2019-07-22 21:18:47*

## 1.2.13 (2019-07-22 21:17:32)
### No issue

**update stage post action**


[da25f417fdbaa71](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/da25f417fdbaa71) llrussel *2019-07-22 21:17:32*

**add the post action on the stage**


[6aebedc3bbfb5c7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6aebedc3bbfb5c7) llrussel *2019-07-22 21:09:11*

**Changelog updated by Jenkins**


[b97ce158b123ed9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b97ce158b123ed9) svc-sid-jenkins *2019-07-22 21:04:46*

## 1.2.9 (2019-07-22 21:03:31)
### No issue

**checking the build status**


[d24c8b88e792744](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d24c8b88e792744) llrussel *2019-07-22 21:03:25*

**Changelog updated by Jenkins**


[86b7b97ee6b0c07](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/86b7b97ee6b0c07) svc-sid-jenkins *2019-07-22 20:46:33*

## 1.2.6 (2019-07-22 20:45:11)
### No issue

**use the class object directly 10**


[d9d8f972f51dc0d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d9d8f972f51dc0d) llrussel *2019-07-22 20:45:11*

**use the class object directly 9**


[b6c4ed0df29160f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b6c4ed0df29160f) llrussel *2019-07-22 20:41:55*

**use the class object directly 8**


[2da78fd5c56517c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2da78fd5c56517c) llrussel *2019-07-22 20:40:32*

**use the class object directly 7**


[026ea8923c17dba](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/026ea8923c17dba) llrussel *2019-07-22 20:39:04*

**use the class object directly 6**


[55170419730ab4f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/55170419730ab4f) llrussel *2019-07-22 20:33:45*

**use the class object directly 5**


[159297dacd2c3ea](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/159297dacd2c3ea) llrussel *2019-07-22 20:31:57*

**use the class object directly 4**


[dcc2027521ce0e4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dcc2027521ce0e4) llrussel *2019-07-22 20:30:34*

**use the class object directly 3**


[406020a90e1cb8f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/406020a90e1cb8f) llrussel *2019-07-22 20:29:21*

**use the class object directly 2**


[313b30cdb78cf4c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/313b30cdb78cf4c) llrussel *2019-07-22 20:18:05*

**use the class object directly**


[bd36fa38b1fb5e9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bd36fa38b1fb5e9) llrussel *2019-07-22 20:16:40*

**add when to all step 7**


[4747b62a61543f4](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4747b62a61543f4) llrussel *2019-07-22 17:59:21*

**add when to all step 6**


[6e30172180e190f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6e30172180e190f) llrussel *2019-07-22 17:58:04*

**add when to all step 5**


[0934375edaa3276](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0934375edaa3276) llrussel *2019-07-22 17:55:35*

**add when to all step 4**


[63e2f113d33c5f1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/63e2f113d33c5f1) llrussel *2019-07-22 17:53:30*

**add when to all step 2**


[e565a341935a85d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e565a341935a85d) llrussel *2019-07-22 17:48:50*

**add when to all step**


[ebeafb0dd4856f6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ebeafb0dd4856f6) llrussel *2019-07-22 17:46:11*

**Changelog updated by Jenkins**


[31f9fa8e82c7fdf](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/31f9fa8e82c7fdf) svc-sid-jenkins *2019-07-22 17:35:09*

## 1.1.88 (2019-07-22 17:33:53)
### No issue

**testing when**


[72ce0d05dcba25b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/72ce0d05dcba25b) llrussel *2019-07-22 17:33:53*

**try this before agent thing2**


[8e0c8a96d4e02d2](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8e0c8a96d4e02d2) llrussel *2019-07-22 17:20:24*

**try this before agent thing**


[fd4b96dab283bcb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fd4b96dab283bcb) llrussel *2019-07-22 17:18:24*

**may have found a better way**


[c7c4ffbe0b9a842](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c7c4ffbe0b9a842) llrussel *2019-07-22 17:08:26*

**Changelog updated by Jenkins**


[72a795a236ed923](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/72a795a236ed923) svc-sid-jenkins *2019-07-22 16:34:07*

## 1.1.82 (2019-07-22 16:32:48)
### No issue

**deliberately checking in these broken test to verify if the pipeline breaks 2**


[8c59b4435e8076c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8c59b4435e8076c) llrussel *2019-07-22 16:32:42*

**Changelog updated by Jenkins**


[70a7bdf5de82ab8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/70a7bdf5de82ab8) svc-sid-jenkins *2019-07-22 16:27:56*

## 1.1.79 (2019-07-22 16:26:37)
### No issue

**deliberately checking in these broken test to verify if the pipeline breaks**


[ec60812a2a95e7e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ec60812a2a95e7e) llrussel *2019-07-22 16:26:37*

**run the check for build loop within the constructor 2**


[07d2e66b6afb86e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/07d2e66b6afb86e) llrussel *2019-07-22 16:20:49*

**run the check for build loop within the constructor**


[c85c6393e9fb156](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c85c6393e9fb156) llrussel *2019-07-22 16:19:03*

**Changelog updated by Jenkins**


[1b405206a775419](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1b405206a775419) svc-sid-jenkins *2019-07-22 15:38:01*

## 1.1.74 (2019-07-22 15:36:45)
### No issue

**check for build loop**


[31221472073a4bd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/31221472073a4bd) llrussel *2019-07-22 15:36:38*

**Changelog updated by Jenkins**


[2cf1435ba4441c1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2cf1435ba4441c1) svc-sid-jenkins *2019-07-22 15:12:04*

**update ReadMe**


[1d830c64e0f815c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1d830c64e0f815c) llrussel *2019-07-22 15:11:52*

## 1.1.70 (2019-07-22 15:10:03)
### No issue

**combined createVersionFile and generateChangeLog into a new**

* method thats does both called generateGitTagAndChangeLog.
* Update Unit test for this new method

[9a10a0778fb725b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9a10a0778fb725b) llrussel *2019-07-22 15:09:54*

**Changelog updated by Jenkins**


[e3153b2a4c3024c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e3153b2a4c3024c) svc-sid-jenkins *2019-07-22 15:09:30*

**generate tag and changelog together**


[08dc83c5d505dc6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/08dc83c5d505dc6) llrussel *2019-07-22 14:59:26*

**remove the changelog push**


[94d249b4dfec845](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/94d249b4dfec845) llrussel *2019-07-22 14:45:37*

**Changelog updated by Jenkins**


[1ba3f0accac779d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1ba3f0accac779d) svc-sid-jenkins *2019-07-22 14:44:11*

**Changelog updated by Jenkins**


[9317905812ccf7f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9317905812ccf7f) svc-sid-jenkins *2019-07-22 14:42:55*

**Changelog updated by Jenkins**


[db50a525b949c53](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/db50a525b949c53) svc-sid-jenkins *2019-07-22 14:41:38*

**Changelog updated by Jenkins**


[c681f63c05e9f01](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c681f63c05e9f01) svc-sid-jenkins *2019-07-22 14:40:25*

**Changelog updated by Jenkins**


[94c0b31cfb7666d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/94c0b31cfb7666d) svc-sid-jenkins *2019-07-22 14:39:09*

**Changelog updated by Jenkins**


[6c48fde671d652b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6c48fde671d652b) svc-sid-jenkins *2019-07-22 14:37:49*

**Changelog updated by Jenkins**


[536bef5269b0b52](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/536bef5269b0b52) svc-sid-jenkins *2019-07-22 14:36:37*

**Changelog updated by Jenkins**


[a7cbb0ba3334c9e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a7cbb0ba3334c9e) svc-sid-jenkins *2019-07-22 14:35:26*

**Changelog updated by Jenkins**


[9a60ba23e8bd172](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9a60ba23e8bd172) svc-sid-jenkins *2019-07-22 14:34:09*

**Changelog updated by Jenkins**


[fc945d414b4bff5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fc945d414b4bff5) svc-sid-jenkins *2019-07-22 14:32:51*

**Changelog updated by Jenkins**


[6c6420cc3dba043](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6c6420cc3dba043) svc-sid-jenkins *2019-07-22 14:31:33*

**Changelog updated by Jenkins**


[f90a4e51ad80e4c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f90a4e51ad80e4c) svc-sid-jenkins *2019-07-22 14:30:16*

**options didnt quite work**


[4d10313a06f4822](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4d10313a06f4822) llrussel *2019-07-22 14:25:31*

**trying stage options again**


[7fa977fbec7ed62](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7fa977fbec7ed62) llrussel *2019-07-22 14:15:00*

**Changelog updated by Jenkins**


[6b7a3200d4a9422](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6b7a3200d4a9422) svc-sid-jenkins *2019-07-22 14:12:34*

**seeing if the job level config worked**


[364493c579c5c67](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/364493c579c5c67) llrussel *2019-07-22 14:12:18*

**Changelog updated by Jenkins**


[27bd22650c241ff](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/27bd22650c241ff) svc-sid-jenkins *2019-07-22 14:11:25*

**Changelog updated by Jenkins**


[dcb6c5709d44c69](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dcb6c5709d44c69) svc-sid-jenkins *2019-07-22 14:10:10*

**Changelog updated by Jenkins**


[1dd2921419f9ffd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1dd2921419f9ffd) svc-sid-jenkins *2019-07-22 14:08:51*

**Changelog updated by Jenkins**


[9d807e9f9ab4c03](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9d807e9f9ab4c03) svc-sid-jenkins *2019-07-22 14:07:29*

**Changelog updated by Jenkins**


[f87281eacc1e1e5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f87281eacc1e1e5) svc-sid-jenkins *2019-07-22 14:06:15*

**Changelog updated by Jenkins**


[6d2de6d67b93a9d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6d2de6d67b93a9d) svc-sid-jenkins *2019-07-22 14:05:01*

**Changelog updated by Jenkins**


[d1f92568e430c3b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d1f92568e430c3b) svc-sid-jenkins *2019-07-22 14:03:43*

**Changelog updated by Jenkins**


[c220027bab3575f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c220027bab3575f) svc-sid-jenkins *2019-07-22 14:02:31*

**Changelog updated by Jenkins**


[2593afc4646454e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2593afc4646454e) svc-sid-jenkins *2019-07-22 14:01:17*

**Changelog updated by Jenkins**


[8699ce42515aa3e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8699ce42515aa3e) svc-sid-jenkins *2019-07-22 14:00:04*

**Changelog updated by Jenkins**


[ec0dec72bf6e72e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ec0dec72bf6e72e) svc-sid-jenkins *2019-07-22 13:58:58*

**Changelog updated by Jenkins**


[30af537dd3d41bf](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/30af537dd3d41bf) svc-sid-jenkins *2019-07-22 13:57:45*

**Changelog updated by Jenkins**


[796a30ad150390d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/796a30ad150390d) svc-sid-jenkins *2019-07-22 13:56:33*

**Changelog updated by Jenkins**


[0ca5ad36d6c4276](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0ca5ad36d6c4276) svc-sid-jenkins *2019-07-22 13:54:58*

**Changelog updated by Jenkins**


[bfe4f75a2a62944](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bfe4f75a2a62944) svc-sid-jenkins *2019-07-22 13:53:34*

**Changelog updated by Jenkins**


[a0766f7fbfdd6bc](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a0766f7fbfdd6bc) svc-sid-jenkins *2019-07-22 13:52:30*

**try pulling up env variable 3**


[db8dfa77c079b5b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/db8dfa77c079b5b) llrussel *2019-07-22 13:51:48*

**Changelog updated by Jenkins**


[8130801e7a6c5d6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8130801e7a6c5d6) svc-sid-jenkins *2019-07-22 13:51:24*

**Changelog updated by Jenkins**


[2c4b23e1df1135b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2c4b23e1df1135b) svc-sid-jenkins *2019-07-22 13:50:17*

**Changelog updated by Jenkins**


[f43b609d650c111](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f43b609d650c111) svc-sid-jenkins *2019-07-22 13:49:08*

**Changelog updated by Jenkins**


[34104848d37305e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/34104848d37305e) svc-sid-jenkins *2019-07-22 13:48:04*

**Changelog updated by Jenkins**


[7bf9032a4726f35](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7bf9032a4726f35) svc-sid-jenkins *2019-07-22 13:46:59*

**Changelog updated by Jenkins**


[e34e32d83ac15ee](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e34e32d83ac15ee) svc-sid-jenkins *2019-07-22 13:45:54*

**Changelog updated by Jenkins**


[b55f35a38567e95](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b55f35a38567e95) svc-sid-jenkins *2019-07-22 13:44:48*

**Changelog updated by Jenkins**


[0b5c5e497fc7aa6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0b5c5e497fc7aa6) svc-sid-jenkins *2019-07-22 13:43:42*

**Changelog updated by Jenkins**


[70af9dc64671660](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/70af9dc64671660) svc-sid-jenkins *2019-07-22 13:42:37*

**Changelog updated by Jenkins**


[fe0feba6a2c4d17](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fe0feba6a2c4d17) svc-sid-jenkins *2019-07-22 13:41:34*

**Changelog updated by Jenkins**


[858f5a17f92c420](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/858f5a17f92c420) svc-sid-jenkins *2019-07-22 13:40:33*

**Changelog updated by Jenkins**


[e63751210dcf004](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e63751210dcf004) svc-sid-jenkins *2019-07-22 13:39:10*

**Changelog updated by Jenkins**


[56dc612c467abc6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/56dc612c467abc6) svc-sid-jenkins *2019-07-22 13:37:36*

**Changelog updated by Jenkins**


[4c0b70f88bf2bc8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4c0b70f88bf2bc8) svc-sid-jenkins *2019-07-22 13:36:34*

**Changelog updated by Jenkins**


[28e1380537fde5b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/28e1380537fde5b) svc-sid-jenkins *2019-07-22 13:35:33*

**Changelog updated by Jenkins**


[d80a9f60673feaa](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d80a9f60673feaa) svc-sid-jenkins *2019-07-22 13:34:32*

**Changelog updated by Jenkins**


[d07d2dbe5533b05](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d07d2dbe5533b05) svc-sid-jenkins *2019-07-22 13:33:24*

**Changelog updated by Jenkins**


[a5b582699a160ea](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a5b582699a160ea) svc-sid-jenkins *2019-07-22 13:32:17*

**Changelog updated by Jenkins**


[fa0d4dff9c313b5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fa0d4dff9c313b5) svc-sid-jenkins *2019-07-22 13:31:07*

**try pulling up env variable 2**


[10f320f41af8358](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/10f320f41af8358) llrussel *2019-07-22 13:30:34*

**Changelog updated by Jenkins**


[5e2f405275e0811](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5e2f405275e0811) svc-sid-jenkins *2019-07-22 13:29:57*

**Changelog updated by Jenkins**


[a452649c7891ea6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a452649c7891ea6) svc-sid-jenkins *2019-07-22 13:28:50*

**Changelog updated by Jenkins**


[08670cf2014b376](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/08670cf2014b376) svc-sid-jenkins *2019-07-22 13:27:45*

**Changelog updated by Jenkins**


[221e0d054629387](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/221e0d054629387) svc-sid-jenkins *2019-07-22 13:26:38*

**Changelog updated by Jenkins**


[4ffe61adf9360da](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4ffe61adf9360da) svc-sid-jenkins *2019-07-22 13:25:33*

**Changelog updated by Jenkins**


[a6500663ba81255](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a6500663ba81255) svc-sid-jenkins *2019-07-22 13:24:19*

**Changelog updated by Jenkins**


[4f8d19616451e09](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4f8d19616451e09) svc-sid-jenkins *2019-07-22 13:23:11*

**Changelog updated by Jenkins**


[6742c91265b2b18](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6742c91265b2b18) svc-sid-jenkins *2019-07-22 13:22:02*

**Changelog updated by Jenkins**


[c77be3b4ba2427d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c77be3b4ba2427d) svc-sid-jenkins *2019-07-22 13:20:51*

**Changelog updated by Jenkins**


[be8400105c13624](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/be8400105c13624) svc-sid-jenkins *2019-07-22 13:19:41*

**try pulling up env variable**


[c138f070b84e1f8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c138f070b84e1f8) llrussel *2019-07-22 13:19:39*

**Changelog updated by Jenkins**


[2296cc163c56a66](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2296cc163c56a66) svc-sid-jenkins *2019-07-22 13:18:34*

**Changelog updated by Jenkins**


[9f1446527f3728e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9f1446527f3728e) svc-sid-jenkins *2019-07-22 13:17:29*

**Changelog updated by Jenkins**


[1b9fd825d7c3868](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1b9fd825d7c3868) svc-sid-jenkins *2019-07-22 13:16:19*

**Changelog updated by Jenkins**


[0e8ab91808b31b7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0e8ab91808b31b7) svc-sid-jenkins *2019-07-22 13:15:10*

**Changelog updated by Jenkins**


[d413bdec810eeb9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d413bdec810eeb9) svc-sid-jenkins *2019-07-22 13:14:01*

**Changelog updated by Jenkins**


[6a060c521c31d23](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6a060c521c31d23) svc-sid-jenkins *2019-07-22 13:12:50*

**Changelog updated by Jenkins**


[f0bd1dc575f3bdd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f0bd1dc575f3bdd) svc-sid-jenkins *2019-07-22 13:11:37*

**Changelog updated by Jenkins**


[7fe68fde666cd38](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7fe68fde666cd38) svc-sid-jenkins *2019-07-22 13:10:31*

**Changelog updated by Jenkins**


[2932c041b5667be](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2932c041b5667be) svc-sid-jenkins *2019-07-22 13:09:21*

**Changelog updated by Jenkins**


[dbef7dda45fc6af](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/dbef7dda45fc6af) svc-sid-jenkins *2019-07-22 13:08:13*

**Changelog updated by Jenkins**


[84982c4aca5a53d](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/84982c4aca5a53d) svc-sid-jenkins *2019-07-22 13:07:06*

**Changelog updated by Jenkins**


[847f3bcc8feb97f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/847f3bcc8feb97f) svc-sid-jenkins *2019-07-22 13:05:56*

**Changelog updated by Jenkins**


[ec74c9a42fe619e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ec74c9a42fe619e) svc-sid-jenkins *2019-07-22 13:04:46*

**Changelog updated by Jenkins**


[5405ddd22105847](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5405ddd22105847) svc-sid-jenkins *2019-07-22 13:03:38*

**Changelog updated by Jenkins**


[be9b5c9935c58a7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/be9b5c9935c58a7) svc-sid-jenkins *2019-07-22 13:02:32*

**Changelog updated by Jenkins**


[9f69bf1973e2805](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9f69bf1973e2805) svc-sid-jenkins *2019-07-22 13:01:26*

**Changelog updated by Jenkins**


[fa51c20f6bf94a9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fa51c20f6bf94a9) svc-sid-jenkins *2019-07-22 13:00:17*

**slight shifting a=of function calls**


[5324b160c8d0abd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5324b160c8d0abd) llrussel *2019-07-22 12:59:47*

**Changelog updated by Jenkins**


[f70db2aa6f1ea17](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f70db2aa6f1ea17) svc-sid-jenkins *2019-07-22 12:59:05*

**Changelog updated by Jenkins**


[c17a51aac49ae63](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c17a51aac49ae63) svc-sid-jenkins *2019-07-22 12:57:49*

**Changelog updated by Jenkins**


[9f105ccb427965c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9f105ccb427965c) svc-sid-jenkins *2019-07-22 12:56:33*

**trying a cleaner look 2**


[c599498f3fbc4a9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c599498f3fbc4a9) llrussel *2019-07-22 12:55:12*

**Changelog updated by Jenkins**


[ce92c0f0aeb80fb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ce92c0f0aeb80fb) svc-sid-jenkins *2019-07-22 12:46:04*

**trying a cleaner look**


[f671d64c0eaece6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f671d64c0eaece6) llrussel *2019-07-22 12:44:41*

**Changelog updated by Jenkins**


[0d41be813a454ef](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0d41be813a454ef) svc-sid-jenkins *2019-07-22 12:38:49*

**trying i direct clone**


[93d5340dd5895f5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/93d5340dd5895f5) llrussel *2019-07-22 12:37:27*

**Changelog updated by Jenkins**


[500179baa9db8f5](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/500179baa9db8f5) svc-sid-jenkins *2019-07-22 12:30:24*

**use the checkOutFrom method again**


[810e49b56c45cb1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/810e49b56c45cb1) llrussel *2019-07-22 12:29:08*

**remove stage option**


[76cd8e16a781da8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/76cd8e16a781da8) llrussel *2019-07-22 12:20:15*

**use stage option**


[fbf8305521adc5f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fbf8305521adc5f) llrussel *2019-07-22 12:10:51*

**remove the checkout master option**


[30e4e3a03f7435f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/30e4e3a03f7435f) llrussel *2019-07-22 12:06:57*

**fix broken test**


[021ec1da29fcc56](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/021ec1da29fcc56) llrussel *2019-07-22 12:03:41*

**add change to break the build on test failures**


[06ffed287b0f901](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/06ffed287b0f901) llrussel *2019-07-22 11:55:15*

**more test**


[0a0165203f845d2](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0a0165203f845d2) llrussel *2019-07-22 06:26:22*

**trying a evn variable**


[7b09a8d79bf30e1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7b09a8d79bf30e1) llrussel *2019-07-22 06:16:09*

**set some global git config**


[2a72bd3c92ba6e6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2a72bd3c92ba6e6) llrussel *2019-07-22 06:05:16*

**set sslVerify globally**


[10d10c45ccd68d2](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/10d10c45ccd68d2) llrussel *2019-07-22 06:00:48*

**set hub.protocol**


[fa9b4ae15ac239f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fa9b4ae15ac239f) llrussel *2019-07-22 05:57:49*

**a follow up disable ssl verify for tag pushing**


[fb419966b6177f9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fb419966b6177f9) llrussel *2019-07-22 05:51:07*

**disable ssl verify for tag pushing**


[b064fcf93e8fbf8](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b064fcf93e8fbf8) llrussel *2019-07-22 05:44:22*

**try git push --follow-tags to push tags**


[a89cdc3c2aa8b39](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a89cdc3c2aa8b39) llrussel *2019-07-22 05:38:41*

**delete tag if it already exist locally before recreating**


[4bf0832304c9772](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4bf0832304c9772) llrussel *2019-07-22 05:25:11*

**use chekout pipeline options**


[1d1dea4628eecfd](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1d1dea4628eecfd) llrussel *2019-07-22 05:18:51*

**reverted to test with multibranch**


[1b06dde75bc7c38](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1b06dde75bc7c38) llrussel *2019-07-22 05:14:32*

**why so wonky**


[46274ef39f2f177](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/46274ef39f2f177) llrussel *2019-07-22 05:10:14*

**git checkout with small -b**


[c8b89f9fccedc79](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c8b89f9fccedc79) llrussel *2019-07-22 05:08:18*

**return to git checkout**


[aa54ee6f674b0ab](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/aa54ee6f674b0ab) llrussel *2019-07-22 05:05:59*

**Changelog updated by Jenkins**


[4fe829fac1692d0](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4fe829fac1692d0) svc-sid-jenkins *2019-07-22 05:04:27*

**trying something 2**


[227fa9274345679](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/227fa9274345679) llrussel *2019-07-22 05:03:12*

**trying something**


[8c6f49da578e753](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/8c6f49da578e753) llrussel *2019-07-22 05:01:06*

**removed checkoutFrom step**


[365868eacef2c19](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/365868eacef2c19) llrussel *2019-07-22 04:56:02*

**use checkoutToSubdirectory('foo')**


[9c0a4b06e2346cb](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9c0a4b06e2346cb) llrussel *2019-07-22 04:54:34*

**testing with checkout scm 3**


[526874213bc7da6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/526874213bc7da6) llrussel *2019-07-22 04:52:12*

**testing with checkout scm 2**


[f85d0d9db5f82de](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f85d0d9db5f82de) llrussel *2019-07-22 04:38:01*

**testing with checkout scm**


[a3c026ce9a73811](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a3c026ce9a73811) llrussel *2019-07-22 04:35:56*

**testing with checkout**


[457e7974f4c0254](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/457e7974f4c0254) llrussel *2019-07-22 04:33:41*

**testing with scm**


[b46fa61a731f567](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b46fa61a731f567) llrussel *2019-07-22 04:30:19*

**update test to support change to use -B in git checkout**


[efc812e14f950f1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/efc812e14f950f1) llrussel *2019-07-22 04:28:20*

**change to use -B in git checkout**


[464b27ec52acab7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/464b27ec52acab7) llrussel *2019-07-22 04:08:10*

**Update all steps that needs to be on master to use the direct git call from the shell.**


[b3f620c486c7060](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b3f620c486c7060) llrussel *2019-07-22 04:02:09*

## 1.1.66 (2019-07-22 15:09:25)
### No issue

**Changelog updated by Jenkins**


[4cf90e85f161554](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/4cf90e85f161554) svc-sid-jenkins *2019-07-22 15:09:25*

**Changelog updated by Jenkins**


[ed687a8b7cb5522](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/ed687a8b7cb5522) svc-sid-jenkins *2019-07-22 15:08:05*

## 1.1.64 (2019-07-22 15:08:00)
### No issue

**Changelog updated by Jenkins**


[9bdc0257db48b61](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9bdc0257db48b61) svc-sid-jenkins *2019-07-22 15:08:00*

**Changelog updated by Jenkins**


[2cb6e514978b14f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/2cb6e514978b14f) svc-sid-jenkins *2019-07-22 15:06:38*

**Changelog updated by Jenkins**


[c2f4d7fa2d081df](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/c2f4d7fa2d081df) svc-sid-jenkins *2019-07-22 15:06:33*

**Changelog updated by Jenkins**


[322d2e51e466b4e](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/322d2e51e466b4e) svc-sid-jenkins *2019-07-22 15:05:04*

**Changelog updated by Jenkins**


[83fc56399700ab6](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/83fc56399700ab6) svc-sid-jenkins *2019-07-22 15:04:58*

**Changelog updated by Jenkins**


[7bbe326f5a002ea](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/7bbe326f5a002ea) svc-sid-jenkins *2019-07-22 15:03:37*

**Changelog updated by Jenkins**


[1b7087d3d3d663a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/1b7087d3d3d663a) svc-sid-jenkins *2019-07-22 15:03:32*

**Changelog updated by Jenkins**


[49580165be65594](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/49580165be65594) svc-sid-jenkins *2019-07-22 15:02:10*

**Changelog updated by Jenkins**


[fdac5708eaf7347](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fdac5708eaf7347) svc-sid-jenkins *2019-07-22 15:02:05*

**Changelog updated by Jenkins**


[95ca5e995b062ef](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/95ca5e995b062ef) svc-sid-jenkins *2019-07-22 15:00:44*

**Changelog updated by Jenkins**


[a7bf4cd55d77529](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/a7bf4cd55d77529) svc-sid-jenkins *2019-07-22 15:00:40*

## 1.0.0 (2019-07-22 03:59:13)
### No issue

**Changelog updated by Jenkins**


[bca526c2241afdc](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/bca526c2241afdc) svc-sid-jenkins *2019-07-22 03:59:13*

**directly call git checkout**


[d465ad0f350c1f1](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d465ad0f350c1f1) llrussel *2019-07-22 03:57:58*

**more troubleshooting**


[fe8b7f894c72746](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/fe8b7f894c72746) llrussel *2019-07-22 03:47:32*

**try using branch specifier**


[cfb94116e2e560b](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/cfb94116e2e560b) llrussel *2019-07-22 03:38:28*

**echo repo name to troubleshoot**


[e2521cf7aab1280](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/e2521cf7aab1280) llrussel *2019-07-22 03:17:05*

**generateChangeLog was missing the return this for chaining**


[d167c09e693eb1f](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/d167c09e693eb1f) llrussel *2019-07-22 03:11:26*

**trying to run step without the checkout step**


[65d7ec9f249bfe9](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/65d7ec9f249bfe9) llrussel *2019-07-22 02:58:03*

**use env.VAR type environment variable**


[02eeb1392ef548c](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/02eeb1392ef548c) llrussel *2019-07-22 02:53:46*

**set environment variable GITHUB_REPO**


[b822b63689a0f31](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/b822b63689a0f31) llrussel *2019-07-22 02:39:42*

**short term removal of the when condition until we setup multibranch**


[9d651a8919128c3](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/9d651a8919128c3) llrussel *2019-07-22 02:35:03*

**update test build script config**


[f5cf668626d5895](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/f5cf668626d5895) llrussel *2019-07-22 02:25:57*

**add unit test for all function calls**


[5d4a9002c70e560](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/5d4a9002c70e560) llrussel *2019-07-22 01:58:56*

**set steps to be local variables instead of globally**


[0799ab922512af7](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/0799ab922512af7) llrussel *2019-07-21 22:17:00*

**add gradle wrapper and fixed contextregistry import**


[776c3004b4e6d95](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/776c3004b4e6d95) llrussel *2019-07-21 22:00:10*

**First Major CheckIn:**

* Add techOpsPipelineStep class to facilitate more complex logic for pipelines
* Add Unit test framework for testing shared-library
* Add few Unit test to get the ball rolling
* Add JenkinsFile

[6a9af950796502a](https://git.uscis.dhs.gov/USCIS/pcim-jenkins-shared-library/commit/6a9af950796502a) llrussel *2019-07-21 21:43:35*

         