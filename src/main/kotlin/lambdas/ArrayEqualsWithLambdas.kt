package main.kotlin.lambdas

fun main() {
    var array1: Array<Int> = arrayOf(11, 2, 3, 4, 5)
    var array2: Array<Int> = arrayOf(11, 2, 3, 4, 5)

    val arrayEquals = arrayCheckLambda(array1, array2)
    println("Array Equals: $arrayEquals")
}

val arrayCheckLambda: (Array<Int>, Array<Int>) -> Boolean = { array1: Array<Int>, array2: Array<Int> ->
    var bool: Boolean = true
    bool = if (array1.size != array2.size) {
        false
    } else {
        for (i in array1.indices) {
            if (array1[i] != array2[i]) {
                bool = false
                break
            }
        }
        bool
    }
    bool
}