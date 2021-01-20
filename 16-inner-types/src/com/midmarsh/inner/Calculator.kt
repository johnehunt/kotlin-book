package com.midmarsh.inner

class Calculator(private val value: Int) {
    private var count = 0
    var result = 0
        private set

    // Inner class defined within the scope of Calculator
    inner class Worker(val id: Int) {
        fun performCalculation() {
            for (i in 0 until value) {
                result += i
            }
        }
    }

    val worker: Worker
        get() = Worker(count++)

}

fun main() {
    val calc = Calculator(5)
    val worker = calc.worker
    worker.performCalculation()
    println("calc.result: " + calc.result)
}