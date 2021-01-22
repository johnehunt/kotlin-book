package com.jjh.sets

fun main() {
    val set1: Set<String> = HashSet()
    val set2: MutableSet<String> = HashSet()

    val set3 = setOf<String>("One", "Two", "Three")
    val set4 = setOf("A", "B", "C")
    val set5 = mutableSetOf("Chasing Pavements",
        "Rumour Has it",
        "Turning Tables")

    println(set1)
    println(set2)
    println(set3)
    println(set4)
    println(set5)

    println("--------")

    // Some operations
    println(set5.size)
    println(set5.isEmpty())
    println(set5.isNotEmpty())

    // Checking that an element is in a list
    println(set5.contains("Rumour Has it"))
    println(set5.indexOf("Rumour Has it"))

    // Can only add a value once
    println(set5)
    set5.add("Skyfall")
    println(set5)
    set5.add("Skyfall")
    println(set5)

    set5.addAll(listOf("Hello", "Rolling In the Deep", "Hello"))
    println(set5)

    set5.remove("Hello")
    println(set5)

    println("--------")

    // Looping through a list
    // Iterate over values in array
    for (item in set5) {
        println(item)
    }

}