open class Food(open val type: String = "generic") {
    open fun eatMe() = println("Food - eatMe()")
}

open class Cake(final override val type: String = "Sponge"): Food() {
    final override fun eatMe() = println("Cake - eatMe()")
}

open class Biscuit(override val type: String = "Sweet"): Food() {
    override fun eatMe() = println("Biscuit - eatMe()")
}

fun main() {
    val c = Cake()
    println(c.type)
    c.eatMe()
}