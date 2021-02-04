package com.jjh.react

import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toFlowable

fun main() {
    val flowable = listOf(0, 1, 2, 3, 5, 7)
        .toFlowable()
    flowable.subscribeBy { print("$it, ") }
    println()
}