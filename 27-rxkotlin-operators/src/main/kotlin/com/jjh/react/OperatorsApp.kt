package com.jjh.react

import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.kotlin.toFlowable
import io.reactivex.rxjava3.kotlin.toObservable

fun main(args: Array<String>) {
    val list = listOf("John", "Denise", "Phoebe", "Gryff", "Adam", "Jasmine")
    val flowable = list.toFlowable()
    val flowable2 = Flowable.range(0, 10)

    listOf(2, 3, 5, 7)
        .toObservable()
        .map { "'$it'" }
        .subscribe{println(it)}

    val source1 = listOf(2, 3, 5, 7).toObservable()
    val source2 = listOf(11, 13, 16, 19).toObservable()

    source1.mergeWith(source2).subscribe{println(it)}

    listOf(2, 3, 5, 7, 4, 9, 8)
        .toObservable()
        .filter {it % 2 == 0}
        .subscribe{println(it)}

    // Use distinct to suppress duplicates
    listOf(2, 3, 5, 2, 4, 3, 2)
        .toObservable()
        .distinct()
        .subscribe{println("received: $it")}


    listOf(2, 3, 5, 7, 4, 9, 8)
        .toObservable()
        .count()
        .toFlowable()
        .subscribe{println("count: $it")}


    listOf(2, 3, 5, 7, 4, 9, 8)
        .toObservable()
        .reduce(0){total, value -> total + value}
        .toFlowable()
        .subscribe{println("Total: $it")}

    // chain operators

    listOf(2, 3, 5, 7, 4, 9, 8)
        .toObservable()
        .filter {it % 2 == 0}
        .map { "'$it'" }
        .subscribe{println(it)}

}