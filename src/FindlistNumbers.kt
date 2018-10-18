//fun main(args:Array<String>){
//
//    val evenP: (Int)->Boolean = MathH::isEven
//
//    val numbers = 1..100
//    val even = numbers.filter(evenP)
//
//    println(even)
//}
//object MathH {
//    fun isEven(i: Int) = i % 2 == 0
//}
fun main (args:Array<String>){

    for (number in 1..100){
        if (number % 2 ==0)
            println("$number")
    }
}