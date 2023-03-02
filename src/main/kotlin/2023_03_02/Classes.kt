package `2023_03_02`

fun main() {
    noArgConstructorDemonstration()
    multiArgumentBikeConstructorDemo()
}

private fun multiArgumentBikeConstructorDemo() {
    println("\nClasses.kt:: multiArgumentBikeConstructorDemo()")
    //Bike instantiation with multi argument constructor
    val bike = Bike("Yamaha", "FZ-S", "Black-Green")
    println("Bike: ${bike.name}")
    bike.move()
    bike.stop()
}

/**
 * Properties declared inside the primary constructor
 * Here manipulations like trim() and validations can't be done before assigning to properties
 * Values in primary constructor are directly assigned - lower control
 */
class Bike(var name: String, var model: String, var color: String) {
    fun move() {
        println("$name moves")
    }
    fun stop() {
        println("$name stops")
    }
}

/*
Constructor with parameters, not properties - allows data normalization before instantiation
class Bike(name: String, model: String, color: String){
var name = name.trim()
var model = model
var color = color
}
*/

private fun noArgConstructorDemonstration() {
    //Instantiation of car instance
    val car = Car()
    car.name = "Tesla"
    car.model = "S Plaid"
    car.color = "White"
    car.doors = 2
    println("Name = ${car.name}, Model = ${car.model}, Color = ${car.color}, Doors = ${car.doors}")
    car.move()
    car.stop()
}

/**
 * Classes represent the OOP concept where the state and functions are clubbed together in objects
 */
class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0
    fun move() {
        println("$name will Move")
    }

    fun stop() {
        println("$name will Stop")
    }
}