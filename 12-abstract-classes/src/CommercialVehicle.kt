
abstract class CommercialVehicle {
    // Abstract property
    abstract val owner: String
    // abstract member function
    abstract fun load(contents: String)
}

class Lorry(override val owner: String) : CommercialVehicle() {
    override fun load(contents: String) {
        println("loading $contents")
    }
}

abstract class Van(override val owner: String) : CommercialVehicle() {

}


fun main() {
    val l = Lorry("Smith and Co.")
    l.load("Hay")
}