// Brings together most of the Kotlin interface concepts

package interfaces

interface Utility {

    val name: String
    var count: Int

    fun printMe() {
        println("PrintMe")
        println(MAX)
        println(total)
        doSomething()
    }

    fun printIt(): Unit

    companion object {
        const val MAX = 100
        var total = 0
        fun doSomething() {
            println("doSomething")
        }
    }

}

// class Box(override val name: String) : Utility, Any() {
class Box(override val name: String) : Any(), Utility {

    override var count: Int = 0

    override fun printIt() {
        println("PrintIt")
    }

}

fun main() {
    val b = Box("ID123")
    println(b.count)
    println(b.name)
    b.printIt()
    b.printMe()
}