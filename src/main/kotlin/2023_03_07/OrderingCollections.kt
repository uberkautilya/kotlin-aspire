package main.kotlin.`2023_03_07`

/**
 * Sorted and Comparator interfaces
 */
fun main() {
    val numList = mutableListOf(2, 5, 1, 40, 20, 100, 60)
    //Int class has implicit compareTo function as it implements the Comparable Interface
    println("\nnumList.sorted(): ${numList.sorted()}")

    val laptopLists = mutableListOf(
        Laptop("Aspire", 2023, 32, 230),
        Laptop("Acer", 2020, 16, 600),
        Laptop("Apple", 2021, 8, 100)
    )
    //Made possible by the implementation of Comparable interface on Office class
    laptopLists.sorted().forEach {
        println("$it")
    }

    println("\nSorting with RamComparator")
    laptopLists.sortedWith(RamComparator()).forEach { println("$it") }

    println("\nSorting with PriceComparator")
    laptopLists.sortedWith(PriceComparator()).forEach { println("$it") }
}

/**
 * Comparators provide multiple choice of ordering a type
 */
class RamComparator : Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if (o1.ram > o2.ram) {
            1
        } else if (o1.ram < o2.ram) {
            -1
        } else 0
    }
}

class PriceComparator : Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if (o1.price > o2.price) {
            1
        } else if (o1.price < o2.price) {
            -1
        } else 0
    }

}


data class Laptop(
    val brand: String,
    val year: Int,
    val ram: Int,
    val price: Int
) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.year > other.year) {
            println("Receiver object(this) is greater than the other object")
            1
        } else if (this.year < other.year) {
            -1
        } else 0
    }
}