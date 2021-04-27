package com.jjh.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.random.Random

suspend fun sendMessageOfTheDay(
    channel: Channel<String>,
    time: Long) {
    val messages = arrayOf("Hello", "Welcome", "G'day", "Bonjour", "Ola")
    repeat(5) {
        delay(time)
        val index = Random.nextInt(0, messages.size)
        val messageToSend = "${messages[index]} + ${Date()}"
        println("\tSender sending --> $messageToSend")
        channel.send(messageToSend)
    }
}

suspend fun receiveMessage(
    channel: Channel<String>,
    time: Long) {
    while (true) {
        delay(time)
        println("\t\treceiveMessage --> ${channel.receive()}")
    }
}

fun main() {

    println("Main -> Single sender and multiple receivers")
    val msgChannel = Channel<String>()

    // Launch Single sending coroutine
    GlobalScope.launch {
        sendMessageOfTheDay(msgChannel, 1000L)
    }

    GlobalScope.launch { receiveMessage(msgChannel, 1000L) }
    GlobalScope.launch {
        while (true) {
            println("\t\treceiving --> ${msgChannel.receive()}")
        }
    }

    println("---------------------------------")
    println("Main -> After launching coroutines")
    println("Main -> Waiting for tasks - press enter to continue:")
    readLine()
    msgChannel.close()
    println("---------------------------------")
    println("Main -> Done")

}