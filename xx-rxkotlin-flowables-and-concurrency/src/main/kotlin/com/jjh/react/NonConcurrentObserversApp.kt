package com.jjh.react

import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.create<Int> { emitter ->
        var currentNumber = 0
        while (currentNumber < 11) {
            if (checkIsPrimeNumber(currentNumber))
                emitter.onNext(currentNumber)
            ++currentNumber
        }
        emitter.onComplete()
    }.subscribe{println("value received $it")}  // on next value emitted handler

    // Wait for the observable to finish
    println("Press enter to terminate")
    readLine()
}