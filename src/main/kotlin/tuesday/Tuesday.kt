package main.kotlin.tuesday

/**
 * Return with if
 * variable assign with IF condition
 * Not null assertion
 * elvis operator
 * 'it' keyword
 * Let function
 * Reference equality vs value equality
 * Switch statement
 * range object
 * downTo keyword
 * until keyword
 * Step keyword
 * upcasting and down casting
 */

fun main() {
//    elvisOperator(null)
//    itKeyword(listOf("Word1", "Word2", "Word3"))
//    letFunction()
//    valueEqualityVsReferenceEquality()
//    demoApplyKeyword()
//    whenStatement(3)
//    demoRange()
//    demoDownTo()
//    demoStep()
//    demoUntilFunction()
    demoUnSafeCast()
}

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
    val length = str?.length ?: 0
    println("Length of string: $length")
    return length
}

fun itKeyword(listOfStrings: List<String>): Unit {
    println("listOfStrings: $listOfStrings")
    //it represents the argument of the lambda
    listOfStrings.forEach { println(it) }
}

/**
 * let is an extension function on an object
 */
fun letFunction(): Product {
    val prod = Product(101L, "Paint", 10000.00)
    println("prod.discountPrice(0.10): ${prod.discountPrice(0.10)}")
    println("${prod.name}: ${prod.getPrice()}")

    //With let function: Within let scope, it represents the object on which it is called
    val prod2 = Product(102L, "Roller", 2000.00).let {
        println(it.discountPrice(0.15))
        println("${it.name}: ${it.getPrice()}")
        if (it.name == "Roller") {
            it.name = "Not a roller"
        }
        it
    }
    return prod2
}

fun valueEqualityVsReferenceEquality() {
    //Product is a data class
    val p1 = Product(101, "Prod101", 100.00)
    var p2 = Product(101, "Prod101", 100.00)

    // '==' relies on values equality provided by data class in Kotlin
    println("p1 == p2: ${p1 == p2}")
    // p2=p1 //toggle this code to provide the same reference to p2
    // '===' compares the reference of the instance. Here they are distinct objects created with the constructor
    println("p1 === p2: ${p1 === p2}")
}

/*
'run', 'with' and 'apply' has reference to 'this' as the lambda receiver
'let' and 'also' have lambda argument 'it'
apply and also return the context object.
let, run, and with return the lambda result.
*/
fun letVsRun() {
    val str = "Hello"
    // this: Methods on the lambda receiver can be called directly
    str.run {
        //println("The string's length: ${this.length}") // does the same
        println("The string's length: $length")
    }
    // it
    str.let {
        println("The string's length is ${it.length}")
    }
}

fun demoApplyKeyword() {
    val prod = Product(101L, "Watch", 3500.00).apply {
        this.name = "Dagger"
        setPrice(9999.00)
    }
    println("prod: $prod")
}

/**
 * Alternative to switch statement in the Java environment
 * default case -> with 'else' block is not mandatory
 */
fun whenStatement(int: Int): String {
    when (int) {
        1 -> println("One")
        2 -> println("Two")
    }
    when {
        int == 1 -> println("ONE")
        int == 2 -> println("TWO")
        int == 3 -> println("THREE")
        else -> println("DEFAULT CASE")
    }
    return "DONE"
}

/**
 * .. is the operator form of rangeTo function
 */
fun demoRange() {
    for (i in 'a'..'f') {
        println("i: $i")
    }
    for (x in 1.rangeTo(11)) {
        println("x: $x")
    }
    val range = (12..23)
    println("range.min(): ${range.min()}")
    println("range.sum(): ${range.sum()}")
    println("range.average(): ${range.average()}")

    //This is possible only if Product classs implements Comparable
    val prodRange = Product(101, "Product", 11.0)..Product(111, "Product", 11.0)
}

fun demoDownTo() {
    for (num in 14.downTo(5).step(2)) {
        println("num: ${num}")
    }
    /*for (num in 14.downTo(5)) {
        println("num: ${num}")
    }*/
}

//Default value of step is 1
fun demoStep() {
    for (i in 11..21 step 3) {
        println("i: $i")
    }
    for (num in 14.downTo(5).step(5)) {
        println("num: $num")
    }
}

//until gives the range excluding the upper limit
fun demoUntilFunction() {
    for (i in 1 until 10) {
        println("i: ${i}")
    }
}

fun demoUnSafeCast() {
    var x: String? = "String.."
    //as? resolves to null when the cast cannot be performed
    val y = x as? String
    x = "Text.."
    println("y: $y")

    val product = Product(101L, "Prod101", 100.00)
    //Will throw an exception as the object product is not an instance of String
    val prodString = product as String
    println("prodString: $prodString")
}