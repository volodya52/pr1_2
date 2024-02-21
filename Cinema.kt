open class Cinema(var filmname:String,var seans:String,var price:Double) {
    open fun Info(){
        println("Название фильма - ${filmname}")
        println("Сеанс - ${seans}")
        println("Цена - ${price}")

    }
}