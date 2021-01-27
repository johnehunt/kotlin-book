package com.jjh.util

object MyUtils {
    // Lateinit allows value to be provided later on
    lateinit var title: String

    fun printTitle() {
        println(title.length)
        println(title)
    }
}

fun main() {
    MyUtils.title = "KVaders"
    MyUtils.printTitle()
}