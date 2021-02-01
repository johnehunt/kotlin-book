package com.jjh.ext

// Infix operators
// Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call). Infix functions must satisfy the following requirements:
//
// * They must be member functions or extension functions;
// * They must have a single parameter;
// * The parameter must not accept variable number of arguments and must have no default value.

infix fun String.m(len: Int): String {
    var result: String = ""
    for (i in 0..len) {
        result += this
    }
    return result
}

fun main() {
    val s = "John"

    // Infix operator example
    println("-" m 25)
    // same as
    println("-".m(25))

    // Note infix function calls have
    // lower precedence than arithmetic operators
    println("-" m 2 + 3) // same as "-" m 5
}