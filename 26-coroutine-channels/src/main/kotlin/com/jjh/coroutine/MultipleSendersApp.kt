package com.jjh.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    suspend fun sendMessage(tag: String,
                           channel: Channel<String>,
                           message: String,
                           time: Long) {
        repeat (5) {
            delay(time)
            println("$tag sending --> $message")
            channel.send(message)
        }
    }

    suspend fun receiveMessage(channel: Channel<String>) {
        while (true) {
            println("Receiver --> ${channel.receive()}")
        }
    }

    println("Main -> Multiple senders and one receiver")
    val msgChannel = Channel<String>()

    // Launch multipel sending coroutines
    GlobalScope.launch { sendMessage("Sender1",
                                          msgChannel,
                                  "Welcome",
                                      300L) }
    GlobalScope.launch { sendMessage("Sender2",
                                          msgChannel,
                                  "Hello",
                                     150L) }
    // Launch a single receiving coroutine
    GlobalScope.launch { receiveMessage(msgChannel) }

    println("Main -> After launching coroutines")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("Main -> Done")
}