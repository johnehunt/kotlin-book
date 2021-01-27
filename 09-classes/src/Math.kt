package com.jjh.util

class Math {

    fun max(x: Int, y: Int): Int {
        return if (x > y) {
            x
        } else {
            y
        }
    }

    fun max2(x: Int, y: Int): Int = if (x > y) x else y

    fun add(x: Int, y: Int = 1): Int = x + y

    fun print(): Unit {
        println("math")
    }

    fun asString(): String {
        return "Math"
    }

    fun negate(value: Int): Int = -value

    fun negate2(value: Int) = -value

    fun printer1(i: Int) {
        println(i)
    }

    fun printer2(i: Int): Unit = println(i)
    fun printer3(i: Int) = println(i)


}

fun main() {
    val math = Math()

    println("math.max(3, 4): " + math.max(3, 4))
    println("math.max(3, y=4): " + math.max(3, y = 4))
    println("math.max(x=3, y=4): " + math.max(x = 3, y = 4))
    println("math.max(y=3, x=4): " + math.max(y = 3, x = 4))

    // Can't use positional after named
    // println("math.max(x=3, 4): "     + math.max(x=3, 4)) // valid in kotlin 1.4
    // invalid as positional param is assumed to be x
    // println("math.max(4, x=3): " + math.max(4, x=3))

    println("math.add(5, 3): ${math.add(5, 3)}")
    println("math.add(5): ${math.add(5)}")

    math.print()
    println("math.asString(): ${math.asString()}")
    println("math.negate(2): ${math.negate(2)}")
}