package com.jjh.ops

data class Counter(var value: Int) {
    operator fun plusAssign(c: Counter) {
        value += c.value
    }

    operator fun minusAssign(c: Counter) {
        value += c.value
    }

    operator fun plus(other: Quantity) { value = value + other.value }
    operator fun minus(other: Quantity) { value = value - other.value }
    operator fun plus(other: Int) { value = value + other }
    operator fun minus(other: Int) { value = value - other }

}

fun main() {

    val c1 = Counter(1)
    val c2 = Counter(5)

    c2 += c1
    println("c2 += c1: $c2")
}
