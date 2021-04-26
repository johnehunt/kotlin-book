val func = fun(i: Int): Int { return i + 1 }

fun main() {
    println(func(5))

    val increment = fun(i: Int): Int {
        return i + 1
    }
    val decrement = fun(i: Int): Int = i - 1
    val double = fun(i: Int) = i * 2

    println(increment(5))
    println(decrement(5))
    println(double(5))

}