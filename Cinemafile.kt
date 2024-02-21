fun main(){
    println("Какой фильм вы хотите посмотреть?")
    var filmname= readLine()!!.toString()
    println("В каком формате (онлайн/зал")
    var onlineorzal= readLine()!!.toString()
    if (onlineorzal=="онлайн"){
        println("Сколько зрителей в онлайне?")
        var watchers= readLine()!!.toInt()
        var onlinecinema=Onlinecinema("${watchers}","${filmname}","Вечерний")
    }


}