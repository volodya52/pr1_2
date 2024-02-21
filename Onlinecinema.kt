class Onlinecinema(var watchers:Int, filmname:String, seans:String, price:Double):Cinema(filmname,seans,price) {
   public fun Getwatchers(){
       if (watchers>10000000){
           println("Фильма не будет, сервер не выдержал")
       }else{
           println("Места есть")
       }
   }
    public fun Getprice(){
        price=299.99
    }

    override fun Info() {
        println("Название фильма - ${filmname}")
        println("Сеанс - ${seans}")
        println("Цена - ${price}")
        println("Зрителей в данный момент - ${watchers}")

    }


}
