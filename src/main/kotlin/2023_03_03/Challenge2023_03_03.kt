package `2023_03_03`

fun main() {

    val account = Account("Kotlin")
    account.deposit(1000)
    account.withdraw(500)
    account.deposit(-20)
    account.deposit(200)
    account.withdraw(-100)
    println("Balance: ${account.calculateBalance()}")
}

class Account(val accountName: String) {
    //Made private so this value isn't modified outside of the class's methods
    private var balance = 0
    //Transactions shouldn't be modified outside of this class's methods. Hence private access modifier
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance: $balance")
        } else {
            println("Cannot deposit negative amount")
        }
    }

    fun withdraw(withdrawalAmount: Int) {
        if (withdrawalAmount in 1..balance) {
            transactions.add(-withdrawalAmount)
            balance -= withdrawalAmount
            println("$withdrawalAmount withdrawn. Balance: $balance")
        } else if (withdrawalAmount > balance) {
            println("Balance insufficient")
        } else {
            println("Cannot withdraw negative amounts")
        }
    }

    fun calculateBalance(): Int {
        balance = 0
        for (transaction in transactions) {
            balance += transaction
        }
        return balance
    }
}