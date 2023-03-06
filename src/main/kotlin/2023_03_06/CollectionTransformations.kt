package `2023_03_06`

fun main() {
    val numberSet = setOf(1, 2, 3, 4, 5)
    mapTransformation(numberSet)

    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3)
    println(numberMap.mapValues {
        it.key.length
    })
    println(numberMap.map {
        it.key.lowercase() to it.value * 10
    })
    println(numberMap


}

private fun mapTransformation(numberSet: Set<Int>) {
    //Does not change the original values in the set
    println(numberSet.map { it * 10 })
    println(numberSet)

    println(numberSet.map { if (it == 3) it * 100 else it * 10 })
}