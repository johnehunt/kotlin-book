package interfaces

object MyObject: Organizer, Printer, Speaker {

    // Organizer member property
    override val owner: String = "John"

    // Speaker member function
    override fun saySomething() {}
    // Printer member function
    override fun prettyPrint() {}
    // Organizer member functions
    override fun add(appointment: String, date: String) {}
    override fun get(date: String): String? = null
    override fun remove(date: String): Boolean = false

}