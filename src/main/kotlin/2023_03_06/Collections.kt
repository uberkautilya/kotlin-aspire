package `2023_03_06`

/**
 * Lists, Sets and Maps - Mutable and Immutable type
 */
fun main() {
//    listDemonstration()
//    setDemonstration()
//    userDefinedTypeInSet()
    mapDemonstration()
}

fun mapDemonstration() {
    val userMap = mapOf<Int, String>(1 to "Maria", 2 to "Arya", 3 to "Jack")
    println(userMap[2])

    val mutableMap = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    mutableMap[4] = "D"
    mutableMap.forEach { (k, v) ->
        println("$k: $v")
    }
    println("\nRemoving element")
    //If key value don't match in remove function, no value is removed
    mutableMap.remove(2, "B")
    mutableMap.forEach { t, u ->
        println("$t: $u")
    }
}


class UserCollection(val name: String) {
    override fun toString(): String {
        return "User(name = '$name')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserCollection

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

}

/**
 * Sets: Cannot hold duplicate elements
 */
private fun setDemonstration() {
    println("Immutable list")
    val stringSet = setOf("Name101", "Name102", "Name103", "Name101")
    stringSet.forEach { println(it) }

    println("Mutable list")
    val mStringSet = mutableSetOf("Name101", "Name102", "Name103")
    mStringSet.add("Name104")
    mStringSet.forEach { println(it) }
}

private fun userDefinedTypeInSet() {
    val user1 = UserCollection("Abc")
    val user2 = UserCollection("Bcd")
    val user3 = UserCollection("Cde")
    val user4 = UserCollection("Def")
    //This is a new object. If equals is implemented, New entry will not be added
    val user5 = UserCollection("Bcd")
    val userSet = mutableSetOf<UserCollection>()
    userSet.addAll(arrayOf(user1, user2, user3, user4, user5))
    userSet.forEach { println(it) }
}

private fun listDemonstration() {
    var stringList = listOf<String>("Name101", "Name102")
    println("names[0]: ${stringList[0]}")

    val stringListImmutable = mutableListOf("Name101", "Name102")
    stringListImmutable.add("New Name 101")
    stringListImmutable.removeAt(2)
    stringListImmutable.remove("Name101")
    stringListImmutable.forEach { println(it) }
}



