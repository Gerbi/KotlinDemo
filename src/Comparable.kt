import java.util.*
class Person(var name:String, var age:Int): Comparable<Person>{

    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }


}

fun main (args:Array<String>){

    var listOfNames=ArrayList<Person>()
    listOfNames.add(Person("carolina",25))
    listOfNames.add(Person("Andrea",26))
    listOfNames.add(Person("Luisa",24))
    println("before sort")

    for (person in listOfNames){
        println("Name: "+person.name)
        println("Age: "+person.age)
    }
    println("after sort")
    Collections.sort(listOfNames)
    for (person in listOfNames){
        println("Name: "+person.name)
        println("Age: "+person.age)
    }
}