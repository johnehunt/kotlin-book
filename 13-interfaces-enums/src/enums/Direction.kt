package enums

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    val d = Direction.NORTH
    println(d)
    println("d.name: ${d.name}")
    println("d.ordinal: ${d.ordinal}")

    if (d === Direction.NORTH) {
        println("We are heading North")
    }
}