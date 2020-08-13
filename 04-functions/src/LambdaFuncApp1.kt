val increment: (Int) -> Int = { x -> x + 1 }
val increase = { x: Int -> x + 1 }

val func0: () -> Unit = { println("no args") }
val func1 = { println("no args") }
val func2: (Int, Int) -> Int = { x, y -> x * y }
val func3 = { x: Int, y: Int -> x * y }

fun main() {
    println(increment(5))
    println(increase(5))

    func0()
    func1()
    println(func2(3, 4))
    println(func3(2, 3))

}