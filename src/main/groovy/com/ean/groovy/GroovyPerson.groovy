package com.ean.groovy

import groovy.transform.Canonical

/**
 *
 */
class GroovyPerson extends Person {

  String job

  boolean isHipster() {
    assert firstName && lastName
    firstName.toLowerCase() == "idiot" && lastName.toLowerCase() == "hipster"
  }

}
