
fun main() {
    var more = 100
    fun increase(num: Int): Int {
        return num + more
    }

    println(increase(10))

    more = 50

    println(increase(10))
}