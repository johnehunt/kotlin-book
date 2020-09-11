import kotlin.random.Random

fun main() {

    val MIN = 1
    val MAX = 6

    var rollAgain: String? = "y"

    while (rollAgain == "y") {
        println("Rolling the dices...")
        println("The values are....")
        val dice1 = Random.nextInt(MIN, MAX)
        println(dice1)
        val dice2 = Random.nextInt(MIN, MAX)
        println(dice2)
        print("Roll the dices again? (y / n): ")
        rollAgain = readLine()
    }

}