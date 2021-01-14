class Person5(val name: String = "", var age: Int = 0) {

    /**
     * Defines initialization behaviour that is run just
     * after the class is instantiated.
     * Has access to all constructor parameters whether they
     * are properties or not
     */
    init {
        println("In Init")
    }

    init {
        println("In Init 2")
    }

    init {
        println("In Init 3")
    }
}

fun main() {
    println("Creating instance")
    val p1 = Person5("Jasmine", 23)
    println(p1)
    println("Done")
}