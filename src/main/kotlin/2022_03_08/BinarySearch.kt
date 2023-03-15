package main.kotlin.`2022_03_08`

fun main() {
    val numList = (1..30).toMutableList()
    println(
        linearSearch(27, numList)
    )
    println(
        binarySearch(27, numList)
    )

    //The functionality is provided by the Collection API, leveraged as below
    val indexOf27 = numList.binarySearch(27)
    println("\nindexOf27: $indexOf27")

}

/**
 * Binary search requires the argument list to be pre-sorted
 */
fun binarySearch(el: Int, numList: MutableList<Int>): Int {
    var lowI = 0
    var highI = numList.size - 1

    var iCount = 0
    while (lowI <= highI) {
        println("Count ${++iCount}")
        val mid = (lowI + highI) / 2
        val comp = numList[mid].compareTo(el)
        if (comp < 0) {
            lowI = mid + 1
        } else if (comp > 0) {
            highI = mid - 1
        } else return numList[mid]
    }
    return -1
}

fun linearSearch(el: Int, numList: MutableList<Int>): Int {
    var iCount = 0
    for (num in numList) {
        println("Searched ${++iCount}")
        if (num == el) {
            return num
        }
    }
    return -1
}