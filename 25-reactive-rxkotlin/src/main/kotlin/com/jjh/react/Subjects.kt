package com.jjh.react

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

fun main(args: Array<String>) {
    val list = listOf("John", "Denise", "Phoebe", "Gryff", "Adam", "Jasmine")
    println(list)
    val observable: Observable<String> = list.toObservable()

    val subject: ReplaySubject<String> = ReplaySubject.create<String>()
    //val subject: PublishSubject<String> = PublishSubject.create<String>()
    subject.subscribeBy{println("first observer: $it")}

    observable.subscribe(subject)

    subject.subscribeBy { println("second observer: $it") }
}
