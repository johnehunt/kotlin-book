package com.jjh.lists

fun main() {
    val list = listOf("John", "Paul", "George", "Ringo")
    println(list[1])

    val mutableList = mutableListOf("John", "Paul", "George", "Pete")
    mutableList[3] = "Ringo"
    println(mutableList)
}