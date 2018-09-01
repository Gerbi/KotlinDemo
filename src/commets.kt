//This main fucntion

fun main(args:Array<String>) {
    //Enter user name

    println("Enter name: ")
    var name= readLine()
    println("Enter age: ")
    var age:Int= readLine()!!.toInt()
    println("Enter departament: ")
    var dep:String?
    dep= readLine()
    println("Enter to pi: ")
    var pi:Double= readLine()!!.toDouble()

    /*      print output
            to allow user to seee the variables values
    */
    println("***** output ******")
    println("name:"+ name)
    println("age:"+ age)
    println("departament:"+ dep)
    println("pi: "+ pi)

}