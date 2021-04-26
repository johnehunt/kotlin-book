package fintech.main

import fintech.accounts.*

fun main() {
    val customer1 = Customer("John", "10 High Street", "john@gmail.com")
    val acc1 = CurrentAccount("123", customer1, 10.05, -100.00)

    val customer2 = Customer("Denise", "11 Main Street", "denise@gmail.com")
    val acc2 = DepositAccount("345", customer2, 23.55, 0.5)

    val customer3 = Customer("Phoebe", "12 Market Square", "phoebe@gmail.com")
    val acc3 = InvestmentAccount("567", customer3, 12.45, InvestmentAccountTypes.HighRisk)

    println(acc1)
    println(acc2)
    println(acc3)

    println(acc1.deposit(23.45))
    println(acc1.withdraw(12.33))

    try {
        acc1.deposit(-1.0)
    } catch (exp: AmountException) {
        exp.printStackTrace()
    }

    println("balance: ${acc1.balance}")
    try {
        println("balance: ${acc1.balance}")
        acc1.withdraw(300.00)
        print("balance: ${acc1.balance}")
    } catch (exp: BalanceException) {
        println("Handling Exception")
        println("Problem occurred on account: ${exp.acc}")
    }
    println("balance: ${acc1.balance}")

    AbstractAccount.printInstancesCreated()

    println(acc1 + 10.55)
    println(acc1 - 5.0)

}