package com.jjh.scoping


fun processList0() {
    println("Starting processList0")
    listOf(1, 2, 3, 4, 5).forEach(
        fun (i: Int) {
            if (i == 3) return // Return from anonymous function
            print("$i, ")
        }
    )
    println("\nDone")
}

// Equivalent of a break
fun processList1() {
    println("Starting processList1")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // global return for the function
        print("$it, ")
    }
    println("\nDone")
}

// Equivalent of a continue
fun processList2() {
    println("Starting processList2")
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print("$it, ")
    }
    println("\nDone with explicit label")
}

// Shorthand form
fun processList3() {
    println("Starting processList3")
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return forEach loop - shorthand form
        print("$it, ")
    }
    println("\nDone with implicit label")
}

fun main () {
    processList0()
    println("\n----------------")
    processList1()
    println("\n----------------")
    processList2()
    println("----------------")
    processList3()
}