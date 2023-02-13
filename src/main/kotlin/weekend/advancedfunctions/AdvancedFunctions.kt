package main.kotlin.weekend.advancedfunctions

/**
 * Higher order functions are
 * functions that return another function or take functions as arguments
 * Here predicate function is used to filter out values from the first parameter list
 * Function parameters are treated as types - just like Integers or Strings
 * Functional types: First class part of the language
 */
fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {
    println("List of values satisfying the predicate: ")
    list.forEach {
        /*
         * predicate which is a parameter type can be invoked like it were a normal function
         * 'it' is the default receiver variable
        */
        if (predicate(it)) {
            print("| $it")
        }
    }
}

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript")
    //Lambda passed within parenthesis of the function invocation
    printFilteredStrings(list, { it.startsWith("J") })
    /*
     * Lambda can be passed outside the parenthesis of the function invocation
     * If the last parameter of a function is a function, this lambda can be specified outside the parenthesis
    */
    printFilteredStrings(list) { it.startsWith("K") }

    printFilteredNullable(list, null)
    printFilteredNullable(list, predicateLambda)
    println("\ngetPredicate")
    printFilteredNullable(list, getPredicate())
}


fun printFilteredNullable(list: List<String>, predicate: ((String) -> Boolean)?) {
    println("\nList of values satisfying the predicate: $predicate")
    list.forEach {
        /*
         * safe invoke call operator == used on function?.invoke
        */
        if (predicate?.invoke(it) == true) {
            print("| $it")
        }
    }
}

val predicateLambda: (String) -> Boolean = { it.startsWith("J") }

fun getPredicate(): (String) -> Boolean {
    return { it.startsWith("K") }
}