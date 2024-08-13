// a function is a block of codes that does something.

fun main(){
    sayHello()
    greet("Krishna")
    countdown(5)
    factorial(5)
}

fun sayHello(){
    println("Hello Madhav Kumar")
}

// we can also pass data to the function

fun greet(name: String){
    println("Hello $name")
}

// recursive function

fun countdown(number: Int){
    if(number > 0){
        println(number)
        countdown(number - 1)
    }
    else{
        println("done")
    }
}

fun factorial(number: Int) : Int{

    return if(number == 1){
        1
    }
    else{
        number * factorial(number - 1)
    }

//    var fact:Int = 1
//    for(i in number downTo 1){
//        fact *= i
//    }

}