package delegation

/**
 * Interface to be implemented
 */
interface Role {
    fun printRole(): Unit
}

/**
 * Class implementing interface
 */
class TellerRole(val name: String) : Role {
    override fun printRole() = println("Role: $name")
}

object PrinterObject : Role {
    override fun printRole() = println("PrinterObject Role")
}

class Cashier(name: String) : Role {
    private val tellerRole: TellerRole = TellerRole(name)
    override fun printRole() = tellerRole.printRole()
}

// Implements the delegation design pattern
// All implementations of the Role interface methods are automatically
// delegated to TellerRole
class User(name: String) : Role by TellerRole(name)

fun main() {
    val user = User("Player1")
    user.printRole()

    PrinterObject.printRole()
}