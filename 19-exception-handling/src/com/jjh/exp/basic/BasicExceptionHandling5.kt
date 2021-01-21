package com.jjh.exp.basic

fun main() {
    println("Starting")
    try {
        println("Before the call to divide")
        val result = divide(6,2)
        println("After the call to divide: $result")
    } catch (exp: ArithmeticException) {
        println("Opps")
    } finally {
        println("Always runs")
    }
    println("Done")
}