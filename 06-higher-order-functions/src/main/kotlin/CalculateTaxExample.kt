
fun simpleTaxCalculator(amount: Double) = amount * 0.3

fun calculateTax(salary: Double, func: (Double) -> Double): Double {
    return func(salary)
}

fun main() {
    val tax = calculateTax(45000.0, ::simpleTaxCalculator)
    println("Tax payable: $tax")

    val tax2 = calculateTax(45000.0) {amount -> amount * 0.25}
    println("Tax payable: $tax2")
}