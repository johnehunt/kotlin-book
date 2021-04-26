
fun main() {

    print("Please input a distance in kilometers: ")
    val inputString = readLine()
    if (inputString == null) {
        println("No number input")
    } else {
        val kilometres = inputString.toInt()
        if (kilometres < 0) {
            println("The distance must be positive")
        } else {
            val miles = kilometres * 0.621371
            println("$kilometres km as $miles miles")
        }
    }

}