package com.jjh.lists

data class Person(val name: String)

fun main() {
    val list1 = listOf(1, 43.5, Person("Phoebe"), true)
    val list2 = listOf("apple", "orange", 31)
    val rootList = listOf(list1, list2)
    println(rootList)
}