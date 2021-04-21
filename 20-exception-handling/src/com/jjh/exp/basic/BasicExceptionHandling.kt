package com.jjh.exp.basic

fun runcalc(x: Int){
    x / 0
}

fun main() {
    try {
        runcalc(5)
    } catch(exp: Exception) {
        println("Opps")
        exp.printStackTrace()
    }
}