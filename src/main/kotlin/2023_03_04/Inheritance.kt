package `2023_03_04`

fun main() {
    val car = Car("BMW", "Red", 2, 1, 2010)
    val plane = Plane("Boeing", "White", 4, 2)

    car.move()
    plane.move()
    plane.stop()
}

/**
 * Child classes can have additional properties as well
 * Here, model is an additional property
 */
class Car(
    name: String,
    color: String,
    engine: Int,
    doors: Int,
    private val model: Int
): Vehicle(name, color, engine, doors){
    override fun toString(): String {
        return "Car(model=$model)"
    }
}

class Plane(
    name: String,
    color: String,
    engine: Int,
    doors: Int
): Vehicle(name, color, engine, doors){
    override fun move() {
        fly()
        super.move()
    }
    private fun fly() {
        println("The plane: $name flies")
    }
}

/**
 * By default, classes are final in Kotlin
 * Only open classes can be inherited from
 * Shared functions and properties are added to this base class
*/
open class Vehicle(
    val name: String,
    val color: String,
    val engine: Int,
    val doors: Int
){
    open fun move() {
        println("$name moves")
    }
    fun stop() {
        println("$name stops")
    }
}