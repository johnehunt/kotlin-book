package com.jjh.containers

fun main() {
    println("forEach with Lists")

    val myList = listOf("Zero", "One", "Two")

    // Using a named function via a callable reference
    myList.forEach(::println)

    // Using an anonymous function
    myList.forEach(fun(s: String) = println(s))

    // Lambda function applied to each element in the list
    myList.forEach { s -> println(s) }
    myList.forEach { println(it) }

    println("-------------")
    println("forEach with arrays")

    // Using forEach with an array
    val myArray = arrayOf("Adam", "Jasmine", "Phoebe", "Gryff")
    myArray.forEach { println(it) }

    println("-------------")
    println("forEach with a map")

    // Using forEach with a map
    val map = mutableMapOf(
        "Ireland" to "Dublin",
        "UK" to "London",
        "Spain" to "Madrid")
    // Options for applying forEach to a map
    print("Keys: ")
    map.keys.forEach { print("$it, ") }
    print("\nValues: ")
    map.values.forEach { print("$it, ") }
    print("\nKey-Value pairs: ")
    map.forEach{ (k, v) -> print("$k -> $v, ") }
    println()

    println("-------------")
    println("forEachIndexed with a list")

    // Accessing the index as well as the element
    myList.forEachIndexed { i, s -> println("index: $i value: $s") }

}