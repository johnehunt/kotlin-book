package com.jjh.react

import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable

fun main() {
    // Create an observable using data in a list
    val observable = listOf(0, 1, 2, 3, 5, 7).toObservable()

    // Subscribe a simple lambda function
    observable.subscribeBy { print("$it, ") }
}