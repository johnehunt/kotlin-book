package com.jjh.containers

fun main() {
    val data = listOf(
        listOf("John", "Paul", "George", "Ringo"),
        listOf("Freddie", "Brian", "Roger", "John")
    )
    println("data: $data")

    val flattenedData = data.flatten()
    println("flattenedData: $flattenedData")
}