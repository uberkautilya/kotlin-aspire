package `2023_03_16`

fun main() {
    val a = 5
    val b = 0

    val result = try {
        println("a/b: ${a / b}")
        a/b //try-catch is used as an expression here

    } catch (e: ArithmeticException) {
        println("Exception caught: ${e.message}")
        0   //try-catch is used as an expression here

    } finally {
        println("Executed irrespective of whether an exception is thrown or not")

    }
    println("result: $result")
}