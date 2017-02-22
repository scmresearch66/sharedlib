package org.scmresearch66;

def checkOutFrom(repo) {
   echo "Here"

   def causes = currentBuild.rawBuild.getCauses()
   def specificCause = currentBuild.rawBuild.getCause(hudson.model.Cause$UserIdCause)

   echo "${causes}"
   echo "${specificCause}"
}
