package org.scmresearch66.Point;

def removeTrailingSlash(String myString) {
  if (myString.endsWith("/")) {
    return myString.substring(0, myString.length() - 1);
  }
  return myString
}

return this;
