package main.kotlin.`2023_03_07`

//plus and minus are defined on collections

fun main() {
    val numberList = mutableListOf("one", "two", "three", "four")
    numberList.add("five")

    //Alternatively, use '+' and '-'
    val plusList = numberList + "six"
    println("\nplusList: $plusList")
    val minusList = numberList - mutableSetOf("three", "four")
    println("minusList = $minusList")
}