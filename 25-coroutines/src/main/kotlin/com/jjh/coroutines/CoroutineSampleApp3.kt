package com.jjh.coroutines

import kotlinx.coroutines.*

fun main() {
    println("Main -> Launching fire-and-forget task")

    val customScope = CoroutineScope(Dispatchers.Main)
    customScope.launch {
        executeSlowTask()
    }

    println("---------------------------------")
    println("Main -> After launching coroutine")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("---------------------------------")
    println("Main -> Done")

}