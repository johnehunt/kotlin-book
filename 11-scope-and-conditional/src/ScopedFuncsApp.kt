package com.jjh.scoping

class User(val name: String) {
    var id: String = ""
    var game: String = ""

    override fun toString(): String {
        return "User(name='$name', id='$id', game='$game')"
    }
}

class Service(val url: String) {
    var port = 80
    fun query(method: String): Boolean {
        println("$method on $url:$port")
        return true
    }
}

fun main() {
    // Use apply for code blocks that return
    // the bound instance and (typically) configure
    // the instance.
    val user = User("John").apply {
        this.id = "123"
        game = "Nightfall"  // can reference this implicitly
    }
    println("${user.id} ${user.name}")

    // Use let to execute 1 or more operations on an object
    // let lambda returns a result
    val s = "Hello World"
    val s2 = s.let { it.toUpperCase() }
    val s3 = s.let {
        println(it)
        it.toUpperCase()
    }

    // with - allows sequence of operations to be written all
    // relating to the object passed to it. Avoid repeatedly
    // referencing object. May be a nullable
    val label = with(user) {
        id = "new$id" // implicit reference to this
        game = "new$game"
        println(this)
        this.toString()
    }
    println("label: $label")

    // Receiver Instance bound to it, returns bound
    // instance as result
    val user2 = user.also { println(it) }

    // 'run' binds receiver to this returns result of lambda
    // can reference this directly
    // useful when your lambda contains both the
    // object initialization and the computation of the
    // return value.
    val service = Service("http://www.midmarsh.com")
    val result = service.run {
        port = 8080
        query("get")
    }
    println("result: $result")

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