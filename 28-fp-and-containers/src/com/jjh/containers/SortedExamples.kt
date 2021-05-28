package com.jjh.containers

fun main() {
    val myList = listOf("Zero", "Fifteen", "One", "Two")
    println(myList)

    println(myList.sorted())

    println(myList.sortedBy { s -> s.length })
}