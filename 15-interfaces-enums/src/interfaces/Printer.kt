package interfaces

interface Printer {
    fun prettyPrint()

    fun printLabel() {
        println(label)
        printMe()
    }

    companion object {
        private val label = "Label"
		fun printMe() {
            println("Printer - printMe")
        }
    }
}