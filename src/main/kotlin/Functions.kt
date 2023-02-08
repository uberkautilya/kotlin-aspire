/**
 * String? is specified so even a null can be returned
 */
fun getGreeting(): String? {
    return "hello Kotlin"
}

/**
 * Single expression function
 * A single return statement for a method may be simplified
 */
fun getGreet(): String = "Hello there"

/**
 * Single expression functions type can be inferred
 * Explicit return type needn't be mentioned
 */
fun greet() = "Greetings! "

/**
 * Unit in Kotlin is the absence of any useful type
 * Unit here is redundant, as it is the type inferred if no type is specified
 * This is the reason why no return type is specified in main function as well
 */
fun sayHello(greeting: String, itemToGreet: String): Unit {
    /*
    Kotlin supports String Templates: Allows substitute argument values
     */
    println(":: ${greet()} $itemToGreet")
    println(":: $greeting $itemToGreet")
}

/**
 * Functions are not defined within any enclosing class
 * Such functions are called top level functions
 */
fun main() {
    sayHello("From Main", "Learner")
}
