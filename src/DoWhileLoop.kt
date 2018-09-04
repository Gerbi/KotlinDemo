fun main(args:Array<String>) {
    var count = 6
    while (count <= 5) {
        println("enter the loop")
        //block of code
        if (count == 2) {
            println("count:$count")
        }
        count++
    } while(count<=5)
    println("Loop done")
}