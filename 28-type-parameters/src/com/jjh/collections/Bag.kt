package com.jjh.collections

class Bag<T>(private var data: T) {

    fun get(): T {
        return data
    }

    fun set(value: T) {
        data = value
    }
}

fun main() {
    val bag1 = Bag<String>("Phoebe")
    println(bag1.get())
    bag1.set("Gryff")
    println(bag1.get())

    val bag2 = Bag(42)
    println(bag2.get())
    val temp: Int = bag2.get()
    println(temp)
    bag2.set(35)
    println(bag2.get())
}