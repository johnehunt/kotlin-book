fun makeAnonFunction(): (Int, Int) -> Int {
    return fun(x: Int, y: Int) = x + y
}

fun makeNamedFunction(): (Int, Int) -> Int {
    fun adder(x: Int, y: Int): Int {
        return x + y
    }
    return ::adder
}

fun main() {
    val func1 = makeAnonFunction()
    println("func1(3, 2): ${func1(3, 2)}")
    println("func1(3, 3): ${func1(3, 3)}")
    println("func1(3, 1): ${func1(3, 1)}")

    println("-------------")

    val func2 = makeNamedFunction()
    println("func2(3, 2): ${func2(3, 2)}")
    println("func2(3, 3): ${func2(3, 3)}")
    println("func2(3, 1): ${func2(3, 1)}")
}