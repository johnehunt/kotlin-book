package com.jjh.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun executeSlowTask() {
    println("executeSlowTask -> Starting Task")
    delay(5000)
    println("executeSlowTask ->Done Task")
}

fun main() {

    println("Main -> Launching fire-and-forget task")

    GlobalScope.launch {
        executeSlowTask()
    }
    println("---------------------------------")
    println("Main -> After launching coroutine")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("---------------------------------")
    println("Main -> Done")
}