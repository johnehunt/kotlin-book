package com.jjh.full

data class Quantity(val value: Int) {
    operator fun plus(other: Quantity): Quantity = Quantity(value + other.value)
    operator fun minus(other: Quantity): Quantity = Quantity(value - other.value)

    operator fun times(i: Int): Quantity = Quantity(value * i)
    operator fun div(i: Int): Quantity = Quantity(value / i)
    operator fun rem(i: Int): Quantity = Quantity(value % i)

    operator fun compareTo(other: Quantity): Int = value.compareTo(other.value)

    operator fun inc(): Quantity = Quantity(value + 1)
    operator fun dec(): Quantity = Quantity(value - 1)

}

fun main() {
    val q1 = Quantity(5)
    val q2 = Quantity(10)
    println("q1 = $q1, q2 = $q2")

    println("q1 + q2 = ${q1 + q2}")
    println("q2 - q1 = ${q2 - q1}")
    println("q2 * 3 = ${q2 * 3}")
    println("q2 / 2 = ${q2 / 2}")
    println("q2 % 3 = ${q2 % 3}")

    println("--------------------")

    println("q1 < q2: ${q1 < q2}")
    println("q1 < q2: ${q1 <= q2}")
    println("q1 < q2: ${q1 == q2}")
    println("q1 < q2: ${q1 != q2}")
    println("q1 < q2: ${q1 > q2}")
    println("q1 < q2: ${q1 >= q2}")
}