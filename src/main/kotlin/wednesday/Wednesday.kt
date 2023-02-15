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

fun main() {
//    userDefinedTypeInMutableList()
//    userDefinedTypeInMap()
//    sortInMap()
//    userDefinedFunctionCalledWithArgumentIt()
//    conversionBetweenEntityAndDTO()
    exceptionHandling()
}

fun exceptionHandling() {
    val predicate = true
    val intVal = try {
        if (predicate) {
            throw NumberFormatException("Explicit throw of NFE")
        } else {
            println("predicate is false")
            12
        }
    } catch (nfe: NumberFormatException) {
        println(nfe.message)
        100
    }finally {
        println("Finally block execution")
    }
    println("intVal: $intVal")
}

fun conversionBetweenEntityAndDTO() {
    var laptopDTO = Laptop(101, "Lenovo", 100200.00)

    val lEntity: LaptopEntity = laptopDTO.run {
        LaptopEntity(id, brand, price)
    }
    println("lEntity: $lEntity")

    val lDTO: Laptop = lEntity.run {
        Laptop(id ?: 0, brand ?: "", price ?: 0.0)
    }
    println("lDTO: $lDTO")
}


fun userDefinedFunctionCalledWithArgumentIt() {
    val list = listOf("Apple", "BlueBerry", "Carrot", "Dragonfruit")
    list.forEach {
        fun concatenateIND(str: String): String {
            return "$str IND"
        }
        println("concatenateIND(it): ${concatenateIND(it)}")
    }
    //-----
    fun capitalizeText(str: String): String {
        return str.uppercase()
    }
    //-----
    val modifiedList = list.map {
        capitalizeText(it)
    }.toList()
    println("modifiedList: $modifiedList")
}


fun sortInMap() {
    val laptopMap = mapOf(
        1 to Laptop(109, "Lenovo", 62899.00),
        3 to Laptop(107, "HP", 72899.00),
        5 to Laptop(108, "Apple", 98899.00),
        4 to Laptop(106, "Toshiba", 52899.00),
        2 to Laptop(104, "Acer", 59899.00),
        6 to Laptop(106, "Realme", 49899.00)
    )
    println("laptopMap: \n$laptopMap")
    //toSortedMap() without parameters sorts as per the key
    println("laptopMap.toSortedMap(): \n${laptopMap.toSortedMap()}")

    sortWithComparatorInline(laptopMap)

    sortWithComparableInLaptop(laptopMap)

    sortConvertingToListAndBack(laptopMap)
}

fun sortConvertingToListAndBack(laptopMap: Map<Int, Laptop>) {
    val list = laptopMap.toList()
    val sortedMap = list
        // For sorting by laptop, it implicitly uses the comparable implementation
        .sortedBy { (_, laptop) -> laptop }
        .toMap()
    println("sortedMap: $sortedMap")
}

private fun sortWithComparatorInline(laptopMap: Map<Int, Laptop>) {
    //Comparator way
    val sortedByIdOfLaptops = laptopMap.toSortedMap { o1, o2 ->
        val order = laptopMap[o1]?.id?.compareTo(laptopMap[o2]?.id ?: -1) ?: -1
        // Without this, the first record with an id is overwritten by the second record with same id
        if (order == 0) -1 else order
    }
    println("sortedByIdOfLaptops: \n$sortedByIdOfLaptops")

    //With Comparator class
    val sortedWithComparatorClass = laptopMap.toSortedMap { k1, k2 ->
        LaptopComparator().compare(laptopMap[k1], laptopMap[k2])
    }
    println("sortedWithComparatorClass: $sortedWithComparatorClass")
}

private fun sortWithComparableInLaptop(laptopMap: Map<Int, Laptop>) {
    //Comparable implementation in class alternative
    val sorterByComparable = laptopMap.toSortedMap<Int, Laptop> { a1, a2 ->
        if (null == laptopMap[a1]) {
            -1
        } else if (null == laptopMap[a2]) {
            1
        } else {
            laptopMap[a1]!!.compareTo(laptopMap[a2]!!)
        }
    }
    println("sorterByComparable: $sorterByComparable")
}

fun userDefinedTypeInMap() {
    val laptopMap = mapOf<Int, Laptop>(
        1 to Laptop(101, "Lenovo", 62899.00),
        2 to Laptop(102, "Acer", 59899.00)
    )
    println()
    laptopMap.forEach { (int, laptop) -> print("\n$int: $laptop") }
}

fun userDefinedTypeInMutableList() {
    val laptopList = listOf(
        Laptop(101, "Lenovo", 62899.00),
        Laptop(102, "Acer", 59899.00)
    )
    print("\nlaptopList: $laptopList")
}


