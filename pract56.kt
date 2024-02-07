fun main(){
    try{
        println("Введите вес первого пакета с рисом в кг")
        var m= readLine()!!.toDouble()
        println("Введите вес второго пакета с рисом в кг")
        var n=readLine()!!.toDouble()
        when{
            (m<=0 && n<=0)->println("Пакеты не могут весить меньше 0")
            (m>n)->println("Первый пакет весит больше, его вес ${m} кг")
            (m==n)->println("Пакеты весят одинаково")
           else->println("Второй пакет весит больше, его вес ${n} кг")

        }
    }catch(a:Exception){
        println("Вы ввели символ")
    }
}