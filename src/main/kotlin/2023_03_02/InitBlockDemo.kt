package `2023_03_02`

fun main() {
    val user = User("Coder", "Kotlin", 30)
    println("user.name: ${user.name}")
    val newerUser = User("Ardra", "Kotlin", 30)
    println("newerUser.name: ${newerUser.name}")
}

/**
 * To evaluate values in more than one line of code, need init blocks
 * init blocks are created when each instance of the class is created
 */
class User(name: String, var lastName: String, var age: Int) {
    var name: String
    // Multiple init blocks are allowed, executed in the order they are declared
    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("Name assigned default value as it doesn't start with 'a' or 'A'")
        }
    }

    fun move() {
        println("Move $name")
    }

    fun stop() {
        println("Stop $name")
    }
}