package com.jjh.containers

fun main() {
    val data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data; $data")

    val result = data.fold(0){total, element -> total + element}
    println("result: $result")

    fun adder(total: Int, value: Int) = total + value
    val result2 = data.fold(0, ::adder)
    println("result2: $result2")
}