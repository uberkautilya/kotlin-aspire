package `2023_03_03`

fun main() {
    accessEnumValuesAndMethods()

    //Get enum whose name is "NORTH"
    //Will trigger IllegalArgumentException if such a value is not found
    val direction = Direction.valueOf("north".uppercase())

    when (direction) {
        Direction.EAST -> println("East facing")
        Direction.WEST -> println("West facing")
        Direction.SOUTH -> println("South facing")
        Direction.NORTH -> println("North facing")
    }
}

private fun accessEnumValuesAndMethods() {
    for (direction in Direction.values()) {
        println(direction)
    }

    //name is a property implicitly added which holds enum name
    println("Direction.NORTH.name: ${Direction.NORTH.name}")
    println("Direction.NORTH.country: ${Direction.NORTH.country}")
    println("Direction.NORTH.distance: ${Direction.NORTH.distance}")

    //Values in the \${} is evaluated to construct this string
    println("Direction.EAST.printData(): ${Direction.EAST.printData()}")
}

enum class Direction(var country: String, var distance: Int) {
    NORTH("India", 3),
    SOUTH("Bangladesh", 24),
    EAST("Pakistan", 87),
    WEST("Sri Lanka", 10);

    fun printData() {
        println("this.country: $country, this.distance: $distance")
    }
}