package main.kotlin.defaultparams

fun main() {
    val name = "Kotlin"
    val message = "Hello"
    printMessage(name, message)
    loopsConcept()
    continueAndBreak()
    breakToLabel()
    print("\nvarargFun(12, 23, 22): ${varargFun(12, 23, 22)}")
}

fun printMessage(name: String, message: String = Reference.getText()) {
    println("$message, $name")
}

class Reference {
    companion object {
        fun getText() = "Hello World"
    }
}

/**
 * vararg parameter has to be the last parameter of a function
 */
fun varargFun(vararg numVarArg: Int): Int {
    var sum: Int = 0
    numVarArg.forEach { sum += it }
    return sum
}

fun loopsConcept() {
    //Includes both limits
    for (i in 1..10) {
        print("i: $i |")
    }

    // Excludes upper limit 10
    for (i in 1 until 10) {
        println("i: $i")
    }

    println("To loop backwards: Both limits are available")
    for (i in 10 downTo 1 step 2) {
        print("i: $i | ")
    }

    println("\nWhile loop that prints 1 through 10")
    var num = 0
    while (num++ < 10) print("num: $num | ")

    println("\nDo while loop that prints 11 through 0")
    do {
        print("num: $num | ")
    } while (num-- > 0)
}

/**
 * Beware of continue statement in a while loop
 */
fun continueAndBreak() {
    println("\n2023_03_02.kt:: continueAndReturn()")
    var number: Int = 0
    while (number++ < 10) {
        if (number == 7) {
            //Increment has to happen before continue: Else -> infinite loop
            continue
        }
        //Break stops the loop execution
        if(number ==9) break
        println("number: $number")
    }
}

/**
 * Breaks to the labelled loop
 */
fun breakToLabel() {
    println("\n2023_03_02.kt:: breakToLabel()")
    var number = 0
    outer@ while (number < 5) {
        println("number: ${number}")
        var innerNum = 0
        while (innerNum++ < 5) {
            if (innerNum == 3) {
                break@outer
            }
            println("***$innerNum")
        }
    }
    println("End of breakToLabel")
}