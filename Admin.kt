class Admin {
    fun Blockcard(card: Kk, blokadm: Boolean) {
        if (blokadm) {
            card.Blok()
            println("Карта заблокирована администратором за превышение платежа")
        }
    }
}
