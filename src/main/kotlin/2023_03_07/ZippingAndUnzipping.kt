package main.kotlin.`2023_03_07`

/**
 * Zipping: Pair up elements at the same index in the lists
 */

fun main() {
    val colorList = listOf("Red", "Brown", "Grey")
    val animalList = listOf("Lion", "Fox", "Bear")

    val pairList: List<Pair<String, String>> = colorList.zip(animalList)
    println("colorList.zip(animalList): $pairList")
    println("colorList zip animalList: ${colorList zip animalList}")

    println("\nassociateBy demonstration")
    val map: Map<String, String> = pairList.associateBy({ it.first }, { it.second })
    println(" map: $map")

    val zip: List<String> = colorList.zip(animalList) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
    }
    println("\ncolorList.zip(animalList){colorList, animalList -> \"The \${animalList.replaceFirstChar{it.uppercase()}} is \$color\": \n$zip")

    println("\nUnzip Demonstration")
    val numberPairs: List<Pair<String, Int>> = listOf("One" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    val unzip: Pair<List<String>, List<Int>> = numberPairs.unzip()
    println(" unzip: $unzip")
}