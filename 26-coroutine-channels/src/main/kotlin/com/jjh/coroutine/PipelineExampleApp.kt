package com.jjh.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    suspend fun numberGenerator(channel: Channel<Int>,
                                time: Long) {
        repeat (5) {
            delay(time)
            println("numberGenerator sending --> $it")
            channel.send(it)
        }
    }

    suspend fun doubler(inputChannel: Channel<Int>,
                        outputChannel: Channel<Int>) {
        while (true) {
            val num = inputChannel.receive()
            println("doubler received --> $num")
            val newNum = num * 2
            println("doubler sending --> $newNum")
            outputChannel.send(newNum)
        }
    }

    suspend fun printer(channel: Channel<Int>) {
        while (true) {
            println("printer received --> ${channel.receive()}")
        }
    }

    // Set up channels
    val channel1 = Channel<Int>()
    val channel2 = Channel<Int>()

    // Launch the coroutines
    GlobalScope.launch {numberGenerator(channel1, 150L) }
    GlobalScope.launch { doubler(channel1, channel2) }
    GlobalScope.launch { printer(channel2) }

    // Wait for coroutines to complete
    println("Main -> After launching coroutines")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("Main -> Done")

}