fun main(args:Array<String>){

    println("enter your grade: ")
    var grade= readLine()!!.toDouble()

    if (grade>=90){
        //block of code
        println("You ares in A level")

    }else if(grade>=80 && grade <90){
        //block of code
        println("You ares in B level")
    }else if(grade>=70 && grade <80){
        //block of code
        println("You ares in C level")
    }else{
        println("You Fall")
    }

}