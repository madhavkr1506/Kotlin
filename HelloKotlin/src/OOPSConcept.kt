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

class emp(var name:String,var empid:Int){
    fun empDetails(){
        println("Employee Details: \n1. Employee Name: $name\n2. Employee Id: $empid")

    }
    fun empSalary(salary:Int){
        println("3. Employee Salary: $salary")
    }
}


fun main(){
    var emp1 = emp("Madhav",12213356)
    emp1.empDetails()
    emp1.empSalary(61000)
}

