
fun main() {

    print("Please input a number: ")
    val inputString = readLine()
    if (inputString == null) {
        println("No number input")
    } else {
        val number = inputString.toInt()
        if (number > 0) {
            println("Number is positive")
        } else if (number < 0) {
            println("Number is negative")
        } else {
            println("Number is zero")
        }
    }

}