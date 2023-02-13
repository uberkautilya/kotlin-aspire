package main.kotlin.weekend.advancedfunctions

/**
 * associate will associate the value with some other to return a map
 * find(predicate) on lists can be used to find first occurrence - Nullable
 */
fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
    val map = list
        .take(4)
        .filterNotNull()
        .filter { it.startsWith("J") }
        .associate { it.length to it }
//        .forEach { println("${it.key}: ${it.value}") }

    val language = list.first()
    println("language: ${language}")
    val findResult = list.filterNotNull()
        .find { it.startsWith("foo") }?:"Not found"
    println("findResult: ${findResult}")

    //orEmpty() method is available on String? to return ""
    val stringOrEmpty = list.filterNotNull()
        .findLast{it.startsWith("foo")}.orEmpty()
    println("stringOrEmpty: ${stringOrEmpty}")
}