package `2023_03_06`

fun main() {
    val plane = Plane("Boeing", "White")
    plane.startEngine()
}


/**
 * Interface: To share behavior among many classes, though implementations vary
 */
interface Engine {
    //By default, functions in interfaces are abstract
    fun startEngine()
}


class Tesla(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Tesla starts")
    }

}

class Truck(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Truck engine starts")
    }
}

class Plane(val name: String, val color: String) : Engine {
    override fun startEngine() {
        println("Plane engine starts")
    }
}








