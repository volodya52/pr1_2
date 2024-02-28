class Kk(balance: Double, var isBlocked: Boolean = false) : Check(balance) {

    fun Blok() {
        isBlocked = true
        println("Карта заблокирована")
    }
}
