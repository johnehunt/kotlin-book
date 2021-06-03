package fintech.accounts

fun AbstractAccount.prettyPrint() {
    println("${this::class} \n\t$holder \n\t$accountNumber \n\t$balance")
}