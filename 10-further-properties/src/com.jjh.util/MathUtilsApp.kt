package com.jjh.util

fun main() {
    // Now uses singleton object to access methods
    println("MathUtils.ZERO: ${MathUtils.ZERO}")
    println("MathUtils.MIN: ${MathUtils.MIN}")
    println("MathUtils.MAX: ${MathUtils.MAX}")

    println("MathUtils.add(2, 3): ${MathUtils.add(2, 3)}")
    println("MathUtils.sub(6, 2): ${MathUtils.sub(6, 2)}")
}
