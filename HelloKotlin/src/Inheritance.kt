//subclass (child): the class that inherits from another class
//superclass (parent): the class being inherited from

//super class
//open class ParentClass{
//    fun EmpId(id:Int){
//        println("1. Employee Id: $id")
//    }
//}
//
//class ChildrenClass:ParentClass(){
//    fun EmployeeDetails(name:String,regNo:Int){
//        println("1. Employee Name: $name\n2. Employee RegNo: $regNo")
//    }
//}
//
//fun main(){
//    var madhavInfo = ChildrenClass()
//    madhavInfo.EmpId(1001)
//    madhavInfo.EmployeeDetails("Madhav Kumar",12213356)
//
//
//}


//multiple inheritance:

//interface greeting{
//    fun greet() = println("Hello ")
//}
//interface nameing{
//    fun name() = println("Madhav Kumar")
//}
//
//class GreetingPeople:greeting,nameing
//
//fun main(){
//    var obj = GreetingPeople()
//    obj.greet()
//    obj.name()
//}

//multilevel inheritance:

open class Id{
    fun id(empId:Int){
        println("1. Employee Id: $empId")
    }
}

open class Name: Id(){
    fun name(EmpName:String){
        println("2. Employee Name: $EmpName")
    }
}

class regNo:Name(){
    fun regno(EmpReg:Int){
        println("3. Employee Reg No: $EmpReg")
    }
}

fun main(){
    var obj = regNo()
    obj.regno(12213356)
    obj.name("Madhav Kumar")
    obj.id(1001)
}