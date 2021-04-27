package collections

class Stack<T>(val contents: MutableList<T> = mutableListOf<T>()) {

    fun push(element: T) = contents.add(element)
    fun pop(): T = contents.removeLast()
    fun top(): T = contents.last()

    override fun toString(): String {
        return "Stack($contents)"
    }

    val size: Int
        get() = contents.size

    val isEmpty: Boolean
        get() = contents.isEmpty()

}

fun prettyPrintItem(element: String) {
    println("\telement: '$element'")
}

fun main() {
    val stack = Stack<String>()
    stack.push("Task1")
    stack.push("Task2")
    stack.push("Job1")
    stack.push("Task3")
    stack.push("Job2")
    println(stack)

    // Apply functions to stack contents using forEach, map and filter
    println("Printing the stack contents using forEach")
    stack.contents.forEach(::prettyPrintItem)

    println("Stack contents as uppercase strings")
    val capsList = stack.contents.map{ it.toUpperCase() }
    println(capsList)

    println("Found all elements representing Jobs")
    val filteredList = stack.contents.filter{ it.startsWith("Job") }
    println(filteredList)

}