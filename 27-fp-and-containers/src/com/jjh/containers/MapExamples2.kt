package com.jjh.containers

fun main() {
    val data = listOf(
        Person("Alun", 56),
        Person("Nikki", 51),
        Person("Megan", 21)
    )
    println("data: $data")

    val ages = data.map { it.age }
    println("ages: $ages")
}