package com.jjh.coroutines

import kotlin.random.Random
import kotlinx.coroutines.delay
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

suspend fun printer(msg: String, sleep: Long, times: Int) {
    repeat(times) {
        print("$msg, ")
        delay(Random.nextLong(0, sleep))
    }
}

fun main() {
    println("Main -> Launching fire-and-forget tasks")
    GlobalScope.launch { printer("A", 100, 10) }
    GlobalScope.launch { printer("B", 200, 5) }
    GlobalScope.launch { printer("C", 50, 15) }
    GlobalScope.launch { printer("D", 30, 7) }
    GlobalScope.launch { printer("E", 75, 12) }
    println("---------------------------------")
    println("Main -> After launching coroutine")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("---------------------------------")
    println("Main -> Done")
}
