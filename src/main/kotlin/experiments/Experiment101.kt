package experiments

fun main() {
    val value = Num(1)
    addOne(value)
    println("value: ${value.num}")
}

/**
 * Cannot reassign values passed in as arguments
 * But can alter values in an object passed
 */
fun addOne(num: Num) {
    num.num++
}
class Num(var num: Int)
