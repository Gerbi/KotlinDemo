fun sum(n1:Double, n2:Double):Double{
    //block
    var sum = n1+n2
    return sum
}

fun dysply(n:Int):Unit{

    println("n:$n")
}

fun displyNoInput():Unit{
    println("Welcome to display")
}

fun main (args:Array<String>){

    var r=sum(10.0,12.0)
    println("r:$r")

    r =sum(5.0,82.0)
    println("r:$r")

    r=sum(120.0,120.0)
    println("r:$r")

    dysply(10)
    dysply(22)

    displyNoInput()
}