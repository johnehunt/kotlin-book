package com.jjh.props

fun main() {
    val player = GamePlayer("John", "Hunt", 36, "123AA")
    // age is a read-write property initialised in constructor
    println(player.age)
    player.age = player.age + 1
    println(player.age)
    // id is a read only property initialised in the constructor
    println(player.id)
    // fullname is a readonly property
    println(player.fullname)
    // Favourite Game is a read-write property
    player.favouriteGame = "Assasins Creed"
    println(player.favouriteGame)

    player.birthday()
}