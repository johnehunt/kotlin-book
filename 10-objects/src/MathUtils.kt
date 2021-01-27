object MathUtils {

    // Specifying useful properties
    val ZERO = 0
    val MIN: Int = -100

    // Property to be initialized in init block
    val MAX: Int

    // Initialization block
    init {
        MAX = 100
    }

    // Providing utility member functions
    fun add(x: Int, y: Int) = x + y
    fun sub(x: Int, y: Int) = x - y
    fun isLessThanMax(x: Int) = x < MAX

}

fun main() {
    // Now uses singleton object to access member funcs
    println("MathUtils.ZERO: ${MathUtils.ZERO}")
    println("MathUtils.MIN: ${MathUtils.MIN}")
    println("MathUtils.MAX: ${MathUtils.MAX}")

    println("MathUtils.add(2, 3): ${MathUtils.add(2, 3)}")
    println("MathUtils.sub(6, 2): ${MathUtils.sub(6, 2)}")
}
