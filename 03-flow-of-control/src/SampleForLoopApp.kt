fun main() {
    println("Print out values in a range")
    for (i in 0..9) {
        print("$i, ")
    }
    println()
    println("Done")

    println("Print out values in a range with an increment of 2")
    for (i in 0..9 step 2) {
        print("$i, ")
    }
    println()
    println("Done")

    println("Print out values in a range to but not including 9")
    for (x in 0 until 9)
        print("$x, ")
    println()
    println("Done")

    println("Print out values in a range to but not including 9 with step 2")
    for (x in 0 until 9 step 2) {
        print("$x, ")
    }
    println()
    println("Done")

    println("Iterate down from one value to a lower value")
    for (i in 5 downTo 0) {
        print("$i * $i = ${i*i}; ")
    }
    println()
    println("Done")


}