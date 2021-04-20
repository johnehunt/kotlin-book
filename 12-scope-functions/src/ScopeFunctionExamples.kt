
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
    // the instance. Typically used to set up an instance
    val user = User("John").apply {
        this.id = "123"
        game = "Nightfall"  // can reference this implicitly
    }
    println("user: $user")

    // Illustrates typical use of the run scope function
    user.run{
        print("Please input the users favourite game: ")
        val favouriteGame: String ? = readLine()
        game = favouriteGame ?: ""
    }
    println("user: $user")

    user.game = "Nightfall"

    // Use let to execute 1 or more operations on an object
    // let lambda returns a result
    val s2 = user.let { it.name.toUpperCase() }
    println("s2 $s2")
    val s3 = user.let {
        println(it)
        println(it.name)
        it.name.toUpperCase()
    }
    println("s3 $s3")

    val r1 = user.name.let{
        name -> name.toUpperCase()
    }
    println("r1: $r1")

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
    val user2 = User("John").also {
        println(it)
        it.id = "456"
        it.game = "Monopoly"
    }
    println("user2: $user2")

    val user3 = User("John").also {u ->
        println(u)
        u.id = "456"
        u.game = "Monopoly"
    }
    println("user3: $user3")

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