import java.util.*;

fun main(){
//    val sc : Scanner = Scanner(System.`in`);
//    println("Input Number: ");
//    val num = sc.nextInt();
//    println("Number : $num");

//    val childObj = Child();
//    childObj.name("Madhav");
//    childObj.designation("Student");

//    val primaryConstructorObject = PrimaryConstructor("Madhav","Student");
//    primaryConstructorObject.printDetails();

    val secondaryConstructor = SecondaryConstructor("Madhav","Student");
}


//open class Parent{
//    fun name(name:String){
//        println("Name: $name");
//    }
//}
//
//class Child : Parent(){
//    fun designation(designation : String){
//        println("Designation: $designation");
//    }
//}

//class PrimaryConstructor(name:String,designation:String){
//    val name:String;
//    val designation:String;
//    init{
//        this.name = name;
//        this.designation = designation;
//    }
//
//    fun printDetails(){
//        println("$name and $designation");
//    }
//}

class SecondaryConstructor{
    var name:String;
    var designation:String;
    constructor(name:String,designation:String) : this(name,designation,56100){
        this.name = name;
        this.designation = designation;

        println("Name: $name and Designation: $designation");
    }

    constructor(name:String,designation:String,salary:Int){
        this.name = name;
        this.designation = designation;
        println("Name: $name -> Designation: $designation -> Salary: $salary");
    }

}


