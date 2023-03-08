package main.kotlin.`2022_03_08`

/**
 * Sorted and Comparator interfaces
 */
fun main() {

    val laptopList = mutableListOf(
        Laptop("Aspire", 2023, 32, 230),
        Laptop("Acer", 2020, 16, 600),
        Laptop("Asus", 2020, 32, 500),
        Laptop("Apple", 2021, 8, 100)
    )
    //compareBy returns a Comparator<Laptop>
    println("\nSorted using price")
    laptopList.sortedWith(compareBy { it.price })
        .forEach { println("$it") }

    //Does the same thing as above internally
    println("\nSorted using RAM")
    laptopList.sortedBy { it.ram }.forEach { println(it) }

    //Chained Sorting: Sorting by year, then by price if same year
    println("\nSorted by year, then by price if same year")
    laptopList.sortedWith(
        //This results in a Comparator
        compareBy<Laptop> { it.year }.thenBy { it.price }
    ).forEach { println(it) }
}


data class Laptop(
    val brand: String, val year: Int, val ram: Int, val price: Int
)