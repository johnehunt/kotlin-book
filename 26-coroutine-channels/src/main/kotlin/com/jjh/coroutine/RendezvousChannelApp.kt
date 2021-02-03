package com.jjh.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val channel = Channel<Int>() // Shared rendezvous Channel

    suspend fun sendDataToChannelTask() {
        repeat(3) {
            delay(100)
            println("Sending ---> $it")
            channel.send(it)
        }
    }

    suspend fun receiveDataFromChannelTask() {
        repeat(3) {
            println("Receiving ---> ${channel.receive()}")
        }
    }

    println("Main -> Launching rendezvous channel task")
    GlobalScope.launch { sendDataToChannelTask() }
    GlobalScope.launch { receiveDataFromChannelTask() }
    println("Main -> After launching coroutines")
    println("Main -> Waiting for tasks - press Enter to Terminate:")
    readLine()
    println("Main -> Done")
}