package com.jjh.exp.expressions

fun main() {
    val result = try {
        Rational(5, 0)
    } catch (exp: RuntimeException) {
        Rational(5, 1)
    }
    println(result)

    val result1 = try {
        throw RuntimeException("oops")
    } catch (e: RuntimeException) {
        3
    } catch (e: Throwable) {
        0
    } finally {
        2
    }
    println("result1: $result1")

    val result2 = func()
    println("result2: $result2")
}

fun func() = try {
        Rational(5, 0)
    } catch (exp: RuntimeException) {
        Rational(5, 1)
    }



