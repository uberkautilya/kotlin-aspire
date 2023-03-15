package `2023_03_15`

/**
 * When the compiled code goes to the JVM, it is not going to see a list of Integers - only a bare list: don't make it to runtime
 * Generics is a compile time feature that help write consistent code
 */
fun main() {

    val list: Any = mutableListOf<String>("Hello", "World")
    /*
    Cannot check instance of erased type List<String>
    println(list is List<String>)
    Can only check if the 'list' is of 'List', not a specific type list
    */
    println(list is List<*>)


    val mixedList = mutableListOf(1,2,3,"hello", "world", 360, 'a', 'b', 'c')
    val specificList = getSpecificTypes<Int>(mixedList)
    specificList.forEach { println(it) }
}

/**
 * With reified keyword, the type information makes it to the runtime?
 * Here the el can be checked for type due to this.
 * Also, only inline functions can have reified type
 */
inline fun <reified T> getSpecificTypes(list: List<Any>): List<T> {
    val specificList = mutableListOf<T>()
    for (el in list) {
        if (el is T) {
            specificList.add(el)
        }
    }
    return specificList
}

