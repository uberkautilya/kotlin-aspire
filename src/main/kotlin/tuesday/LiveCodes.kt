package main.kotlin.tuesday

fun main() {
    twoSetsWithSameValuesEquals()
}

private fun twoSetsWithSameValuesEquals() {
    var obj1 = setOf(1, 2, 3, 4)
    var obj2 = setOf(1, 2, 3, 4)
    println(obj1 === obj2)

    var str1 = "abc"
    var str2 = "abc"
    println(str1 === str2)
}
private fun sortMapWithKey(map: Map<Int, String>) {
//    map.toSortedMap(compareBy {  })
}