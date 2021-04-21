package com.midmarsh.inner

fun main() {
    class Person(val name: String) {
        override fun toString() = "Person($name)"
    }
    val p = Person("John")
    println(p)
}