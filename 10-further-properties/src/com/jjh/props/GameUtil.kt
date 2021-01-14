package com.jjh.props

/**
 * Singleton object being used to hold a set of constant
 * values, a variable and
 */
object GameUtil {
    val numberOfRounds: Int = 5
    const val numberOfLives = 5 // Indicates that this is a compile time constant
    var currentRound = 0

    // Defines a nullable property
    // GameUtil.currentPlayer = GamePlayer("John", "Hunt", 21, "vs2")
    // GameUtil.currentPlayer = null
    var currentPlayer: GamePlayer? = null

    // Can nullify any type - can now assign
    // an int or null to count
    // GameUtil.count = 0
    // GameUtil.count = null
    var count: Int? = null
}
