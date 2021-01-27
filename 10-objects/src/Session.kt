object Session {

    val id: Int = 5

    override fun toString(): String {
        return "Session($id)"
    }
}

fun main() {

    println(Session)
    val s: Session = Session
    println(s)

}