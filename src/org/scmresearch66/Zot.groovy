package org.scmresearch66;

def checkOutFrom(repo) {
   echo "Here"

   def causes = currentBuild.rawBuild.getCauses()

   echo "${causes}"
}
