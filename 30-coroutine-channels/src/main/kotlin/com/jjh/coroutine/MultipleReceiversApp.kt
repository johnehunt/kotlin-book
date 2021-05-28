package com.jjh.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

fun main() {

    suspend fun sendMessage(channel: Channel<String>,
                            message: String,
                            time: Long) {
        repeat(5) {
            delay(time)
            val messageToSend = "$message + ${Date()}"
            println("Sender sending --> $messageToSend")
            channel.send(messageToSend)
        }
    }

    suspend fun receiveMessage(tag: String,
                               channel: Channel<String>,
                               time: Long) {
        while (true) {
            delay(time)
            println("$tag --> ${channel.receive()}")
        }
    }

    println("Main -> Single sender and multiple receivers")
    val msgChannel = Channel<String>()

    // Launch Single sending coroutine
    GlobalScope.launch {
        sendMessage(msgChannel, "Welcome", 1000L)
    }

    // Launch multiple receiver coroutines
    GlobalScope.launch { receiveMessage("Receiver1", msgChannel, 1000L) }
    GlobalScope.launch { receiveMessage("Receiver2", msgChannel, 1500L) }

    println("Main -> After launching coroutines")
    println("Main -> Waiting for tasks - press enter to continue:")
    readLine()
    msgChannel.close()
    println("Main -> Done")

}

