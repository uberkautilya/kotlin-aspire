package main.kotlin.weekend.classes

fun main() {
    //No explicit new keyword in kotlin: Simply constructor invocation
    val person = Person()

    val human = Human("FName", "SName")
    //Properties on Kotlin classes are public by default
    human.fName
    val human2 = Human2("fName", "sName")
    human2.fName
    //To invoke secondary constructor
    val human2Secondary = Human2()
    val human3 = Human3()
    human3.nickName = "Shades"
    human3.secondaryName = "Alias"
    println("Secondary Name for human3: ${human3.secondaryName}")

    //Functions within classes
    val human4 = Human4()
    human4.printInfo()
}