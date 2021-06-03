package com.jjh.collections

fun <T> printer(item: T) {
    print(item)
}

fun main() {
    // Explicitly specifying the type
    printer<String>("Jasmine")
    printer<Int>(42)

    // Using type inference for the type
    printer("Jasmine")
    printer(42)
}