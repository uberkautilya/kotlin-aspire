package main.kotlin.`2023_03_07`

/**
 * Return a single value based on the values of a collection
 * sum(), avg(), minOrNull(), maxOrNull(), count()
 */
fun main() {
    val numList = listOf(
        6, 10, 14, 4, 100
    )
    println("The sum is ${numList.sum()}")
    println("The avg is ${numList.average()}")
    println("The count is ${numList.count()}")
    println("The minOrNull is ${numList.minOrNull()}")
    println("The maxOrNull is ${numList.maxOrNull()}")

    advancedSumOfDemonstration(numList)
}

private fun advancedSumOfDemonstration(numList: List<Int>) {
    println("\nAggregatorOperationsOnCollection.kt:: advanceSumOfDemonstration()")

    //This returns the sum of double of the numbers in the list
    println("The sum is ${numList.sumOf { it * 2 }}")
}
