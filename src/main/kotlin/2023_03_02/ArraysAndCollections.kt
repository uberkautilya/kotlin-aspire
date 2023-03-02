package `2023_03_02`

fun main() {
    arrayDemonstration()
    findMaxValue(arrayOf(4, 6, 2, 9, 1))
}

private fun arrayDemonstration() {
    val names: Array<String> = arrayOf("Krishna")
    println("names: ${names.contentToString()}")

    //Runtime ArrayIndexOutOfBoundsException can occur is index more than the highest
    names[0] = "Chakra"
    println("names[0]: ${names[0]}")

    //1 greater than the largest index
    println("names.size: ${names.size}")

    val mixed = arrayOf(4, "Kingmaker")
    for (value in mixed) {
        if (value is Int) {
            println("Int value: $value")
        }
        if (value is String) {
            println("String value: $value")
        }
    }
}

fun findMaxValue(numArray: Array<Int>) {
    println("\nArraysAndCollections.kt:: findMaxValue()")
    var max = numArray[0]
    numArray.forEach { if (it > max) max = it }
    println("max: $max")
}