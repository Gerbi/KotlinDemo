class UserAdmins<T>(credit:T){

    init {
        println(credit)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main (args:Array<String>){

    var userAdmin=UserAdmins<String>("gerbi")
    var userAdmin2=UserAdmins<Int>(252)
    var userAdmin3=UserAdmins<Double>(252.52)

    display<Int>(22)
    display<String>("process user")

}