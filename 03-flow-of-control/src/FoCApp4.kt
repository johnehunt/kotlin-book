fun main() {

    println("Starting")

    print("Enter a number: ")
    val inputString = readLine()
    val number = inputString!!.toInt()

    if (number > 0) {
        println("$number is positive")
        println("$number squared is: ${number *number}")
    } else if (number == 0) {
        println("$number Its Zero")
    } else {
        println("$number Its negative")
    }

    println("Bye")

}