package `2023_03_06`

import java.util.Date

//Refer ReferentialAndStructuralEquality for the need to override equals method

fun main() {
    val user1 = UserDC("Alex", "Dobby", 30)
    val user2 = UserDC("Alex", "Dobby", 30)

    println("user1 == user2: ${user1 == user2}")
    println("user1: $user1")
}


/**
 * Auto-generates equals, hashCode and toString() methods. Also generates the copy() and componentN() function
 * Only properties in the constructor is used to generate the above-mentioned
 * data class Constructor can only have properties, not parameters
 */
data class UserDC(var firstName: String, var lastName: String, var age: Int) {
    var timeStamp: Date = Date()
}