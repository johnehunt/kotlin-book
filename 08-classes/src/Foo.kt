object Bar {
    fun getValue(): String = ""
    fun getDerivedValue(x: String): String = ""

}

class Foo() {
    val x = Bar.getValue()

    init {
        // check the validity of x and abort if invalid
    }

    val y = Bar.getDerivedValue(x)  // requires x to be valid

    init {
        // continue with initialization
    }
}