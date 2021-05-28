package com.jjh.coroutines

import kotlinx.coroutines.*

suspend fun executeSlowTaskWithResultAsync(): Deferred<Int> =
    GlobalScope.async {
        println("executeSlowTaskWithResultAsync --> Starting Task")
        delay(5000)
        println("executeSlowTaskWithResultAsync --> Done Task")
        return@async 42
    }

fun main() {
    println("Main -> Launching deferred result task")
    GlobalScope.launch {
        val result = executeSlowTaskWithResultAsync().await()
        println("coroutine --> result: $result")
    }
    println("Main -> After launching coroutine")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("Main ->Done")
}