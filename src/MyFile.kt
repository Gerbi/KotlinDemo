import java.io.FileWriter

fun main (args:Array<String>){

    print("Write to file text: ")
    var str:String = readLine().toString()
    WriteToFile(str)
}

fun WriteToFile(str:String){
    try {
        var fo=FileWriter("test.txt",true) //true to continue next line write
        fo.write(str+"\n")  //write in te filename
        fo.close() //close the filename
    }catch (ex:Exception){
        println(ex.message)
    }

}