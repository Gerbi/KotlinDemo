fun main(args:Array<String>){

    for (count1 in 1..5) {
        //block of code
        println("Count: $count1")
        for (count2 in 1..7) {
            println("count2:$count2")
        }
        println("loop nested done")
    }

    println("Loop done")
}