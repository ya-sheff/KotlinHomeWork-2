fun main() {

    var transfer = 56700
    val commission = 0.75
    val min = 35

    val amount = ((transfer * commission) / 100)

    if (amount < min) {
        println("The transfer amount with comission: ${transfer + min}" + " RUB")
    } else {
        println("The transfer amount with comission: ${transfer + amount}" + " RUB")

    }

}

