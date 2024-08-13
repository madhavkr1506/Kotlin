fun main(){

//    variable: it is a container that holds data

    var name : String = "Madhav Kumar"
    println(name)

    name = 20.toString()
//    note: var is mutable
    println(name)

    val age = 20
    println(age)

//    note: val is immutable

//    data types: the kinds of values that can be stored in variables.
//    common data types are: Int, Double, String, Boolea

//    type conversion: changing one type of data into another.

    val number = 50
    val convertNumber=  number.toDouble()
    println(number::class.simpleName)
    println(convertNumber::class.simpleName)

    
}