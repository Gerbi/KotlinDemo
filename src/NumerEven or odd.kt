
fun main(args:Array<String>){

    //input
    print("enter your number: ")
    var isNumber:Int= readLine()!!.toInt()

    if (isNumber % 2 ==0)
        println("$isNumber is even")
    else
        println("$isNumber is odd")
}