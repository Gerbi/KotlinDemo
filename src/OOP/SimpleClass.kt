package OOP

class Car(){
    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    constructor(type:String,model:Int,price:Double,milesDrive:Int,owner:String):this(){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
        println("constructor1")

    }
    constructor(owner: String):this(){
        this.owner=owner
        println("constructor2")
    }

    fun getCarPrice():Double{

        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }
}

fun main (args:Array<String>){

    val gCar=Car("BMW", 2015,10000.0,105, "gomez")
    println("gCar: "+gCar.getCarPrice())
    val hCar=Car("KIA", 1975, 10252.0, 110,"jena")
    println("hCar: "+hCar.getCarPrice())
    val mcar = Car("leiva")
}

