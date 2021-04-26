
fun main() {
    print("Please input a number: ")
    val inputString = readLine()
    if (inputString == null) {
        println("No number input")
    } else {
        val number = inputString.toInt()
        if ((number % 2) == 0) {
            println("Number is even")
        } else {
            println("Number is odd")
        }
    }
}