package com.jjh.react

import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Observable

fun checkIsPrimeNumber(num: Int): Boolean {
    for (i in 2..num / 2) {
        if (num % i == 0) return false
    }
    return true
}

fun generatePrimeNumberObservable(maxNumber: Int): Observable<Int> =
    Observable.create<Int> { emitter ->
        var currentNumber = 0
        while (currentNumber < maxNumber) {
            if (checkIsPrimeNumber(currentNumber))
                emitter.onNext(currentNumber)
            ++currentNumber
        }
        emitter.onComplete()
    }

fun main() {
    generatePrimeNumberObservable(11)
        .toFlowable(BackpressureStrategy.LATEST)
        .subscribe{print("$it, ")}
    println()
}