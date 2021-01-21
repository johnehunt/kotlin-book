package com.jjh.exp.expressions

fun main() {
    val result = try {
        Rational(5, 0)
    } catch (exp: RuntimeException) {
        Rational(5, 1)
    }
    println(result)

    val result2 = func2()
    println("result2: $result2")
}

fun func() = try {
    Rational(5, 0)
} catch (exp: RuntimeException) {
    Rational(5, 1)
}

fun func2() = try {
    throw RuntimeException("oops")
} catch (e: RuntimeException) {
    3
} catch (e: Throwable) {
    0
} finally {
    2
}


