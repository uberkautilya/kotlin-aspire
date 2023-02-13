package main.kotlin.weekend.classes

class Human4(val fName: String = "fName", val lName: String = "lName") {
    var nickName: String? = null
    fun printInfo() {
        /*
        val nNameToPrint: String? = if (nickName != null) nickName else "no nickName"
        The below is less verbose with Elvis Operator '?:'
        If left of operator is null, return what is on the right of the operator
        */
        val nNameToPrint: String? = nickName ?: "no nickName"
        println("fName: $fName, lName: $lName, nickName: $nNameToPrint")
    }
}