package com.jjh.containers

fun main() {

    fun increment(i: Int) = i + 1

    val data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data: $data")

    // Apply a named function via map
    val d1 = data.map(::increment)
    println("d1: $d1")

    // Apply an anonymous function via map
    val d2 = data.map(fun(i: Int) = i + 1)
    println("d2: $d2")

    // Apply a lambda function via map
    val d3 = data.map { it + 1 }
    println("d3: $d3")
}