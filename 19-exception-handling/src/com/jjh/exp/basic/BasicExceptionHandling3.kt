package com.jjh.exp.basic

fun main() {
    try {
        runcalc(5)
    } catch(exp: Exception) {
        println("Opps")
        println(exp)
        println(exp.message)
        exp.printStackTrace()
    }
}