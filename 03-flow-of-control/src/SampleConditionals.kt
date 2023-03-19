fun main() {
    val y = 10
    val x = 5

    if (x == 5 && y ==10) {
        println("x == 5 && y ==10")
    }

    if (x == 5 || y == 5) {
        println("x == 5 || y == 5")
    }

    if ((x == 5) xor (y == 5)) {
        println("(x == 5) xor (y == 5)")
    }
}