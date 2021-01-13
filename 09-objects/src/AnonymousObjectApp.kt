fun main() {

    // Defines a new object which is anonymous
    val obj = object {
        var x: Int = 0
        val y = 42

        val MAX: Int

        init {
           MAX = 100
        }

        fun printMe() {
            println("Print Me")
        }
    }

    // Use single instance of anonymous object
    println(obj)
    println(obj.MAX)
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.x = 50
    println("obj.x = ${obj.x}, obj.y = ${obj.y}")
    obj.printMe()
}