package com.jjh.arrays

fun main() {
    val seats = arrayOf(
            arrayOf(0, 0, 0, 0, 1),
            arrayOf(0, 0, 0, 1, 1),
            arrayOf(0, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 1, 1),
            arrayOf(0, 0, 0, 0, 1))

    // accessing an individual element of the 2D array
    seats[1][0] = 1
    println(seats[1][0])

    println("------")

    // Printing all elements in the 2D array
    for (array in seats) {
        for (value in array) {
            print("$value ")
        }
        println()
    }


}