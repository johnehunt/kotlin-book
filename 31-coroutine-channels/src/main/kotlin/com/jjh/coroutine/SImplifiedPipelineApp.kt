package com.jjh.coroutine

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    fun CoroutineScope.numberGenerator(): ReceiveChannel<Int> = produce<Int> {
        var i = 0
        while (true) {
            delay(150L)
            println("numberGenerator sending --> $i")
            send(i)
            i++
        }
    }

    fun CoroutineScope.doubler(channel: ReceiveChannel<Int>): ReceiveChannel<Int> = produce {
        while (true) {
            val num = channel.receive()
            println("doubler received --> $num")
            val newNum = num * 2
            println("doubler sending --> $newNum")
            send(newNum)
        }
    }

    GlobalScope.launch {
        // produces integers from 1 and on
        val numberChannel = numberGenerator()
        // doubles integers received from number channel and resends
        val doublerChannel = doubler(numberChannel)

        // Receiver used to print final results
        repeat (4) {
            println("receiving --> ${doublerChannel.receive()}") // print first five
        }
    }

    println("Main -> After launching coroutines")
    println("Main -> Waiting for task - press enter to continue:")
    readLine()
    println("Main -> Done")

}