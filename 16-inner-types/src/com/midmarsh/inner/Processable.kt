package com.midmarsh.inner

interface Processable {
    class InnerClass(val id: String)
    object InnerObject{
        val name: String = "Title"
    }
    fun doSomething(): Boolean
}

class Processor: Processable {
    override fun doSomething(): Boolean {
        println("DoSomething")
        return true
    }
}