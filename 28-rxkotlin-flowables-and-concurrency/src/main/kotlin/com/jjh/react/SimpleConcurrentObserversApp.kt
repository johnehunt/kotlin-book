package com.jjh.react

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.schedulers.Schedulers

fun main(args: Array<String>) {

    // An alternative approach
    Flowable.range(1, 10)
        .parallel()
        .runOn(Schedulers.computation())
        .map { v: Int -> v * v }
        .sequential()
        .blockingSubscribe { x: Int? -> println(x) }

}