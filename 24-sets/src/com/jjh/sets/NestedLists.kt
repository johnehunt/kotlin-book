package com.jjh.sets

fun main() {

    val set1 = setOf(1, "John", 34.5)
    val list1 = listOf("Smith", "Jones")
    val list2 = listOf(set1, list1)
    val set2 = setOf(list2, "apple")
    println(set2)

}