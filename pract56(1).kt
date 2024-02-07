import kotlin.math.pow
fun main(){
    try{
        println("Введите число")
        var x= readLine()!!.toDouble()
        when{
            (x>3)->println("Ваш результат = ${-3*x+9}")
            (x<=3)->println("Ваш результат = ${x.pow(3)/x.pow(2)+8}")
        }

    }catch(a:Exception){
        println("Введен символ")
    }
}