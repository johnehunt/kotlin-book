package com.jjh.lists

import java.util.Collections.synchronizedList

fun main() {

    // Explicit list creation options
    val list0: List<String> = ArrayList()
    val list1: MutableList<String> = ArrayList()
    println("myList0: $list0")
    println("myList1: $list1")

    // More idiomatic Kotlin
    val myList1 = listOf<String>("One", "Two", "Three")
    val myList2 = listOf("One", "Two", "Three")
    val myList3 = mutableListOf("Denise", "Adam", "Phoebe")
    val myList4 = listOf<String>()  // Create an empty list

    println("myList1: $myList1")
    println("myList2: $myList2")
    println("myList3: $myList2")
    println("myList4: $myList4")

    println("myList2.size: ${myList2.size}")
    println("myList2.first(): ${myList2.first()}")
    println("myList2.last(): ${myList2.last()}")
    println("myList2.takeLast(2): ${myList2.takeLast(2)}")
    println("myList2.lastIndex: ${myList2.lastIndex}")
    println("myList2.isEmpty(): ${myList2.isEmpty()}")
    println("myList2.isNotEmpty(): ${myList2.isNotEmpty()}")
    println("myList2.asReversed(): ${myList2.asReversed()}")

    // Can add to myList3 as its a mutable List
    println("adding to a Mutable List")
    println("myList3:$myList3")
    myList3.add("John")
    println("myList3:$myList3")
    myList3.addAll(listOf("Denise", "Phoebe"))
    println("myList3:$myList3")

    // Accessing an element
    println("Accessing elements by index")
    println("myList1.get(2): ${myList1.get(2)}") // more common to use index
    println("myList1[2]:${myList1[2]}")

    // Updating an element
    println("Updating elements by index")
    println("myList3:$myList3")
    myList3.set(2, "Jasmine") // more common to use index access
    println("myList3: $myList3")
    myList3[2] = "Gryff"
    println("myList3: $myList3")

    // Inserting an element
    println("Inserting an element")
    val aList = mutableListOf("Adele", "Madonna", "Cher")
    println(aList)
    aList.add(1, "Paloma")
    println(aList)

    // Removing from a list
    println("Removing from a list")
    val anotherList = mutableListOf("Gary", "Mark", "Robbie", "Jason", "Howard")
    println(anotherList)
    anotherList.remove("Robbie")
    println(anotherList)
    anotherList.removeAt(2)
    println(anotherList)

    // Checking that an element is in a list
    println("Checking an element is in a list")
    val names = listOf("Adam", "Jasmine", "Phoebe", "Gryff")
    println("names.contains(\"Adam\"): ${names.contains("Adam")}")
    println("names.contains(\"Bob\"): ${names.contains("Bob")}")
    println("names.indexOf(\"Adam\"): ${names.indexOf("Adam")}")
    println("names.indexOf(\"Bob\"): ${names.indexOf("Bob")}")

    // Looping through a list
    // Iterate over values in array
    println("Iterating over a list")
    for (item in myList1) {
        println(item)
    }

    // If you need the indices
    println("Accessing index and value in a list")
    for (index in myList1.indices) {
        println("index: $index - value ${myList1[index]}")
    }

    // Take a slice of a list
    println("Take a slice of a list")
    val group = listOf("John", "Paul", "George", "Ringo")
    println(group)
    println(group.slice((1..3)))


    // Creating a synchronized mutable list
    val syncedList = synchronizedList(myList3)
    println(syncedList)

    val l1 = mutableListOf("Apple", "Orange")
    val l2 = listOf("Banana", "Pear")
    val l3 = l1 + l2
    println(l3)
}