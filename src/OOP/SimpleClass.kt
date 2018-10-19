package OOP

class Car(var type:String,var model:Int,var price:Double,var milesDrive:Int,var owner:String){

    fun getCarPrice():Double{

        return this.price - (this.milesDrive.toDouble()*10)
    }
}

fun main (args:Array<String>){

    val gCar=Car("BMW", 2015,10000.0,105, "gomez")
    println("gCar: "+gCar.getCarPrice())
    val hCar=Car("KIA", 1975, 10252.0, 110,"jena")
    println("hCar: "+hCar.getCarPrice())
}

