
fun curry(amount: Double, func: (Double, Double) -> Double): (Double) -> Double {
    return fun(y: Double) = func(amount, y)
}

fun convert(amount: Double, rate: Double) = amount * rate

fun main() {
    val dollarsToSterling = curry(0.77, ::convert)
    println(dollarsToSterling(5.0))

    val euroToSterling = curry(0.88, ::convert)
    println(euroToSterling(15.0))

    val sterlingToDollars = curry(1.3, ::convert)
    println(sterlingToDollars(7.0))

    val sterlingToEuro = curry(1.14, ::convert)
    println(sterlingToEuro(9.0))

}