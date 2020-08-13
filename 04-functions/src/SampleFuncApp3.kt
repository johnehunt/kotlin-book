fun square(num: Int): Int {
    return num * num
}

fun main() {
    // Store result from square in a variable
    val result = square(4)
    println("result: $result")
    // Send the result from square immediately to another function
    println("square(5): ${square(5)}")
    // Use the result returned from square in a conditional expression
    if (square(3) < 15) {
        println("square(3) is less than 15")
    }
}