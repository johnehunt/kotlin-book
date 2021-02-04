package com.jjh.react

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.kotlin.subscribeBy

fun main() {
    Flowable.fromCallable {
        Thread.sleep(1000) //  imitate expensive computation
        "Done"
    }.subscribeBy { x: String? -> println(x) }  // on next value emitted handler

    Thread.sleep(2000) // <--- wait for the flow to finish
}