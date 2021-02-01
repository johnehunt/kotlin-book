package com.jjh.ext

class Person(var name: String = "",
             val age: Int = 0) {
    override fun toString() = "Person($name, $age)"
}

var Person.tag
    get() = name
    set(value) { name = value }

fun main() {

    val p = Person("John", 21)
    println(p.tag)

    p.tag = "Bob"
    println("p: $p")

}