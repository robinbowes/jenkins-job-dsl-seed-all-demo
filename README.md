# jenkins-job-dsl-seed-all-demo

## Overview

Example of using a seed-all job with the Jenkins job DSL plugin

## Requirements

* [jenkins](https://jenkins.io/)
* [job DSL plugin](https://wiki.jenkins-ci.org/display/JENKINS/Job+DSL+Plugin)
* [git plugin](https://wiki.jenkins-ci.org/display/JENKINS/Git+Plugin)

## Setup

1. Create a new job
2. Name it "Seed All"
  * can be anything, but must be same as contained in `seed_all.groovy`
3. Choose "Freestyle project"
4. Click "OK"
5. Under "Source Code Management", choose "git"
6. In "Repository URL", enter the URL of this repository
7. Under "Build", click the "Add build step" drop-down and choose "Process Job DSLs"
8. Select "Look on Filesystem"
9. In "DSL Scripts", enter `jobs/seed_all.groovy`
10. Click "Save"
11. Click "Build now"
  * You should see a single job named "Seed All"
12. Run the "Seed All" job
  * The job will pull in the remote repo and replace itself using the configuration defined in seed_all.groovy
13. Return to the dashboard.
  * There should still only be a single job named "Seed All"
14. Run the "Seed All" job
..* The job will run again and create a job named "Hello World"
15. Refresh the view (of the Dashboard)
  * There should now be two jobs:
    * the original "Seed All" job
    * the new "Hello World" job
