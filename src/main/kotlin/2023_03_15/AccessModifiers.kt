package `2023_03_15`

/**
 * FOUR:
 *
 * Public: Default value - can be accessed by any other function or file if imported
 * Private: Declaring at top level, outside of classes - accessible within the file only
 * Internal: Accessible within the same module - for single module projects, same as public?
 *      Module: A group of files which are compiled together
 *
 * Protected only used on properties of classes
 * Protected: Accessible only from within the class or its subclasses
 */

/**
 * main method here is public as it is the default access modifier
 */
fun main() {
    accessFromAnotherFile()
    val user = User()
//    user.lastName = "" Not possible as it is private
    user.updateLastName("New LastName")
    user.id = 100
//    user.address = "New Address" Not possible as it is protected: Accessible only from within the class or its subclasses
}

class PremiumUser : User() {
    fun printInfo() {
        /* Protected properties can be used in subclasses. Private properties cannot be accessed in subclasses */
        println("Address: $address")
    }
}

/**
 * Getters and setters have the same visibility as the property itself
 */
open class User {
    /* Accessible only within the same module -> Same as public for single module projects */
    internal var id: Int = 0

    protected var address: String = ""

    /* public redundant: Default value is public */
    public var firstName: String = ""

    /* private variables cannot be accessed outside the class */
    private var lastName: String = ""
    fun updateLastName(lastName: String) {
        this.lastName = lastName
        this.address = "Edited Address"
    }
}


/**
 * Can only be accessed within this file
 */
private fun getData() {
    println("A private top level function")
}

private fun accessFromAnotherFile() {
    /* Can access private members within the declaring file only */
    getData()

    /* If class Team were private in its file, could not have accessed it here */
    val footballTeam = Team<FootballPlayer>(
        "Football", mutableListOf(FootballPlayer("Player 101"))
    )
}
