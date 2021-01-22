package com.jjh.maps

import java.util.Collections.synchronizedMap

fun main() {
    val map1: Map<Int, String> = mapOf(
        1 to "John",
        2 to "Denise")

    val map2 = mapOf(
        1 to "John",
        2 to "Denise")

    val map = mutableMapOf(
        "Ireland" to "Dublin",
        "UK" to "London",
        "France" to "Paris",
        "Spain" to "Madrid")

    println(map1)
    println(map2)
    println(map)

    println("---------")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.isEmpty())
    println(map.get("UK")) // Returns value for key or Null
    println(map["UK"]) // Returns value for key or null (more common)
    println(map.get("USA"))
    println(map["USA"])
    println(map.contains("UK"))
    println(map.getOrDefault("Germany", "Not known"))

    // Mutable map operations
    map.put("Italy", "Rome")
    map["Germany"] = "Berlin" // more common format
    println(map)

    // Remove an entry
    val cities = mutableMapOf(
        "Ireland" to "Dublin",
        "UK" to "London",
        "France" to "Paris",
        "Spain" to "Madrid")
    // Mutable map operations
    cities.remove("Germany")
    println("cities: $cities")

    println(cities.values)
    println(cities.keys)


    println("---------")

    for (key in map.keys) {
        print("$key -> ${map.get(key)}, ")
    }
    println()

    for (value in map.values) {
        print("$value, ")
    }
    println()

    for (mapEntry in map) {
        println (mapEntry)
    }

    // Synced mutable map
    val syncedMap = synchronizedMap(map)
    println(syncedMap)

    // Replace a keys value
    map["UK"] = "Swansea"
    print(map)

}