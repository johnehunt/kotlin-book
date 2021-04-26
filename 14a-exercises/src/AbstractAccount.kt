enum class InvestmentAccountTypes {
    HighRisk, MediumRisk, LowRisk
}

interface Account {

    val accountNumber: String
    val holder: String
    val balance: Double

    fun deposit(amount: Double)

    fun withdraw(amount: Double)
}

abstract class AbstractAccount(
    override val accountNumber: String,
    override val holder: String,
    openingBalance: Double) : Account {

    companion object {
        private var count = 0
        fun printInstancesCreated() {
            println("$count instances of Account class created")
        }
    }

    override var balance: Double = 0.0
        protected set

    init {
        println("New Account created for $holder")
        count++
        balance = openingBalance
    }

    override fun deposit(amount: Double) {
        balance += amount
    }

    override fun withdraw(amount: Double) {
        balance -= amount
    }

    override fun toString(): String {
        return "Account('$accountNumber', '$holder', $balance)"
    }

}

class CurrentAbstractAccount(accountNumber: String,
                             holder: String,
                             openingBalance: Double,
                             val overdraftLimit: Double) : AbstractAccount(accountNumber, holder, openingBalance) {

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

class DepositAbstractAccount(accountNumber: String,
                             holder: String,
                             openingBalance: Double,
                             val interestRate: Double): AbstractAccount(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Deposit${super.toString()} - interestRate $interestRate"
    }

}

class InvestmentAbstractAccount(accountNumber: String,
                                holder: String,
                                openingBalance: Double,
                                val type: InvestmentAccountTypes): AbstractAccount(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Investment${super.toString()} - type $type"
    }

}

fun main() {
    val acc1 = CurrentAbstractAccount("123", "John", 10.05, -100.00)
    val acc2 = DepositAbstractAccount("345", "Denise", 23.55, 0.5)
    val acc3 = InvestmentAbstractAccount("567", "Phoebe", 12.45, InvestmentAccountTypes.HighRisk)

    println(acc1)
    println(acc2)
    println(acc3)

    acc1.deposit(23.45)
    acc1.withdraw(12.33)

    println("balance: ${acc1.balance}")
    acc1.withdraw(300.00)
    println("balance: ${acc1.balance}")

    AbstractAccount.printInstancesCreated()
}