package main.kotlin

fun main() {
    var anyVal: Any? = anySample()
    anyVal = null

}

private fun anySample(): Any? {
    var anyVal: Any?
    anyVal = "Str"
    anyVal = 123
    anyVal = 123.00
    anyVal = 123L
    return anyVal
}