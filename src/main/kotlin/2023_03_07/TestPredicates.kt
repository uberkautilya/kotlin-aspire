package main.kotlin.`2023_03_07`

fun main() {
    val numberList = listOf("one", "two", "three", "four")
    val suffix = "e"
    //true
    println(numberList.any {
        it.endsWith(suffix)
    })
    //false
    println(numberList.none {
        it.endsWith("o")
    })
    //false
    println(numberList.all {
        it.length > 3
    })

}



