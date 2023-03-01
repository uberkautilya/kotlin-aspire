package main.kotlin.weekend.visibilitymodifiers

/**
 * Classes, methods and properties: In short, visibility in general is public by default
 * Visibility Modifiers in Kotlin:
 * 1. Public: Default modifier - accessible everywhere
 * 2. Private: Access limited to the file of declaration
 * 3. Internal: Acts like public within the module
 * 4. Protected: Protected property or method will only be available within that class or its subclasses
 */
fun main() {
    val engineer = Engineer(101L, "Engineer")
    val privateEngineer = PrivateEngineer(101L, "PrivateEngineer")
}

/**
 * internal classes visibility is public within the module
 */
internal class Engineer(val id: Long, val name: String)

/**
 * private class: Constructors are not accessible outside this file
 */
private class PrivateEngineer(val id: Long, val name: String)

