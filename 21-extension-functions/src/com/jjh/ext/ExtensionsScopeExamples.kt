package com.jjh.ext

/**
 * Class used to encapsulate extensions
 */
class MyClass {
    // Extension function for a String
    // But only accessible from within class
    fun String.rev(): String {
        return this.reversed()
    }
    fun printMe(s: String) {
        println(s.rev())
    }
}

/**
 * Can also encapsulate extensions within an object
 */
object MyObject {
    fun String.rev(): String {
        return this.reversed()
    }
    fun printMe(s: String) {
        println(s.rev())
    }
}
