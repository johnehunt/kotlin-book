package com.jjh.react

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers

fun main() {
    Observable.create<Int> { emitter ->
        var currentNumber = 0
        while (currentNumber < 11) {
            if (checkIsPrimeNumber(currentNumber))
                emitter.onNext(currentNumber)
            ++currentNumber
        }
        emitter.onComplete()
    }.subscribeOn(Schedulers.newThread())  // run subscription in new thread
        .observeOn(Schedulers.computation()) // run observers in computation thread
        .subscribe{println("value received $it")}

    // Wait for the observable to finish
    println("Press enter to terminate")
    readLine()

}