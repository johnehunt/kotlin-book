package com.jjh.data

fun main() {
    val inst1 = GameContent(10.0, 10.0)
    println(inst1)
    val inst2 = GameContent(10.0, 10.0)
    // uses default implementation of toString()
    println(inst2)
    println("x: ${inst2.x}, obj2.y: ${inst2.y}")
    println(inst1 == inst2) // uses default implementation of equals()
    println(inst1.hashCode())

    println("-------")

    val ship1 = Ship(10.0, 10.0)
    println(ship1)
    println(ship1.image)
    ship1.image = "default.png"
    println(ship1)
    val ship2 = Ship(10.0, 10.0)
    println(ship1 == ship2)

    println("------")
    // copying

    ship1.image = "default.png"
    println("ship1: $ship1")
    println("ship1.image: ${ship1.image}")
    val otherShip = ship1.copy(x = 20.0)
    println("othership: $otherShip")
    println("otherShip.image: ${otherShip.image}")

    println("------")

    // Data classes can be destructured
    val (x, y) = ship1
    println("x $x, y $y")

    var (a, b) = otherShip
    println("a $a, b $b")

    // can ignore a parameter if desired

    val (_, y1) = ship1
    println("y1: $y1")

}
