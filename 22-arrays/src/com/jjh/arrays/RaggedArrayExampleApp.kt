package com.jjh.arrays

fun main() {
    val family = arrayOf (
            arrayOf("John", "Denise", "Phoebe", "Adam"),
            arrayOf("Paul", "Fi", "Andrew", "James", "Joselyn")
    )
    println("family: $family")
    println("family.length: ${family.size}")
    println("family(0).length: ${family[0].size}")
    println("family(1).length: ${family[1].size}")

    val family0 = family[0]
    for (name in family0) {
        println(name)
    }

    family[0][2] = "Jasmine"
    for (name in family[0]) {
        println(name)
    }


}