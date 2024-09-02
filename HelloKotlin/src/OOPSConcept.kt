//fun main(){
//    val obj = Krishna();
//    obj.GodKrishnaName("Madhav","Keshav");
//}
//
//class Krishna{
//    fun GodKrishnaName(name1:String,name2:String){
//        println("These two names of God, Krishna: $name1 and $name2")
//    }
//}


//kotlin constructor:

//class Student(val name:String,val RegNo:Int,val CGPA:Float)
//
//fun main(){
//    val student1 = Student("Madhav",12213356,8.65f)
//    val student2 = Student("Krishna",12213357,9.65f)
//
//    println(student1.name)
//}

//kotlin class function:

//class emp(var name:String,var empid:String){
//    fun details(){
//        println("Employee Details: \n1. Employee Name: $name\n2. Employee Id: $empid")
//    }
//}
//
//fun main(){
//    var firstEmp = emp("Madhav","12213356")
//    firstEmp.details()
//}

//class function parameter:

//class emp(var name:String,var empid:Int){
//    fun empDetails(){
//        println("Employee Details: \n1. Employee Name: $name\n2. Employee Id: $empid")
//
//    }
//    fun empSalary(salary:Int){
//        println("3. Employee Salary: $salary")
//    }
//}
//
//
//fun main(){
//    var emp1 = emp("Madhav",12213356)
//    emp1.empDetails()
//    emp1.empSalary(61000)
//}










//class Constructor{
//    var regNo:Int = 0;
//    var Name:String = "";
//    var Sub:String = "";
//
//    constructor(regNo:Int, Name:String ){
//        this.regNo = regNo;
//        this.Name = Name;
//
//    }
//    constructor(Sub:String){
//        this.Sub = Sub;
//
//    }
//    fun function1(){
//        println("My name is $Name");
//        println("My Reg No: $regNo");
//
//    }
//
//    fun function2(){
//
//        println("My Sub Code: $Sub");
//    }
//}

//fun main(){
//    var object1 = Constructor(1001,"Madhav");
//    var object2 = Constructor("CSE224");
//    object1.function1();
//    object2.function2();
//}


//interface i1{
//    fun function1();
//    fun function2();
//
//}
//
//interface i2{
//    fun function3(){}
//    fun function4(){}
//}
//
//open class Parent:i1,i2{
//    override fun function1(){
//        println("This is function 1");
//    }
//    override fun function2(){
//        println("This is function 2");
//    }
//}
//
//class Children: Parent(){
//    override fun function3(){
//        println("This is function3");
//    }
//    override fun function4(){
//        println("This is function4");
//    }
//}
//
//fun main(){
//    var object1 = Children();
//    object1.function3();
//}



//kotlin primary constructor with initializer:

//class hello constructor( name:String, surname:String ){
//    var name:String;
//    var surname:String;
//
//    init{
//        this.name = name;
//        this.surname = surname;
//    }
//    fun function1() {
//        println("Hello!! My name is $name $surname");
//    }
//}
//
//fun main(){
//    var object1 = hello("Madhav","Kumar");
//    object1.function1();
//}
//


//kotlin secondary constructor:

class hello{
    var name:String;
    var surname:String;

    constructor(name:String,surname:String){
        this.name = name;
        this.surname = surname;
    }


    fun function1() = println("My name is $name $surname");
}

fun main(){
    var object1 = hello("Madhav","Kumar");
    object1.function1();
}



















