package com.jjh.util

object MathUtils3 {

    val myLazyString: String by lazy { "Hello" }

    val pi: Double by lazy {
        (3.0 + 4.0/(2*3*4) - 4.0/(4*5*6) + 4/(6*7*8) - 4/(8*9*10))
    }

}

fun main() {
    println(MathUtils3.myLazyString)
    println(MathUtils3.pi)
}