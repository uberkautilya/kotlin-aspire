package `2023_03_06`

fun main() {
    val cellPhone = Xiaomi("Redmi", "Black", 22068)
    cellPhone.music()
    cellPhone.powerOff()
}

/**
 * Abstract classes can have properties, unlike interfaces: Interfaces -> Only with access modifier?
 * Cannot create instances directly
 * Used when APIs will generate the actual implementations for the defined functions
 * Interfaces are used in event handling
 */
abstract class Cellphone {
    val text = "Some text"

    fun music() {
        println("Playing music")
    }

    //Body of the abstract function will be provided by implementing class
    abstract fun powerOff()
}

/**
 * Has to implement members when inheriting from abstract classes
 */
class Xiaomi(val name: String, val color: String, val price: Int) : Cellphone() {
    override fun powerOff() {
        println("Powering off Xiaomi")
    }
}