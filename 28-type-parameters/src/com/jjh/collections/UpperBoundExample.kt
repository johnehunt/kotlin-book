package com.jjh.collections

fun <T : Comparable<T>> sort(list: List<T>): List<T> {
    return list.sorted()
}

fun main() {
    println(sort<String>(listOf("Jasmine", "Adam", "John")))
    println(sort(listOf(1, 5, 4, 2)))

    // Person doe snot implement Comparable and thus cannot be used with the sort function
    data class Person(val name: String, val age: Int)
    // println(sort(listOf(Person("Phoebe", 23), Person("Gryff, 21"))))
}