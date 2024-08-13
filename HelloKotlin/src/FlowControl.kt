fun main(){
//    println("input name:")
//    var name = readLine()
//    if(name == "Madhav"){
//        println("Your name is $name")
//    }else{
//        println("your name is not Madhav")
//    }

    println("input name:")
    var name = readLine();
    when(name){
        "Madhav" -> println("your name is madhav kumar")
        "Ramjee" -> println("your name is ram jee")
        else -> {
            println("your name is not matching with anyone")
        }
    }
}


