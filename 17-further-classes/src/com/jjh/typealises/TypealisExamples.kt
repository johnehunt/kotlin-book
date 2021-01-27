package com.jjh.typealises

class Person(val name: String, val age: Int)
data class Node(val value: Any)

typealias Player = Person
typealias NodeSet = Set<Node>

typealias Test<T> = (T) -> Boolean
