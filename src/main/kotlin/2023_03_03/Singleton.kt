package `2023_03_03`

fun main() {
    createSingletonClassical()
    createSingletonWithObjectKeyword()
}

fun createSingletonWithObjectKeyword() {
    println("DataB: $DataB")
    println("DataB is an object. Init block not called hereafter")
    println("DataB: $DataB")
    println("DataB: $DataB")
    println("DataB.url: ${DataB.url}")
}

/**
 * No constructor allowed as it is a singleton - No ()
 *
 */
object DataB {
    var url: String
    init {
        println("DataB Init block: Called only once")
        url = "jdbc url"
    }

    fun printWelcomeUrl(): String {
        return url
    }
}

private fun createSingletonClassical() {
    //Only One instance of a particular class created, used across the whole code
    println("Database.getInstance(): ${Database.getInstance()}")

    //Will return the same instance
    println("Database.getInstance(): ${Database.getInstance()}")

    /*
    NOT allowed as the constructor is private
    Database()
    */
}

/***
 * To make object creation restricted - only one instance
 * The constructor of the class has to be made private
 * When using access modifier in the definition, need to use constructor keyword
 * Cannot access properties and functions of this class without object creation
 * Since constructor is private, it can only be accessed within the class
 */
class Database private constructor() {
    companion object {

        private var instance: Database? = null

        /**
         * companion object can be accessed without instantiation
         */
        fun getInstance(): Database? {
            if (instance == null) {
                instance = Database()
            }
            return instance
        }

    }
}

