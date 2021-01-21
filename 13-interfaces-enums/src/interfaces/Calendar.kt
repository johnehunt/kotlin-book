package interfaces

class Calendar(override val owner: String) : Organizer {
    override fun add(appointment: String, date: String) {
        println("$appointment - $date")
    }

    override fun get(date: String): String? {
        return null
    }

    override fun remove(date: String): Boolean {
        return false
    }
}

object Diary : Organizer {
    override val owner: String = "John"

    override fun add(appointment: String, date: String) {
        println("add $appointment - $date")
    }

    override fun get(date: String): String? {
        println("get")
        return null
    }

    override fun remove(date: String): Boolean {
        println("remove")
        return false
    }
}

fun main() {
    val cal = Calendar("John")
    cal.add("Dentist", "Monday")
    val org: Organizer = cal
    org.add("Garage", "Tuesday")
    Diary.add("Opticians", "Wednesday")
    val diary: Organizer = Diary
    diary.add("Doctors", "Thursday")
}