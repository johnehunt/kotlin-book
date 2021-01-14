package com.jjh.util

class Printer {

    fun echo(vararg args: String) {
        for (arg in args) println(arg)
    }

}

fun main() {
    val printer = Printer()
    printer.echo()
    println("--------")
    printer.echo("John")
    println("--------")
    printer.echo("John", "was", "here")
}