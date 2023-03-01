package operators

/**
 * Other operators are equals operator '=='
 * Logical AND: &&, OR: || etc.
 */
fun main() {
//    fiveOperators()
    preFixAndPostFixIncrementOperators()
}

/**
 * Demonstrate prefix and postfix increment, decrement operators
 */
private fun preFixAndPostFixIncrementOperators() {
    var x = 0
    println("Increments..")
    println("x++: ${x++}")
    println("x: $x")
    println("++x: ${++x}")
    println("x: $x")
    println("Decrements..")
    println("x--: ${x--}")
    println("x: $x")
    println("--x: ${--x}")
    println("x: $x")
    val value = if(x>0) "Greater" else 10
}

/**
 * Demonstrates the five operators on numbers
 */
private fun fiveOperators() {
    var x = 5
    var y = 3
    println("x + y: ${x + y}")
    println("x - y: ${x - y}")
    println("x * y: ${x * y}")
    println("x / y: ${x / y.toDouble()}")
    println("x % y: ${x % y}")
}