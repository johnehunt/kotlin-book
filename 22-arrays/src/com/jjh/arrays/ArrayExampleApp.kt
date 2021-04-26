package com.jjh.arrays

data class Person(val name: String)

fun main() {

    // Use long hand form of creating an array
    val asc = Array(5) { i -> (i * i).toString() }

    // Create some empty arrays
    val someStrings = emptyArray<String>()
    val friends = emptyArray<Person>()
    val anything: Array<Any> = emptyArray()
    val modules: Array<String> = emptyArray()
    val data = arrayOf<String>()

    println("anything: $anything")
    println("modules: $modules")
    println("data: $data")
    println("anything.size: ${anything.size}")

    // Create an array of Integers
    val intArray1 = IntArray(5)  // Array<Int>
    val intArray2 = intArrayOf(2, 4, 6, 8)
    val data2 = arrayOf<String>("John", "Denise")
    val data3 = arrayOf("John", "Denise") // String can be inferred
    val strings = arrayOfNulls<String>(5)

    // Creating an initially empty array of Ints
    val moduleMarks = IntArray(5)
    println("moduleMarks: $moduleMarks")
    println("moduleMarks.size: ${moduleMarks.size}")

    moduleMarks[0] = 26
    moduleMarks[1] = 15
    moduleMarks[2] = 56
    moduleMarks[3] = 72
    moduleMarks[4] = 34

    println("moduleMarks[0]: ${moduleMarks[0]}")

    // Iterate over values in Int Array
    for (item in moduleMarks) {
        println("item: $item")
    }

    // for (index in 0 until intArray1.size())
    // If you need the indices
    for (index in moduleMarks.indices) {
        println("index: $index - value ${moduleMarks[index]}")
    }

    // Creating array of Strings
    // Array of 4 elements initialised to null
    val names = arrayOfNulls<String>(4)
    // Array of 4 elements initialised to the empty string
    val alternativeNames = Array<String>(4){ "" }
    // Providing a set of initial names
    val names2 = arrayOf("John", "Denise", "Phoebe", "Adam")
    names2[2] = "Jasmine"
    println("The name in index 2 is ${names2[2]}")

    // Can also have arrays of custom objects
    // Type of array inferred from arrayOf list -
    // ie an array of Persons - Array<Person>
    val personArray = arrayOf(Person("John"),
                              Person("Denise"),
                              Person("Adam"),
                              Person("Phoebe"))
    println("personArray: $personArray")
    for (person in personArray) {
        println("person: $person")
    }

    // Array of variety of things
    val things = arrayOf("John", 2, true)
    for (item in things) {
        println(item)
    }

}
