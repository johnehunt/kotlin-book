package com.jjh.collections

class ImmutableQueue<T>(private val head: T, private val tail: List<T>) {

    val peek: T
        get() = head

    fun enqueue(item: T) = ImmutableQueue(item, listOf(head)+ tail)
    fun dequeue() = ImmutableQueue(tail.first(), tail.drop(1))

    override fun toString(): String {
        return "ImmutableQueue(head=$head, tail=$tail)"
    }

}

fun main() {
    val q = ImmutableQueue<String>("John", listOf("Denise", "Phoebe", "Adam"))
    println("q: $q")
    println("q.peek = " + q.peek)
    val q2 = q.dequeue()
    println("q2 = $q2")
    println("q = $q")

    val q3 = ImmutableQueue("John", listOf("Denise", "Phoebe", "Adam"))

    data class Person(val name: String, val age: Int)
    val q4 = ImmutableQueue<Person>(Person("John", 57),
        listOf(Person("Denise", 54),
            Person("Phoebe", 24),
            Person("Adam", 22)))
    println(q4)
}