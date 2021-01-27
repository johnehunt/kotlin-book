
fun multiply(x: Int, y: Int) = x * y

fun multBy(num: Int, func: (Int, Int) -> Int): (Int) -> Int {
    return fun(y: Int) = func(num, y)
}

fun main() {
    println("multiply(2, 5): ${multiply(2, 5)}")

    val double = multBy(2, ::multiply)
    val triple = multBy(3, ::multiply)

    println("double(5): ${double(5)}")
    println("triple(5): ${triple(5)}")

    val doubler = multBy(2) {i, j -> i * j}
    val tripler = multBy(3) {i, j -> i * j}

    println("doubler(5): ${doubler(5)}")
    println("tripler(5): ${tripler(5)}")

}