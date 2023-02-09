/**
 * Note that public static void main is not needed
 * Neither is a class needed
 */
/*
Variables are non null by default. Cannot do: var str: String = null
 */
var topLevelVariable: String = "Nate"

fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")
    //var variables can have their values reassigned
    var reAssignable: String = "Text"
    //val variables are local READ ONLY variables
    val name: String = "Natalie"
    reAssignable = name
    reAssignable = "Gregory"
    println("reAssignable = ${reAssignable}")

    topLevelVariable = "Updated"
    println("topLevelVariable = ${topLevelVariable}")


    /*Types are non null by default in Kotlin
    To make a String variable nullable, need to add a '?'*/

    var greeting: String? = null
//    greeting = "Not Null now"
//    println("greeting = ${greeting}")
    println(greeting.toString())


    /*Type inference is supported*/

    var str = "A string variable, inferred"
    println("str = ${str}")


    /*Implicit 'Nothing' type, when a variable is assigned null
    The type needs to be specified, as the type cannot be inferred*/

    var nothingType = null
    var typeInferredNull: String? = null

    val name1 = "Aspire, New"
    println(name1.replace("A", "S"))
    val replace = name1.replace("A", "S")

}