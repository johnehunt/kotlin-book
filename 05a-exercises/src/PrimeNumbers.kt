

fun main() {
    print("Please input a number: ")
    val inputString = readLine()
    if (inputString == null) {
        println("No number input")
    } else {
        val number = inputString.toInt()
        if (number <= 2) {
            println("Number must be an integer greater than 2")
        } else {
            var primeNumber = true
            for (i in 2..number) {
                for (j in 2..i) {
                    if ((i % 2) == 0) {
                        primeNumber = false
                        break
                    }
                }
                if (primeNumber) {
                    println("Prime number $i")
                }
                primeNumber = true
            }
        }
    }
}