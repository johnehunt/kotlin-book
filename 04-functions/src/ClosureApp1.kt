fun main() {
    var more = 100
    val increase: (Int) -> Int = { i -> i + more }

    println(increase(10))
    more = 50
    println(increase(10))
}