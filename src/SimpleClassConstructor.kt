

class CarWithConst(){
    var Type:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var MilesDrive:Int?=null
    var Owner:String?=null
    constructor(Type:String,Model:Int,Price:Double,MilesDrive:Int,Owner:String):this(){
        this.Type=Type
        this.Model=Model
        this.Price=Price
        this.MilesDrive=MilesDrive
        this.Owner=Owner

    }

    constructor(Owner: String):this(){
        this.Owner=Owner
        println("constructor2")
    }

    fun getCarPrice():Double{

        return this.Price!! - (this.MilesDrive!!.toDouble()*10)
    }

    fun GetOwner():String? {
        return this.Owner;
    }
}

fun main (args:Array<String>){

    val gCar=CarWithConst("BMW", 2015,10000.0,105, "gomez")
    println("gCar: "+gCar.getCarPrice())
    val hCar=CarWithConst("KIA", 1975, 10252.0, 110,"jena")
    println("hCar: "+hCar.getCarPrice())
}

