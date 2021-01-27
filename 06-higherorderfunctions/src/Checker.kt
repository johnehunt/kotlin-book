fun makeChecker(s: String): (Int) -> Boolean =
    when (s) {
        "even" -> { n: Int -> n % 2 == 0 }
        "positive" -> { n: Int -> n >= 0 }
        "negative" -> { n: Int -> n < 0 }
        else -> { n: Int -> true }
    }

fun main() {
    val isEven = makeChecker("even")
    val isPositive = makeChecker("positive")
    val isNegative = makeChecker("negative")
    val isInteger = makeChecker("")

    println("isEven(3): ${isEven(3)}")
    println("isPositive(3): ${isPositive(3)}")
    println("isNegative(3): ${isNegative(3)}")
    println("isInteger(3): ${isInteger(3)}")
}