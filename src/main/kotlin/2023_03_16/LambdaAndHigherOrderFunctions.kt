package `2023_03_16`

/**
 * Functions that accept functions as parameters, return them or do both are called higher order functions
 * Lambdas are functions with no names
 */

/**
 * Lambda functions are defined in curly braces
 */
fun main() {
    var myLambda: (Int, Int) -> Unit = { a: Int, b: Int -> println("a + b: ${a + b}") }
    myLambda(5, 12)


    val printLambda = { a: Int -> println("Result: $a") }
    actOnSum(5, 7, printLambda)
    //When the last argument is a lambda, can be moved out of the brackets in a constructor or function
    actOnSum(3, 4) { a: Int -> println(a) }


    val result = calculate(12, 18) { a: Int, b: Int -> a + b }
    println("result: $result")

    //Object expression to provide OnClickListener interface as the third argument
    val loginButton = Button("Login", 34345, object: OnClickListener{
        override fun onClick() {
            println("Login button clicked")
        }
    })
    loginButton.onClickListener.onClick()
    val signUpButton = LambdaButton("Sign up", 2345) {
        println("Sign up button clicked")
    }
    signUpButton.onClickListener()

}

/**
 * Higher order function
 */
private fun calculate(
    a: Int,
    b: Int,
    action: (Int, Int) -> Int
): Int {
    return action(a, b)
}

fun actOnSum(
    a: Int,
    b: Int,
    action: (Int) -> Unit
) {
    action(a + b)
}

/**
 * Same as lambda function:
 * val myLambda = { a: Int, b: Int -> println("a + b: ${a + b}") }
 */
fun add(a: Int, b: Int) {
    println("a + b: ${a + b}")
}

/**
 * Same functionality by class Button is achieved by making the third parameter a lambda, rather than an interface
 */
private class LambdaButton(val text: String, val id: Int, val onClickListener: () -> Unit)

private class Button(val text: String, val id: Int, val onClickListener: OnClickListener)
private interface OnClickListener{
    fun onClick()
}