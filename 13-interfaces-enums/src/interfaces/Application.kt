package interfaces

class Application(override val owner: String) : Cloneable,
        Organizer,
        Printer,
        Speaker {

    override fun saySomething() {}
    override fun prettyPrint() {}
    override fun add(appointment: String, date: String) {}
    override fun get(date: String): String? = null
    override fun remove(date: String): Boolean = false

}