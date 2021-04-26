package com.midmarsh.inner

class AnonymousInnerObject {
    fun doSomething() {
        val data = object {
            val x = 10
            val y = 5
        }
    }
}

fun main() {
    val c = AnonymousInnerObject()
    c.doSomething()
}