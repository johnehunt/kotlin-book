package com.jjh.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    println("Launching fire-and-forget task")
    GlobalScope.launch {
        println("---> Starting Task")
        delay(5000)
        println("---> Done Task")
    }
    println("---------------------------------")
    println("After launching coroutine")
    println("Waiting for task - press enter to continue:")
    readLine()
    println("---------------------------------")
    println("Done")
}

