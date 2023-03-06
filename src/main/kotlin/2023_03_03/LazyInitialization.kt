package `2023_03_03`

/**
 * Lazy initialization is done when object creation is expensive
 */

fun main() {

    val bird1 = Bird("Chicken", "White", 5)

    //by lazy ensures that object will only be initialized when it is first used
    val bird2 by lazy {
        Bird("Peacock", "Multi", 2)
    }
    val bird3 = Bird("BlueJay", "Blue", 7)

    println("bird2 will now be initialized")
    println("bird2.color: ${bird2.color}")
}

class Bird(var name: String, var color: String, var age: Int){
    init {
        println("Bird: $name created")
    }
}