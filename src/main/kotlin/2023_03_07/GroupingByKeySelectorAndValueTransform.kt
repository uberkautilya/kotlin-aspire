package main.kotlin.`2023_03_07`

/**
 * For grouping Collection elements
 * Takes in a lambda function and returns a map
 * Key is the lambda result, and value is list of elements on which the result is returned
 */
fun main() {
    val numList = listOf("one", "two", "three", "four", "five")
    println(numList.groupBy {
        it.first().uppercase()
    })

    println(
        numList.groupBy(
            keySelector = { it.first() },
            valueTransform = { it.uppercase() }
        )
    )
}