package com.jjh.collections

class DataConsumer<in T> {
    fun consume(data: T): Boolean {
        return true
    }
}

fun main() {
    val consumer = DataConsumer<String>()
    val success = consumer.consume("Theeban")
    println(success)
}