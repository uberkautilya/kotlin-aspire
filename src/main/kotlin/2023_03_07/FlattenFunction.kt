package main.kotlin.`2023_03_07`

/**
 * Flatten: To navigate through a multidimensional collection
 * FlatMap can be used to convert a multidimensional collection into a single dimensional array
 */
fun main() {
    val numberSetList = listOf(
        setOf(1, 2, 3),
        setOf(4, 5, 6),
        setOf(7, 8, 9)
    )
    for (numSet in numberSetList) {
        for (num in numSet) {
            print("$num ")
        }
        println()
    }

    println("\nFlatten function")
    val numFlatList = numberSetList.flatten()
    for (num in numFlatList) {
        print("$num ")
    }
}