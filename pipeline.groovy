#!groovy
// This is the initial seed job for venicegeo which creates all of ther
// other pipeline jobs. Each repo must contain a JenkinsFile
// that denotes the steps to take when building.

import beachfront
evaluate(new File("./beachfront.groovy"))
evaluate(new File("./piazza.groovy"))

