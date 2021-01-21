package com.jjh.full

import com.jjh.ops.Quantity

data class Quantity(val value: Int) {
    operator fun plus(other: Quantity): Quantity = Quantity(value + other.value)
    operator fun minus(other: Quantity): Quantity = Quantity(value - other.value)
    operator fun times(other: Quantity): Quantity = Quantity(value * other.value)
    operator fun div(other: Quantity): Quantity = Quantity(value / other.value)
    operator fun rem(other: Quantity): Quantity = Quantity(value % other.value)

    fun compareTo(other: Quantity): Int = value.compareTo(other.value)
}
