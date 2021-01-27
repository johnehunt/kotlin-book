package com.jjh.exp.basic

fun main() {
    try {
        runcalc(5)
    } catch (exp: NullPointerException) {
        println("NullPointerException")
    } catch (exp: IllegalArgumentException) {
        println("IllegalArgumentException")
    } catch (exp: ArithmeticException) {
        println("ArithmeticException")
    } catch (e: Exception) {
        println("Duh!")
    }
}