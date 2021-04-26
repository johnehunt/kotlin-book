abstract class Account(
    val accountNumber: String,
    val holder: String,
    openingBalance: Double) {

    companion object {
        private var count = 0
        fun printInstancesCreated() {
            println("$count instances of Account class created")
        }
    }

    var balance: Double
        protected set

    init {
        println("New Account created for $holder")
        count++
        balance = openingBalance
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    open fun withdraw(amount: Double) {
        balance -= amount
    }

    override fun toString(): String {
        return "Account('$accountNumber', '$holder', $balance)"
    }

}

class CurrentAccount(accountNumber: String,
                     holder: String,
                     openingBalance: Double,
                     val overdraftLimit: Double) : Account(accountNumber, holder, openingBalance) {

    override fun withdraw(amount: Double) {
        if (balance - amount < overdraftLimit) {
            println("Withdrawal would exceed your overdraft limit")
        } else {
            balance -= amount
        }
    }

    override fun toString(): String {
        return "Current${super.toString()} - overdraft $overdraftLimit"
    }

}

class DepositAccount(accountNumber: String,
                     holder: String,
                     openingBalance: Double,
                     val interestRate: Double): Account(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Deposit${super.toString()} - interestRate $interestRate"
    }

}

class InvestmentAccount(accountNumber: String,
                        holder: String,
                        openingBalance: Double,
                        val type: String): Account(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Investment${super.toString()} - type $type"
    }

}

fun main() {
    val acc1 = CurrentAccount("123", "John", 10.05, -100.00)
    val acc2 = DepositAccount("345", "Denise", 23.55, 0.5)
    val acc3 = InvestmentAccount("567", "Phoebe", 12.45, "high risk")

    println(acc1)
    println(acc2)
    println(acc3)

    acc1.deposit(23.45)
    acc1.withdraw(12.33)

    println("balance: ${acc1.balance}")
    acc1.withdraw(300.00)
    println("balance: ${acc1.balance}")

    Account.printInstancesCreated()
}