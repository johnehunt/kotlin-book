package com.jjh.pairsandtriples

fun main() {
    val pair1 = Pair<Int, String>(1, "John")
    val pair2 = Pair(2, "Denise")
    val pair3 = Pair("Adam", "Jasmine")
    val pair4 = "Phoebe" to "Gryff" // shorthand form

    println(pair1)
    println(pair2)
    println(pair3)
    println(pair4)

    println(pair1.first)
    println(pair1.second)

    // Destructing supported by Pairs
    val (x, y) = pair1
    println("x: $x, y: $y")

    println(pair1.copy(first = 3))
    println(pair1)

    println("pair1.toList(): ${pair1.toList()}")

    println("-----")

    val triple1 = Triple<Int, String, String>(1, "John", "Denise")
    println(triple1)

    val triple2 = Triple(1, "John", "Denise")
    println(triple2)
    println(triple2.first)
    println(triple2.second)
    println(triple2.third)

    println(triple2.copy(first=3))

    println("triple2.toList(): ${triple2.toList()}")

    // Destructing supported by Triples
    val (a, b, c) = triple2
    println("a: $a, b: $b, c: $c")

}