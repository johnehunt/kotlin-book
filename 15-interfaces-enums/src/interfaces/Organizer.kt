package interfaces

interface Organizer {
    val owner: String
    fun add(appointment: String, date: String)
    fun get(date: String): String?
    fun remove(date: String): Boolean
}