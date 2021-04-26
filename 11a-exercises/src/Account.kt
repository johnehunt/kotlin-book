class Account(
    val accountNumber: String,
    val holder: String,
    openingBalance: Double,
    val type: String
) {

    companion object {
        private var count = 0
        fun printInstancesCreated() {
            println("$count instances of Account class created")
        }
    }

    var balance: Double
        private set

    init {
        println("New Account created for $holder of $type")
        count++
        balance = openingBalance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }

    override fun toString(): String {
        return "Account('$accountNumber', '$holder', $balance, type='$type')"
    }

}

fun main() {
    val acc1 = Account("123", "John", 10.05, "current")
    val acc2 = Account("345", "John", 23.55, "savings")
    val acc3 = Account("567", "Phoebe", 12.45, "investment")

    println(acc1)
    println(acc2)
    println(acc3)

    acc1.deposit(23.45)
    acc1.withdraw(12.33)
    println("balance: ${acc1.balance}")

    println("balance: ${acc1.balance}")
    acc1.withdraw(300.00)
    println("balance: ${acc1.balance}")

    Account.printInstancesCreated()

    val message = acc1.run {
        if (balance < 0) {
            "You need an overdraft"
        } else {
            "You are a good customer; you are in credit"
        }
    }
    println(message)

    val acc4 = Account(
        "789",
        "Jasmine",
        0.0,
        "current"
    ).apply {
        deposit(10.55)
    }
    println(acc4)
}