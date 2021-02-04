package com.jjh.react

import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toFlowable

fun main(args: Array<String>) {
    val list = listOf("John", "Denise", "Phoebe", "Gryff", "Adam", "Jasmine")
    println(list)

    val flowable = list.toFlowable()
    flowable.subscribeBy { s -> println("Received value: $s") }

}