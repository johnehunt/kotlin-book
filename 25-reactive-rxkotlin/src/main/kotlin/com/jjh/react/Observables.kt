package com.jjh.react

import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.kotlin.toObservable
import io.reactivex.rxjava3.kotlin.subscribeBy

class MyObserver: Observer<String> {
    override fun onComplete() {
        println("Complete")
    }

    override fun onSubscribe(d: Disposable?) {
        println("Subscribed")
    }

    override fun onNext(t: String?) {
        println("Next item $t")
    }

    override fun onError(e: Throwable?) {
        println("Opps - An Error $e")
    }
}

fun printer(data: String) = println("named function: $data")

fun main(args: Array<String>) {
    val list = listOf("John", "Denise", "Phoebe", "Gryff", "Adam", "Jasmine")
    println(list)
    val observable = list.toObservable()
    //println("observable: $observable")

    observable.subscribe(::printer )

    observable.subscribeWith(MyObserver())

    observable.subscribeBy{println("simpleprinter: $it")}

    observable.subscribeBy(  // named arguments for lambda Subscribers
        onNext = { println("onNext $it") },
        onError = { it.printStackTrace() },
        onComplete = { println("onComplete Done!") }
    )

}
