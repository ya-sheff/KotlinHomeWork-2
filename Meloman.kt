fun main() {
    val quantity = 1100
    val count = 100
    val discount1 = 100
    val discount2 = 0.05
    val discount3 = 0.01

    val payment = count * quantity
    val superDiscount = ((payment - (payment * discount2)) * discount3)

    when (payment) {
        in 0..1000 -> println("For payment: $payment RUB (without discount)")
        in 1001..10_000 -> println("For payment: ${(payment - discount1)} RUB (discount 100 RUB)"
                + "\n" + "Without discount: " + payment + " RUB")
        in 10_001..100_000 -> println("For payment: ${payment - (payment * discount2)} RUB (discount 5% )"
                + "\n" + "Without discount: " + payment + " RUB")
        in 101_000..1_000_000 -> println("For payment: ${(payment - (payment * discount2)) - superDiscount}" +
                "RUB (You are monthly user and you have discount 5% and 1%)"
                + "\n" + "Without discount: " + payment + " RUB")
    }


}



