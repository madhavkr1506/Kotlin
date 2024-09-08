//fun main(){
//    val numbers = arrayOf(1001,1002,1003,1004,1005)
//    for(i in 0 until numbers.size){
//        println(numbers[i])
//    }

//    var string = "MadhavKumar"
//    println(string)
//
//    for(i in 0 until string.length){
//        println(string[i])
//    }
//
//
//}


//in the above code I is declared as loop variable that iterates through the range 0 until numbers.size.

// arraylist :

interface push{
    fun push(data:Int, stackStructure: ArrayList<Int>);
}
interface pop{
    fun pop(stackStructure: ArrayList<Int>):Int;
}

class stack:push,pop{
    override fun push(data:Int, stackStructure: ArrayList<Int>){;
        println("Pushing element $data");
        stackStructure.add(data);
    }

    override fun pop(stackStructure: ArrayList<Int>):Int{
        var removedata: Int = stackStructure.removeLast();
        println("Poping element $removedata")
        return removedata;
    }
}

fun main(){
    var arraylist = ArrayList<Int>(3);
    var object1 = stack();
    object1.push(11,arraylist);
    object1.push(21,arraylist);object1.push(31,arraylist);

    println("traversing element");
    for(i in 0..<arraylist.size){
        println("$i : ${arraylist.get(i)}");
    }
    object1.pop(arraylist);




}

