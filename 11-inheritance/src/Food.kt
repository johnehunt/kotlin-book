open class Food {
    open fun eatMe() = println("Food - eatMe()")
}

open class Cake: Food() {
    final override fun eatMe() = println("Cake - eatMe()")
}

open class Biscuit: Food() {
    override fun eatMe() = println("Biscuit - eatMe()")
}
