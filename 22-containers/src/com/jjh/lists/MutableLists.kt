package com.jjh.lists

fun main() {
    val list1= mutableListOf("John", "Paul", "George", "Ringo")
    list1.add("Pete")
    println(list1)

    list1.addAll(listOf("Albert", "Bob"))
    println(list1)
}