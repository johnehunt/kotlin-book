package com.jjh.collections

class MyQueue<T> {
    private val content = mutableListOf<T>()

    val head: T
        get() = content.first()

    val size: Int
        get() = content.size

    fun enqueue(item: T) = content.add(item)

    fun dequeue(): T = content.removeFirst()

    override fun toString(): String {
        return "MyQueue(content=$content)"
    }

}

fun main() {
    val q = MyQueue<String>()
    q.enqueue("John")
    q.enqueue("Denise")
    q.enqueue("Gryff")
    q.enqueue("Jasmine")
    println(q)
    println("q.head: " + q.head)
    val name = q.dequeue()
    println(name)
    println("q.head: " + q.head)
    q.enqueue("Phoebe")
    println("q.head: " + q.head)
    println(q)

    println("-------------------")

    val q2 = MyQueue<Int>()
    q2.enqueue(12)
    q2.enqueue(42)
    println(q2)
    println(q2.head)



}