package com.jjh.inlinecls

/**
 * An inline class must have a single val property initialized in the primary constructor.
 * At runtime, instances of the inline class will be represented using this single property.
 *
 * inline classes cannot have init blocks
 * inline class properties cannot have backing fields
 * inline classes can only have simple computable properties (no lateinit/delegated properties)
 *
 * Inline classes are available only since Kotlin 1.3 and currently experimental.
 */
inline class Name(val value: String) {

    val length: Int
        get() = value.length

    fun greet() {
        println("Hello, $value")
    }
}

fun main() {
    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method
}