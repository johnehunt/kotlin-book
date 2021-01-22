package com.jjh.pairsandtriples

fun main() {
    val pair1 = Pair(1, "Phoebe")
    val pair2 = Pair("John", "Denise")
    val pair3 = Pair("Adam", "Jasmine")
    val triple1 = Triple(pair1, pair2, pair3)
    println(triple1)
}