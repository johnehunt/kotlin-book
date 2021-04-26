package com.jjh.scoping

fun main() {
    val service = Service("http://www.midmarsh.com").apply{
        port = 8080
    }

    // Conditional Execution
    // Take the value if the condition is met
    service.takeIf { service.port > 1024 }?.run {
        println(query("get"))
    }

    // Take the value if the condition is not met
    service.takeUnless{service.port > 1024 }?.run {
        println(query("get"))
    }
}