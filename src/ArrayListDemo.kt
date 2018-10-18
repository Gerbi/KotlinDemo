fun main(args:Array<String>){

    var arrayList=ArrayList<String>()
    arrayList.add("Jenna")
    arrayList.add("luisa")
    arrayList.add("carolina")
    arrayList.add("reina")

    println("First name:" + arrayList.get(0))
    arrayList.set(0, "Laya husse") //change element 0 for list

    println(" All element by object")
    for (item in arrayList){
        println(item)
    }

    println("All element by index")
    for (index in 0..arrayList.size-1)
    {
        println(arrayList.get(index))
    }
    //search
    if (arrayList.contains("carolina")){
        println("name is found")
    }else{
        println("name is not found")
    }
}