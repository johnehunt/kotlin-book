package fintech.main

import fintech.accounts.*

fun main() {
    val acc1 = CurrentAccount("123", "John", 10.05, -100.00)
    val acc2 = DepositAccount("345", "Denise", 23.55, 0.5)
    val acc3 = InvestmentAccount("567", "Phoebe", 12.45, InvestmentAccountTypes.HighRisk)

    println(acc1)
    println(acc2)
    println(acc3)

    println(acc1.deposit(23.45))
    println(acc1.withdraw(12.33))

    println("balance: ${acc1.balance}")
    println(acc1.withdraw(300.00))
    println("balance: ${acc1.balance}")

    AbstractAccount.printInstancesCreated()
}