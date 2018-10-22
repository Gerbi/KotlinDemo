//use class interface

interface op{
    fun sum(n1:Int,n2:Int)  { println("sum"+ n1+n2)}
    fun div(n1:Int,n2:Int)  { println("div"+ n1/n2)}
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
        println("sum: n"+ n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println("div: n"+ n1/n2)
    }
}

class Admin:op{
    override fun sum(n1: Int, n2: Int) {
        println("sum: n"+ n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println("div: n"+ n1/n2)
    }
}

class ManagerOp:op{

}
fun main(args:Array<String>){
    //TODO:
    var adminop=Admin()
    adminop.sum(1,2)
}