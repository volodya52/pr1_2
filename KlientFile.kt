fun main() {
    val primaryAccount = Check(1000.0)
    val card = Kk(500.0)

    val client = Klient(card)
    client.Oplata(200.0)
    client.Oplatarperevodom(primaryAccount, 100.0)

    val admin = Admin()
    admin.Blockcard(card, blokadm = true)

    client.Blokirovka()
    client.Ann()
}