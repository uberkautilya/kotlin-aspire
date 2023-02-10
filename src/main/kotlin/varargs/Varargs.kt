package main.kotlin.varargs

//Here the greeting has a default value 'Hello'
fun hello(greeting: String = "Hello", vararg things: String) {
    things.forEach { println("$greeting $it") }
}

fun main() {
    val things = listOf("Kotlin", "Programming", "Comic Books")
    //Spread Operator: '*' is used to convert an Array to a varargs parameter
    hello(things = *things.toTypedArray())

    val arrayOfThings = arrayOf("Kotlin", "Java")
    hello(things = *arrayOfThings)
}