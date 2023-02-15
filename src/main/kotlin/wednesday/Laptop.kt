package main.kotlin.wednesday

/**
 * Points to be explored
 * 1.Can we pass user defined object in mutable list?
 * 2.Can we have user defined objects in map?
 * 3.Can we override toString method
 * 4.Sorting in Map
 * 5.Can we write user defined function in 'It'
 * 6.Enum class in kotlin
 * 7.Switch with enum
 * 8.Sealed class in kotlin
 * 9.Can we covert dto to entity and vice versa in kotlin (Entity <-> dto)
 * 10.Comparator and Comparable in Kotlin
 * Kotlin - Exception Handling
 */

data class Laptop(
    val id: Int,
    val brand: String,
    val price: Double
): Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        // If this equality case is not handled, 1st occurrence is overwritten
        if (id == other.id) {
            return price.compareTo(other.price)
        }
        return id.compareTo(other.id)
    }

    override fun toString(): String {
        return "Overridden toString() of Laptop: " +
                "id: $id, brand: $brand, price: $price \n"
    }
}
