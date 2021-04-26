
fun main() {
    print("Please input a number: ")
    val inputString = readLine()
    if (inputString == null) {
        println("No number input")
    } else {
        val number = inputString.toInt()
        if (number < 0) {
            println("Factorial is not defined for negative numbers")
        } else if (number == 0) {
            println("1 ! factorial is 1")
        } else {
            var factorial = 1
            for (i in 1..number) {
                factorial *= i
            }
            println("$number ! factorial is $factorial")
        }
    }
}