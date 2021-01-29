package com.jjh.containers

fun main() {
    fun isEven(i :Int) = i % 2 == 0

    val data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data; $data")

    // Filter using a named function
    val d1 = data.filter(::isEven)
    println("d1: $d1")

    // Filter using an anonymous function
    val d2 = data.filter(fun(i: Int) = i % 2 == 0)
    println("d2: $d2")

    // Filter for even numbers using a lambda function
    val d3 = data.filter{it % 2 == 0}
    println("d3: $d3")
}