package com.jjh.coroutine


import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.Channel.Factory.UNLIMITED
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    val channel = Channel<Int>(UNLIMITED) // Shared Unlimited Channel

    suspend fun sendDataToChannelTask() {
        repeat(5) {
            delay(50)
            println("Sending ---> $it")
            channel.send(it)
        }
    }

    suspend fun receiveDataFromChannelTask() {
        delay(500)
        while (true) {
            delay(100)
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