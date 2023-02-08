/**
 * Note that public static void main is not needed
 * Neither is a class needed
 */

var topLevelVar: String = "Nate"
var greeting: String? = null

fun main(args: Array<String>) {
    //greeting = "Reassigned"
    if (greeting != null) {
        println("greeting = $greeting")
    } else {
        println("Hi Kotlin.. greeting is null")
    }
    println("topLevelVariable = ${topLevelVariable}")

    //when statement is similar to the switch statement in Java
    when (greeting) {
        null -> println("Hi from when block: greeting is null")
        else -> println("greeting = ${greeting}")
    }

    /*
    If and When can also be used as expressions
     */
    val greetingToPrint = if(greeting!=null) greeting else "Hi"
    println("Greeting to Print: $greetingToPrint")
    val greetingResolved = when (greeting) {
        null -> "Hi"
        else -> "greetingToPrint"
    }
    println("greetingResolved: ${greetingResolved}")

}