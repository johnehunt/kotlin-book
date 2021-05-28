package com.jjh.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    println("Launching fire-and-forget task")
    val job = GlobalScope.launch {
        executeSlowTask()
    }
    println("After launching coroutine")
    println("job.isActive: ${job.isActive}")
    println("job.isCompleted: ${job.isCompleted}")
    println("job.isCancelled: ${job.isCancelled}")
    println("job.children.count(): ${job.children.count()}")
    job.invokeOnCompletion { println("I am Completed") }
    println("Waiting for task - press enter to continue:")
    readLine()
    println("Done")
}
