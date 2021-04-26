package com.jjh.props

fun main() {
    println(GameUtil.currentPlayer?.toString())
    GameUtil.count = GameUtil.count?.plus(1)
    println(GameUtil.count)
    GameUtil.currentPlayer = GamePlayer("John", "Hunt", 21, "ABC123")
    println(GameUtil.currentPlayer?.toString())
}