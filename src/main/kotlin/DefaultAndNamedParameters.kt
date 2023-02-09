package main.kotlin

fun main() {
    printBorder('*', 10)
    printBorder('(')
    // Named Parameters: When overriding the arguments in another order, use name of the parameters
    printBorder(length = 20)
    var st: Student = Student(101L, "Name101")
    printStudent(student = st)
}

fun printStudent(student: Student) {
    print(student)
}

/**
 * Default values are provided in the parameter declaration.
 * If no values are provided at invocation, these values are assigned by default
 */
fun printBorder(char: Char = '=', length: Int = 10) {
    for (i in 1..length) {
        print("$char ")
    }
    println()
}
class Student {
    var id: Long = 0L
    var name: String = "Name"

    constructor(id: Long, name: String) {
        this.id = id
        this.name = name
    }
    override fun toString(): String {
        return "Student(id=$id, name='$name')"
    }

}
