package com.jjh.util

/**
 * A simple class to represent a Person Object.
 * @author jeh
 * @version 1.0
 */
open class Person(val name: String, val age: Int) {
    protected fun doSomething() {
        println("doSomething")
    }
}