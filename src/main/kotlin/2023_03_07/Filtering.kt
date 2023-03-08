package main.kotlin.`2023_03_07`

/**
 * Filtering leaves the original collection unchanged.
 * Filtering is done with a predicate
 * Available on both mutable and immutable collections
 */
fun main() {
    val numberList = listOf("one", "two", "three", "four")
    val longerThanThree = numberList.filter {
        it.length > 3
    }
    println("\nlongerThanThree: $longerThanThree")

    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filterMap = numberMap.filter {
        it.key.contains("1", ignoreCase = true) && it.value > 100
    }
    println("\nfilterMap: $filterMap")

    val charList = ('a'..'z').toList()
    val associateBy = charList.associateBy(keySelector = { it }, valueTransform = { it.inc() })
    println(
        "\nassociateBy: ${
            associateBy.filter {
                it.key > 'd'
            }
        }"
    )

    val filterIndexed = numberList.filterIndexed { index, value ->
        (index != 0 && value.length < 5)
    }
    println("\nfilterIndexed: $filterIndexed")
    val filterNot = numberList.filterNot {
        it.length <= 3
    }
    println("\nfilterNot: $filterNot")
}