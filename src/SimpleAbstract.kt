abstract class CreditCard(){
    fun CreditID():String
    {return "2534521d5sdd"}

    abstract fun newCredit()
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditID()
    }
    override fun newCredit(){
        println("new cart created")
    }
}

fun main (args:Array<String>){
//    var credit=CreditCard()
//    println(credit.CreditID())
    var user=UserInfo()
    println(user.getInfo())

}