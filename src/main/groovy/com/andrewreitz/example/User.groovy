package com.andrewreitz.example

import groovy.transform.CompileStatic
import groovy.transform.Immutable

@Immutable
@CompileStatic
class User {
  final String firstName
  final String lastName
}
