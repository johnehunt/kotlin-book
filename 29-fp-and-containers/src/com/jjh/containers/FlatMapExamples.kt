package com.jjh.containers

fun main() {
    val listOfLists = listOf(listOf(1, 2), listOf(4, 5))
    println("listOfLists: $listOfLists")

    println("---------------")

    val data1 = listOfLists.map { it.filter { i -> i > 1 } }
    println("data1: $data1")
    val data2 = data1.flatten()
    println("data2: $data2")

    println("---------------")

    val result = listOfLists.flatMap { it.filter { i -> i > 1 } }
    println("Result: $result")
}