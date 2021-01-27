package com.jjh.exp.chained

class DivideByYWhenZeroException(
                          message: String = "",
                          cause: Throwable? = null) : Exception(message, cause)


fun divide(x: Int, y: Int): Int {
    try {
        return x / y
    } catch (exp: ArithmeticException) {
        throw DivideByYWhenZeroException("Divide by Zero", exp)
    }
}

fun main() {
    divide(6, 0)
}