package com.jjh.react

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers

fun main() {
    Flowable.fromCallable {
        Thread.sleep(1000) //  imitate expensive computation
        "Done"
    }.subscribeOn(Schedulers.single())  // run subscription in foreground
        .observeOn(Schedulers.computation())  // handle observations in background
        .subscribe({ x: String? -> println(x) })  // on next value emitted handler
                   { obj: Throwable -> obj.printStackTrace() } // error handler

    // Wait for the flow to finish
    println("Press enter to terminate")
    readLine()
}