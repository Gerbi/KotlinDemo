fun main(args:Array<String>){

    println("enter your grade: ")
    var grade= readLine()!!.toDouble()

    if (grade>=90){
        //block of code
        grade=grade+3
        println("You ares in A level")

    }
    if (grade>=50 && grade<=70){
        grade=grade+10
        println("You get extra 10 point")
    }

    println("Youy enter grade $grade")

}