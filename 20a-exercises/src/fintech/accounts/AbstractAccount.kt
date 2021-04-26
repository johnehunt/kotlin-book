package fintech.accounts

import java.lang.RuntimeException
import java.time.LocalDateTime

class AmountException(msg: String): RuntimeException(msg)
class BalanceException (msg: String,
                        val acc: Account): RuntimeException(msg)

enum class InvestmentAccountTypes {
    HighRisk, MediumRisk, LowRisk
}

interface Transaction {
    val amount: Double
    val type: String
    val datetime: LocalDateTime
    val transactionBalance: Double
}

interface Account {

    val accountNumber: String
    val holder: Customer
    val balance: Double

    fun deposit(amount: Double): Transaction

    fun withdraw(amount: Double): Transaction
}

abstract class AbstractAccount(
    override val accountNumber: String,
    override val holder: Customer,
    openingBalance: Double) : Account {

    companion object {
        private var count = 0
        fun printInstancesCreated() {
            println("$count instances of Account class created")
        }
    }

    inner class DefaultTransaction(
        override val amount: Double,
        override val type: String = "deposit",
        override val datetime: LocalDateTime = LocalDateTime.now()): Transaction {

        override val transactionBalance: Double =
            if (type == "deposit")
                balance + amount
            else
                balance - amount

        override fun toString(): String {
            return "Transaction($amount, $type, $datetime, transactionBalance=$transactionBalance)"
        }

    }

    override var balance: Double = 0.0
        protected set

    init {
        println("New Account created for $holder")
        count++
        balance = openingBalance
    }

    override fun deposit(amount: Double): Transaction {
        if (amount < 0) {
            throw AmountException("Cannot deposit negative amounts")
        }
        balance += amount
        return DefaultTransaction(amount)
    }

    override fun withdraw(amount: Double): Transaction {
        if (amount < 0) {
            throw AmountException("Cannot withdraw negative amounts")
        }
        balance -= amount
        return DefaultTransaction(amount, "withdrawal")
    }

    override fun toString(): String {
        return "Account('$accountNumber', '$holder', $balance)"
    }

    operator fun plus(amount: Double): Double = deposit(amount).transactionBalance
    operator fun minus(amount: Double): Double = withdraw(amount).transactionBalance

}

class CurrentAccount(accountNumber: String,
                             holder: Customer,
                             openingBalance: Double,
                             val overdraftLimit: Double) : AbstractAccount(accountNumber, holder, openingBalance) {

    override fun withdraw(amount: Double): Transaction {
        if (balance - amount < overdraftLimit) {
            throw BalanceException("Withdrawal would exceed your overdraft limit", this)
        } else {
            if (amount < 0) {
                throw AmountException("Cannot deposit negative amounts")
            }
            balance -= amount
            return DefaultTransaction(amount, "withdrawal")
        }
    }

    override fun toString(): String {
        return "Current${super.toString()} - overdraft $overdraftLimit"
    }

}

class DepositAccount(accountNumber: String,
                             holder: Customer,
                             openingBalance: Double,
                             val interestRate: Double): AbstractAccount(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Deposit${super.toString()} - interestRate $interestRate"
    }

}

class InvestmentAccount(accountNumber: String,
                                holder: Customer,
                                openingBalance: Double,
                                val type: InvestmentAccountTypes): AbstractAccount(accountNumber, holder, openingBalance) {

    override fun toString(): String {
        return "Investment${super.toString()} - type $type"
    }

}
