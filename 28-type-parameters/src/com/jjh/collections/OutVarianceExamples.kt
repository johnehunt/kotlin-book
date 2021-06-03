package com.jjh.collections

class DataSource<out T>(val data: T) {
    fun next(): T {
        return data
    }
}

fun main() {
    val source = DataSource<Any>("Phoebe")
    println(source.next())
}
