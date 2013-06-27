package com.ean.groovy


def p = new Person()

println p

thing = new Person( firstName: 'thing', lastName: 'wibble')

println thing

String.metaClass.getFullName = { "${delegate.firstName} ${delegate.lastName}" }

println thing.fullName


