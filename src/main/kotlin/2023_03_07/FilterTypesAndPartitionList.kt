package main.kotlin.`2023_03_07`

fun main() {
    val mixedList = listOf("String", 1, 3, 'a', 12.00, true, 45, 23, "Hello", 11.0, false, 'k')
    mixedList.filterIsInstance<Double>().forEach {
        println(it)
    }
    println(
        mixedList.filterIsInstance<Double>().joinToString(
            separator = " | "
        ) { it -> "'$it'" }
    )


    /*
     * Partition: Returns a Pair of lists ->
     * One that meets the predicate condition, the other that don't
     */
    val (match, restOfList) = mixedList.partition {
        it is Int
    }
    println("match = $match")
    println("\nrestOfList: $restOfList")
}


