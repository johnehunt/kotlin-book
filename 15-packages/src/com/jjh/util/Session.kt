package com.jjh.util

class Session private constructor(val id: Int) {

    // Companion (singleton) object
    companion object {
        private var count = 0
        fun create(): Session {
            count++
            return Session(count)
        }
    }

    override fun toString(): String {
        return "UserSession($id)"
    }

}

fun main() {
    // val session0 = Session(42) // results in a compile time error
    val session1 = Session.create()
    println(session1)
    val session2 = Session.create()
    println(session2)
}