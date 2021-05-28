package com.jjh.collections

fun main() {
    val set1: Set<String> = HashSet()
    val set2: MutableSet<String> = HashSet()
    // More idiomatic Kotlin
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
}
