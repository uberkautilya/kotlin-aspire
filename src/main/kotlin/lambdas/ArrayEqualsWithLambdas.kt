package main.kotlin.lambdas

fun main() {
    val array1: Array<Int> = arrayOf(11, 2, 3, 4, 5, 6)
    val array2: Array<Int> = arrayOf(11, 2, 3, 4, 4)

    val arrayEquals = arrayCheckLambda(array1, array2)
    println("Array Equals: $arrayEquals")
}

val arrayCheckLambda: (Array<Int>, Array<Int>) -> Boolean = arrayCheckLambda@{ array1: Array<Int>, array2: Array<Int> ->
    var bool = true
    if (array1.size != array2.size) {
        return@arrayCheckLambda false
    }
    for (i in array1.indices) {
        if (array1[i] != array2[i]) {
            bool = false
            break
        }
    }
    bool
}