package com.jjh.containers

fun main() {
    val data = listOf(1, 3, 5, 2, 7, 4, 10)
    println("data; $data")

    val result = data.reduce{ total, element -> total + element }
    println("result: $result")
}