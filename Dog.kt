open class Dog(var name:String,var color:String) {
    open fun Name(){
        println("Кличка собаки - ${name}")
    }
    open fun Color(){
       println("Окрас собаки - ${color}")
    }
    open fun Info(){
        println("Кличка собаки - ${name},окрас - ${color}")
    }
}