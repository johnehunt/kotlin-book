package enums

enum class CompassDirections(val bearing: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
    val d = CompassDirections.WEST
    when (d) {
        CompassDirections.WEST -> println("Heading " + d.bearing)
        else -> println("Unknown heading")
    }
}