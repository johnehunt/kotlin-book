
var increment = fun(num: Int) = num + 1

fun resetFunction() {
    val addition = 50
    increment = fun(num: Int) = num + addition
}

fun main() {
    println(increment(5))
    resetFunction()
    println(increment(5))
}