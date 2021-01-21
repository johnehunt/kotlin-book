package com.jjh.exp.raise

fun functionBang() {
    println("entering functionBang")
    throw RuntimeException("Bang!")
    println("exiting functionBang")
}

fun main() {
    try {
        functionBang()
    } catch (exp: RuntimeException) {
        println(exp.message)
        throw exp
    }
}