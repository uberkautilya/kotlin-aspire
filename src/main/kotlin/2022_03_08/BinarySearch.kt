package main.kotlin.`2022_03_08`

fun main() {
    println(
//        linearSearch(27, (1..30).toMutableList())
        binarySearch(27, (1..30).toMutableList())
    )
}

/**
 * Binary search requires the argument list to be pre-sorted
 */
fun binarySearch(el: Int, numList: MutableList<Int>): Int {
    var lIndex = 0
    var hIndex = numList.size - 1

    var iCount = 0
    while (lIndex <= hIndex) {
        println("Count ${++iCount}")
        val mid = (lIndex + hIndex) / 2
        val comp = numList[mid].compareTo(el)
        if (comp < 0) {
            lIndex = mid + 1
        } else if (comp > 0) {
            hIndex = mid - 1
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