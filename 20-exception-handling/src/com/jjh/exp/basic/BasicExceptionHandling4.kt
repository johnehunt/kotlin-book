package com.jjh.exp.basic

fun divide(x: Int, y: Int): Int {
    println("entering divide($x, $y)")
    val result = x / y
    println("exiting divide $result")
    return result
}

fun main() {
    println("Starting")
    try {
        println("Before the call to divide")
        val result = divide(6,0)
        println("After the call to divide: $result")
    } catch (exp: ArithmeticException) {
        println("Opps")
    }
    println("Done")
}