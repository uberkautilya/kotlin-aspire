package main.kotlin.`2023_03_07`

fun main() {
    val numList = listOf(
        "zen", "iPhone", "one", "two", "three", "four", "five", "six"
    )
    sliceDemonstration(numList)
    takeAndDropDemonstration(numList)
    takeWhileAndDropLastWhile(numList)
    chunkedDemonstration(numList)
    windowedDemonstration(numList)
    retrieveSingleElementFromCollection(numList)
}

fun retrieveSingleElementFromCollection(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: retrieveSingleElementFromCollection()")
    println(numList.elementAt(2))
    println("\nnumList.first(): ${numList.first()}")
    println("\nnumList.last(): ${numList.last()}")
    println(numList.first {
        it.length > 3
    })
    println(numList.last {
        it.startsWith("f")
    })
    //Get a number from the list randomly
    println("\nnumList.random(): ${numList.random()}")
    println("\nnumList.isEmpty(): ${numList.isEmpty()}")
}

/**
 * Similar to chunked: But more flexibility like step
 * Also, this will produce lists which can have overlaps
 * Not like chunks, more like closing window snapshots
 */
fun windowedDemonstration(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: windowedDemonstration()")
    println(numList)
    println(numList.windowed(3, step = 1))
}

fun chunkedDemonstration(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: chunkedDemonstration()")
    val numberList = (0..13).toList()
    //Breaks up the list into chunks of elements
    println(numberList.chunked(3))
    //The curly braces hold the transformation to be done on each chunk
    println(numberList.chunked(3) {
        it.sum()
    })
}

fun takeWhileAndDropLastWhile(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: takeWhileAndDropLastWhile()")
    //Stop take when condition is false
    println(numList.takeWhile {
        !it.startsWith("f")
    })
    //Stop take from right when condition is false
    println(numList.takeLastWhile {
        it != "three"
    })
    //Stop dropping when condition is false
    println(numList.dropWhile {
        it.length == 3
    })
    //Stop Removal from the right when the condition is false
    println(numList.dropLastWhile {
        it.contains("i")
    })
}

private fun takeAndDropDemonstration(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: takeAndDropDemonstration()")
    println("numList.take(2): ${numList.take(2)}")
    //Return list of the last 2 entries
    println("numList.takeLast(2): ${numList.takeLast(2)}")
    //Return list except the first 2
    println("numList.drop(2): ${numList.drop(2)}")
    println("numList.dropLast(1): ${numList.dropLast(1)}")
}

private fun sliceDemonstration(numList: List<String>) {
    println("\nRetrieveCollectionParts.kt:: sliceDemonstration()")
    println(
        "numList.slice(1..3): " +
                "${numList.slice(1..3)}"
    )
    println(
        "numList.slice(0..4 step 2): " +
                "${numList.slice(0..4 step 2)}"
    )
    println(
        "numList.slice(setOf(3, 5, 0)): " +
                "${numList.slice(setOf(3, 5, 0))}"
    )
}