package interfaces

interface Printer {
    fun prettyPrint()

    companion object {
		fun printMe() {
            println("Printer - printMe")
        }
    }
}