package com.jjh.react

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
        .subscribe{print("$it, ")}
    println()

    generatePrimeNumberObservable(11)
        .doOnNext { println("doOnNext($it)") }
        .doOnComplete{println("doOnComplete()")}
        .doOnError { println("doOnError($it)") }
        .doFinally { println("doFinally()") }
        .doOnSubscribe { println("doOnSubscribe($it)") }
        .subscribe{print("$it, ")}
    println()

}