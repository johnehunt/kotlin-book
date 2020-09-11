fun main() {
    val y = 10
    val x = 5

    for (i in 0 until y) {
        if (i == x) {
            break
        }
        print("i: $i, ")
    }
    println()

    println("-------------")

    loop@ for (i in 0 until 4) {
        for (j in 0 until 2) {
            if (i == 3) {
                break@loop
            }
            println("$i - $j, ")
        }
    }
}