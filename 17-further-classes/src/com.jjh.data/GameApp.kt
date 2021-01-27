package com.jjh.data

fun main() {
    val inst1 = GameContent(10.0, 10.0)
    println(inst1)
    val inst2 = GameContent(10.0, 10.0)
    println(inst2) // uses default implementation of toString()
    println("x: ${inst2.x}, obj2.y: ${inst2.y}")
    println(inst1 == inst2) // uses default implementation of equals()
    println(inst1.hashCode())

    println("-------")

    val ship = Ship(10.0, 10.0)
    println(ship)
    println(ship.image)
    ship.image = "default.png"
    println(ship)
    val ship2 = Ship(10.0, 10.0)
    println(ship == ship2)

    println("------")
    // copying

    ship.image = "default.png"
    println("ship: $ship")
    println("ship.image: ${ship.image}")
    val otherShip = ship.copy(x = 20.0)
    println("othership: $otherShip")
    println("otherShip.image: ${otherShip.image}")

    println("------")

    // Data classes can be destructured
    val (x, y) = ship
    println("x $x, y $y")

    var (a, b) = otherShip
    println("a $a, b $b")

    // can ignore a parameter if desired

    val (_, y1) = ship
    println("y1: $y1")

}
