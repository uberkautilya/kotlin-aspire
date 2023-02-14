package main.kotlin.tuesday

/**
 * Return with if
 * variable assign with IF condition
 * Not null assertion
 * elvis operator
 * It keyword
 * Let function
 * Reference equality vs value equality
 * Switch statement
 * range object 
 * downTo keyword
 * until keyword
 * Step keyword
 * upcasting and down casting
 */

fun returnWithIf(dept: String): Boolean {
    return if (dept.equals("Mechanical", true)) {
        println("true condition")
        true
    } else {
        false
    }
}
fun assignWithIfCondition() {
    var str = "Kotlin"
    var bool = if (str.equals("Kotlin", true)) {
        true
    } else {
        println("Not Kotlin")
        false
    }
}
fun notNullAssertion(str: String?): Boolean {
    val isKotlin = str!!.equals("Kotlin", true)
    println("Length: $isKotlin")
    return isKotlin
}

fun elvisOperator(str: String?): Int {
    val length = str?.length?:0
    println("Length of string: $length")
    return length
}