package main.kotlin

fun main() {
    printBorder('*', 10)
    printBorder('(')
    // Named Parameters: When overriding the arguments in another order, use name of the parameters
    printBorder(length = 20)
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
