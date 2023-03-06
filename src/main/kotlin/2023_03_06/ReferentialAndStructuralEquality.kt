package `2023_03_06`


/**
 * Structural equality versus referential equality
 */
fun main() {
    val user1 = User("Alex", "Dobby", 30)
    val user2 = User("Alex", "Dobby", 30)

    println("user1 == user2: ${user1 == user2}")
    println("user1: $user1")
}

class User(var firstName: String, var lastName: String, var age: Int) {

    /*
     * Structural equality check with == uses the equals method of the class implicitly
     * If it is not overridden from Amy, will fall back to referential equality check
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other is User) {
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age == other.age
        }
        return false
    }

    /*
     * hashCode is used for performance reasons in collections, particularly the hashMap and hashSet
     * If 2 objects are equal with equals, their hashCodes need to be equal
     */
    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return "User(firstName: '$firstName', lastName: '$lastName', age: '$age')"
    }
}


private fun structuralAndReferentialEquality() {
    val num1 = Example("Example")
    val num2 = Example("Example")

    //Structural equality: Equality of content
    println("num1 == num2: ${num1 == num2}")

    //Referential equality: Equality of references
    println("num1 === num2: ${num1 === num2}")
}

class Example(val name: String) {
    /**
     * Structural equality check
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Example

        if (name != other.name) return false

        return true
    }

    override fun hashCode() = name.hashCode()
}