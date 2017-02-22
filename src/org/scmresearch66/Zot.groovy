package org.scmresearch66;

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}
