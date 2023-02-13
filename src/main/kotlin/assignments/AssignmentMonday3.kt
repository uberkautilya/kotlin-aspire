package main.kotlin.assignments

fun main() {
    val resultList = removeFromList(mutableListOf("Lesson101", "Not a lesson", "Lesson102"))
    println("resultList: $resultList")

    val duplicatesRemoved = removeDuplicates(mutableListOf("Lesson101", "Not a lesson", "Lesson102", "Lesson101", "Not a lesson"))
    println("duplicatesRemoved: $duplicatesRemoved")
}

fun removeFromList(list: List<String>): List<String> {
    return list.filter { it.startsWith("Lesson") }.toList()
}

fun removeDuplicates(list: List<String>): List<String> {
    return list.distinct().toList()
}