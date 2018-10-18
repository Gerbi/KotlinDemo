fun main (args:Array<String>){

    var setElement = setOf(1,2,3,4,11,33,44)
//    setElement.add(77) not work
    for (element in setElement){
        println(element)
    }

    var setElementM = mutableSetOf(1,2,3,4,66,33,44)
    setElementM.add(77)
    for (element in setElementM){
        println(element)
    }
}