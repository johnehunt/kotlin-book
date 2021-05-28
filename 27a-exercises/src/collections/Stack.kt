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

fun main() {
    val stack = Stack<String>()
    println("stack.isEmpty: ${stack.isEmpty}")
    stack.push("Task1")
    stack.push("Task2")
    stack.push("Job1")
    stack.push("Task3")
    stack.push("Job2")
    println(stack)
    println("stack.size: ${stack.size}")
    println("stack.isEmpty: ${stack.isEmpty}")
    println("Stack.top(): ${stack.top()}")
    println("Stack.top(): ${stack.pop()}")
    println(stack)
}