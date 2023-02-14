package main.kotlin.monday

class ParentClassConstructor {
}

open class BasicCircle(var circumference: Double)
class Circle(private val radius: Double, circumference: Double) : BasicCircle(circumference) {

    override fun toString(): String {
        return "$radius: $circumference"
    }
}

fun main() {
    var circle = Circle(10.0, 20.0)
    println(circle)
    circle = Circle(11.0, 13.23)
    println(circle)
}