
class Employee(firstName:String="",lastName:String="",id:String,isManager:Boolean=false,managerId:String=""){

    var first_Name : String
    var last_Name : String
    val iD : String
    var is_Manager : Boolean
    var manager_Id : String

    init{
        first_Name=firstName
        last_Name=lastName
        iD=id
        is_Manager=isManager
        manager_Id=managerId
    }

    fun setFirstName(firstName: String){
        first_Name=firstName
    }

    fun setLastName(lastName: String){
        last_Name=lastName
    }

    fun setIsManager(isManager: Boolean){
        is_Manager=isManager
    }

    fun setManagerId(managerId: String){
        manager_Id=managerId
    }

    fun showData(){
        println("ID:$iD  First Name:$first_Name  Last Name:$last_Name  Is Manager:$is_Manager  Manager Id:$manager_Id")
    }


}

fun main(){

    var emp = Employee(id="1").apply {
        setFirstName("Doug")
        setLastName("Sigelbaum")
        setIsManager(false)
        setManagerId("XXX")
    }
    emp.showData()
}