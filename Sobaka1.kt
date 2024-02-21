class Sobaka1(var character:String,var breedDog:String,name:String,color:String,var rost:String,var poroda:String):Dog(name, color) {
    private var ves= readLine()!!.toDouble()
    public fun Getweight():Double{
        return ves
    }
    public fun Setweight(ves:Double){
        if (ves<=0){
            println("Вес не может быть <=0")
        }else{
            this.ves=ves
        }
    }

    override fun Name() {
        println("Кличка собаки - ${name}")
    }

    override fun Color() {
        println("Окрас собаки - ${color}")
    }

    override fun Info()
    {
        println("Кличка собаки - ${name}")
        println("Порода собаки - ${poroda}")
        println("Характер собаки - ${character}")
        println("Окрас собаки - ${color}")
        println("Вес собаки - ${ves}")
        println("Рост собаки - ${rost}")
    }
}