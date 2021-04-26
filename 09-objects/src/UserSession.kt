class UserSession private constructor(val id: Int) {

    // Companion (singleton) object
    companion object {
        private val MAX = 100
        private var count = 0
        private fun next() = count++
        fun create(): UserSession {
            next()
            return UserSession(count)
        }
    }

    fun printData() {
        println("Id is $id and MAX is $MAX")
    }

    override fun toString(): String {
        return "UserSession($id)"
    }

}

fun main() {
    // val session0 = Session(42) // results in a compile time error
    val session1 = UserSession.create()
    println(session1)
    val session2 = UserSession.create()
    println(session2)
    session1.printData()
}