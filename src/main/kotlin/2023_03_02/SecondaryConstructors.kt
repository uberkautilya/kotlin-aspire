package `2023_03_02`

fun main() {
    secondaryConstructorDemonstration()
    constructorWithDefaultPropertyValues()
}

private fun constructorWithDefaultPropertyValues() {
    println("\nSecondaryConstructors.kt:: constructorWithDefaultPropertyValues()")
    val mouse = Mouse(dpi = 2600)
    println("mouse: $mouse")

    val mouseWithEmptyConstructor = Mouse()
    println("mouseWithEmptyConstructor: $mouseWithEmptyConstructor")
}


private fun secondaryConstructorDemonstration() {
    val clock = Clock("Ajanta", 0)
    println("clock.age: ${clock.age}")

    val clockWithSecondaryConstructor = Clock("Ajanta")
    println("clockWithSecondaryConstructor.age: ${clockWithSecondaryConstructor.age}")

    val emptyConstructor = Clock()
}

class Clock(var name: String, var age: Int) {

    //Secondary constructors CAN NOT declare properties, only parameters
    constructor(name: String) : this(name, 1) {
        println("Constructor invoked with just the name")
    }

    //Calls the secondary constructor. The block is executed when this constructor is invoked
    constructor() : this("Stubbed") {
        //Executed after the object is created with this("Stubbed")
        println("Instantiation with empty constructor")
    }
}

/**
 * Primary constructor with default arguments
 * Can be overridden with named parameters or otherwise
 */
class Mouse(
    var name: String = "Dell",
    var model: String = "KM7321W",
    var dpi: Int = 4000
) {
    constructor(dpi: Int): this(name = "Combo", dpi = dpi)
    override fun toString() = "Mouse(name='$name', model='$model', dpi=$dpi)"
}
