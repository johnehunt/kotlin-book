package com.jjh.util

/**
 * Object illustrating common object data
 * and behaviour. Also illustrates use of const
 *
 * val is read-only means immutable that is known at run-time
 * const val means immutable that is known at compile-time
 */
object MathUtils2 {

    // Specifying useful compile-time constant properties
    const val ZERO = 0
    const val MIN: Int = -100
    const val MAX = 100

    // Providing utility method
    fun add(x: Int, y: Int) {
        println(x + y)
    }
    fun sub(x: Int, y: Int) {
        println(x - y)
    }
}