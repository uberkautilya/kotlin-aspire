package `2023_03_03`

fun main() {
    println(
        Calculator().sum(12, 13)
    )

    //Call on companion object's method without need for object creation
    println("Calculator.difference(12, 13): ${
        //Can't call it on an instance of the class
        Calculator.difference(12, 13)
    }")
    //MAX_VALUE is part of the companion object of Int class
    Int.MAX_VALUE
    Calculator.name = "Kotlin"
    println("Calculator.name: ${Calculator.name}")
}

class Calculator() {
    fun sum(a: Int, b: Int) = a + b

    //Only a single companion object is allowed per class
    companion object{
        lateinit var name: String
        fun difference(a: Int, b: Int) = a - b
    }
}