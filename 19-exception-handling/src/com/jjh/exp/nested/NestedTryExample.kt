package com.jjh.exp.nested

fun main() {
    try {
        try {
            try {
                println("In here")
                val result = 5 / 0
            } catch (exp: NullPointerException) {
                println("Its an NullPointerException")
            }
        } catch (ire: IllegalArgumentException) {
            println("Its an IllegalArgumentException")
        }
    } catch (ae: ArithmeticException) {
            println("Its an ArithmeticException")
            ae.printStackTrace()
    }
}