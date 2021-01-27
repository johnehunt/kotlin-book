package com.jjh.react

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable

object PrimeNumberObserver : Observer<Int> {
    override fun onComplete() {
        println("PrimeNumberObserver Data Stream Complete")
    }

    override fun onSubscribe(d: Disposable?) {
        println("PrimeNumberObserver Subscribed")
    }

    override fun onNext(t: Int?) {
        println("PrimeNumberObserver Next item $t")
    }

    override fun onError(e: Throwable?) {
        println("PrimeNumberObserver Opps - An Error $e")
    }
}

fun primeNumberReporter(value: Int) = println("Function Received: $value")

fun main() {
    println("Create an observable using data in a list")
    val list = listOf(2, 3, 5, 7)
    println(list)
    val observable: Observable<Int> = list.toObservable()

    println("Set up Observers / Subscribers")

    // Subscribe a lambda function
    observable.subscribeBy { println("simpleprinter: $it") }
    // Subscribe a named function
    observable.subscribe(::primeNumberReporter)
    // Subscribe an Observer object
    observable.subscribeWith(PrimeNumberObserver)
    // Use named parameters and lambdas to set up all three functions
    observable.subscribeBy(  // named arguments for lambda Subscribers
        onNext = { println("Received onNext $it") },
        onError = { it.printStackTrace() },
        onComplete = { println("Received onComplete Done!") }
    )

}

