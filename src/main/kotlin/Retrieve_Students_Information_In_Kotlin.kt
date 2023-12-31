/* Scenario
Let’s say that you are helping the IT department of a large school. The school has a list of students.
You want to allow the staff to search and retrieve a student’s information using either their name or
their student ID. To allow for two search phrases you need two functions. One is for locating a student
by ID and the other is for locating a student by name. You should consider that, in a real-world project,
the student ID is normally generated by the system for each student. Therefore, you can depend on it being
accurate and being present for each stored student. So, if the user searches for a student by ID and that ID
 is not present, the program should return null or error since that ID does not match with any of the stored
  IDs. If the user searches for a student by name and that name is not present, then the program should
  display "The student is not found".
In future steps of this exercise, you will handle both possibilities, for now just keep in mind that you need
 to return an error if the user enters an ID that is not stored and NPE is returned. "The student is not found"
 returns if an entered name does not match with any of the stored student names. */

//step 1
data class Student(val fullName: String, var id: Int,var grade:Double)

val students = listOf<Student>(
    Student("John", 223,140.0),
    Student("Mark", 548,120.0),
    Student("Natali", 342,150.0),
    Student("Sara", 781,130.0)
)


fun main() {
//    step 4 
    println("Please, Enter the student's ID")
    val id = readln().toInt() //user input
    println( getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln()// user input
    println(searchInStudents(name)?:"the student is not found")
}
//step 2 
fun getStudentById(id:Int):Student{
    return  students.find { it.id==id }!!
}
//step 3 
fun searchInStudents(name:String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}