package com.jjh.overriding

open class Base {
    open val label: String = "Base"
    open fun print(): Unit = println("Base print")
}

class Derived: Base() {
    override val label: String = "Derived"
    override fun print(): Unit = println("Derived print")

}

fun main() {
    val base = Base()
    println(base.label)
    base.print()

    println("----------")

    val derived = Derived()
    println(derived.label)
    derived.print()
}