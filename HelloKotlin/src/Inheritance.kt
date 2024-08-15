//subclass (child): the class that inherits from another class
//superclass (parent): the class being inherited from

//super class
open class ParentClass{
    fun EmpId(id:Int){
        println("1. Employee Id: $id")
    }
}

class ChildrenClass:ParentClass(){
    fun EmployeeDetails(name:String,regNo:Int){
        println("1. Employee Name: $name\n2. Employee RegNo: $regNo")
    }
}

fun main(){
    var madhavInfo = ChildrenClass()
    madhavInfo.EmpId(1001)
    madhavInfo.EmployeeDetails("Madhav Kumar",12213356)


}