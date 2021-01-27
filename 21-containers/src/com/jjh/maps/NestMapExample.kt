package com.jjh.maps

fun main() {
    val seasons = mapOf(
        "Spring" to listOf("Mar", "Apr", "May"),
        "Summer" to listOf("June", "July", "August"),
        "Autumn" to listOf("Sept", "Oct", "Nov"),
        "Winter" to listOf("Dec", "Jan", "Feb")
    )
    println(seasons["Spring"])
    println(seasons["Spring"]?.get(1))
}