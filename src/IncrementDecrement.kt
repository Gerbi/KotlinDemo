/*
Operations rules |^\ Priorites Rules
1- ()
2-  ++, -- (antes de var
3- ^
4- *, /
5- +, -
6- =
7- ++, --
 */
fun main(args:Array<String>){

    var x=10
    var y=11
    // var z= ++x+y  // (++x)=(x=x+1)
    var z= --x+y  // (--x)=(x=x-1)

    println("z:$z")
    println("before x: $x")
    //x=9, y=11
    var m=x+++y
    println("x:$m")
    println("After x:x$x")
}