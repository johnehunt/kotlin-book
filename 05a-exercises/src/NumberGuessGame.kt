import kotlin.random.Random

fun printWelcomeMessage() {
    println("Welcome to the number guess game")
    println("================================")
}

fun getUserInput(prompt: String): String {
    print(prompt)
    return readLine() ?: ""
}

fun printEndOfGameMessage(
    foundNumber: Boolean,
    countNumberOfTries: Int,
    numberToGuess: Int) {
    if (foundNumber) {
        println("Well Done You Won!")
        println("You took $countNumberOfTries goes to complete the game")
    } else {
        println("Sorry - You Loose")
        println("The number you needed to guess was $numberToGuess")
    }
}

fun playGame() {
    var gameOver = false

    while (!gameOver) {
        val numberToGuess = Random.nextInt(0, 11)
        var countNumberOfTries = 0

        var foundNumber = false
        var keepPlaying = true

        while (keepPlaying) {
            val guess = getUserInput("Please guess a number between 1 and 10: ")
            // Check to see if the user entered 'cheat mode'
            if (guess == "-1") {
                println("Cheat Mode: The number to guess is $numberToGuess")
            } else {
                countNumberOfTries++
                val intGuess = guess.toInt()
                if (intGuess != numberToGuess) {
                    println("Sorry wrong number")

                    if (countNumberOfTries == 4) {
                        break
                    } else if ((intGuess == numberToGuess - 1) ||
                        (intGuess == numberToGuess + 1)
                    ) {
                        println("You were within 1 of the correct value")
                    } else if (intGuess < numberToGuess) {
                        println("You guess was lower than the number")
                    } else {
                        println("Your guess was higher than the number")
                    }
                } else {
                    keepPlaying = false
                    foundNumber = true
                }
            }

        }

        printEndOfGameMessage(foundNumber, countNumberOfTries, numberToGuess)

        val response = getUserInput("Do you want to play again (y/n): ")
        if (response.toLowerCase() == "n") {
            gameOver = true
        }

    }

}

fun main() {
    printWelcomeMessage()
    playGame()
    println("Game Over")
}
