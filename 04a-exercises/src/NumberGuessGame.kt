import kotlin.random.Random

val numberToGuess = Random.nextInt(0, 11)

fun main() {

    var gameOver = false
    println("Welcome to the number guess game")

    while (!gameOver) {
        var countNumberOfTries = 0

        var foundNumber = false
        var keepPlaying = true

        while (keepPlaying) {
            print("Please guess a number between 1 and 10: ")
            val guess = readLine() ?: ""
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

        if (foundNumber) {
            println("Well Done You Won!")
            println("You took $countNumberOfTries goes to complete the game")
        } else {
            println("Sorry - You Loose")
            println("The number you needed to guess was $numberToGuess")
        }

        print("Do you want to play again (y/n): ")
        val response = readLine() ?: ""
        if (response.toLowerCase() == "n") {
            gameOver = true
        }


    }

    println("Game Over")

}
