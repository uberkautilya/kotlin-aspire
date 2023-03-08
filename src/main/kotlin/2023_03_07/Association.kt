package main.kotlin.`2023_03_07`

fun main() {
    val numberList = listOf("One", "Two", "Three", "Four")

    //associateWith will create a map where the original values in the collection are keys
    val associateWith: Map<String, Int> = numberList.associateWith { it.length }
    println("associateWith: $associateWith")

    //Here the key is provided by the lambda function. As T gets mapped to Two and Three, the former is overwritten
    println(
        "\nnumberList.associateBy { it.first().uppercase() }: \n${
            numberList.associateBy {
                it.first().uppercase()
            }
        }"
    )

    println("\nassociateBy with keySelector and valueTransform")
    val associateBy = numberList.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length })
    println("associateBy: $associateBy")
}

