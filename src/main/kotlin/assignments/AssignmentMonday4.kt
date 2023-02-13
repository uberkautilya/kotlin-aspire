package main.kotlin.assignments

data class Faculty(val name: String, val dept: String, val rating: Rating){
    data class Rating(val id: Long, val list: List<Int>, val array: Array<Int>)
}

fun main() {
    val faculty = Faculty("One", "Mechanical", Faculty.Rating(101L, listOf(12, 10), arrayOf(12)))
}
