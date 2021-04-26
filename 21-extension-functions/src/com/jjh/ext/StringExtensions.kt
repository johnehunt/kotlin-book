package com.jjh.ext

/**
 * Extension Functions - aka Pimp My type
 */
fun String.hasLength(len: Int) = this.length == len

fun String.mult(len: Int): String {
    var result = ""
    for (i in 0..len) {
        result += this
    }
    return result
}

/**
Extension Properties
 */
val String.size get() = this.length

fun main() {

    val s = "John"

    println("s.hasLength(4): ${s.hasLength(4)}")

    println("-".mult(25))

    println("s.size: ${s.size}")
}
