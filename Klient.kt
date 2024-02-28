class Klient(val account: Check) {
    fun Oplata(price: Double) {
        account.Oplata(price)
    }

    fun Oplatarperevodom(account: Check, price: Double) {
        this.account.Oplataperevod(account, price)
    }

    fun Blokirovka() {
        if (account is Kk) {
            account.Blok()
        } else {
            println("У клиента нет банковской карты")
        }
    }

    fun Ann() {
        account.cancel()
    }
}

