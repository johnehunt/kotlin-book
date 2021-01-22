package com.jjh.arrays

fun main() {
    val names = arrayOf("John", "Denise", "Adam", "Phoebe")
    println(names)
    println("size(): ${names.size}")
    println("first(): ${names.first()}")
    println("last(): ${names.last()}")
    println("copyOf(): ${names.copyOf()}")
    println("sliceArray(2..3): ${names.sliceArray(2..3)}")
    names.reverse()
    println("reversed array: $names")
    for (name in names) { print("$name, ") }
    println("\nasList(): ${names.asList()}")
}