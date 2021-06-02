package interfaces

interface Printer {
    fun prettyPrint()

    fun printLabel() {
        println(label)
        printMe()
    }

    companion object {
        private const val label = "Label"
		fun printMe() {
            println("Printer - printMe")
        }
    }
}