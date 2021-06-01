import kotlin.random.Random

val numberToGuess = Random.nextInt(0, 11)

fun main() {

    println("Welcome to the number guess game")

    print("Please guess a number between 1 and 10: ")
    val guess:String = readLine() ?: ""
    var intGuess = guess.toInt()

    var countNumberOfTries = 1
    while (numberToGuess != intGuess) {
        println("Sorry wrong number")

        if (countNumberOfTries == 4) {
            break
        } else if (intGuess < numberToGuess) {
            println("Your guess was lower than the number")
        } else {
            println("Your guess was higher than the number")
        }

        print("Please guess again between 1 and 10: ")
        val guess = readLine() ?: ""
        intGuess = guess.toInt()
        countNumberOfTries++
    }

    if (numberToGuess == intGuess) {
        println("Well Done You Won!")
        println("You took $countNumberOfTries goes to complete the game")
    } else {
        println("Sorry - You Loose")
        println("The number you needed to guess was $numberToGuess")
    }

    println("Game Over")

}

