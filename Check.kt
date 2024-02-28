open class Check(var balance: Double) {
    fun Oplata(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Заказ оплачен на сумму $amount. Текущий баланс: $balance")
        } else {
            println("Недостаточно средств для оплаты заказа")
        }
    }

    fun Oplataperevod(account: Check, amount: Double) {
        if (balance >= amount) {
            balance -= amount
            account.balance += amount
            println("Перевод выполнен. Текущий баланс: $balance")
        } else {
            println("Недостаточно средств для перевода")
        }
    }

    fun cancel() {
        println("Счет аннулирован")
    }
}

