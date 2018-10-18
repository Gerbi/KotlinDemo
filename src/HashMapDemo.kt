fun main(args:Array<String>){
    var map=HashMap<Int, String>()
    map.put(1,"gomez")
    map.put(2,"carolina")
    map.put(3,"douglas")
    println(map.get(3))

    map.put(4,"Carolina P")

    for (k in map.keys){
        println(map.get(k))
    }
}