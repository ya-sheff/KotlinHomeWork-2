fun main() {
    val commission = 0.75
    val min = 35
    val transfer = 1_000

    val amount = ((transfer * commission) / 100) + transfer + min

    println("The transfer amount: " + amount + " RUB")
}

