package com.jjh.containers

fun main() {
    val data = listOf(
        Person("Alun", 56),
        Person("Nikki", 51),
        Person("Megan", 21)
    )

    println("data: $data")

    val totalAge = data.fold(0){total, element -> total + element.age}

    val averageAge = totalAge / data.size
    println("Average Age: $averageAge")
}