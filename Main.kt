fun main(){
    println("Кличка собаки")
   var dogname= readLine()!!.toString()
    println("Окрас собаки")
    var dogcolor= readLine()!!.toString()
    println("Введите вес собаки")
    var dogves= readLine()!!.toDouble()
    println("Введите породу собаки")
    var dogporoda=readLine()!!.toString()
    println("Введите рост собаки")
    var dogrost= readLine()!!.toInt()
    println("Какой характер у собаки?")
    var dogharakter= readLine()!!.toString()
    var dog=Sobaka1("${dogharakter}","${dogporoda}","${dogname}","${dogcolor}","${dogrost}","${dogporoda}")
    dog.Info()




}