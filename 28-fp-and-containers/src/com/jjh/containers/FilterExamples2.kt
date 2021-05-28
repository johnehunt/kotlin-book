package com.jjh.containers

class Person(val name: String, val age: Int) {
    override fun toString()= "Person($name', $age)"
}

fun main() {
    val data = listOf(
        Person("Alun", 56),
        Person("Nikki", 51),
        Person("Megan", 21))

    println("data: $data")

    // Use a lambda to filter out People over 21
    val d1 = data.filter{it.age <= 21}
    println("d1: $d1")
}