package main.kotlin.day4.sealedclasses;

import java.util.*

/**
 * Sealed classes implements restrictive class hierarchies
 */
object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()

        val name = when (type) {
            EntityType.EASY -> type.name
            //type.name would return the name of the enum
            EntityType.MEDIUM -> type.name
            EntityType.HARD -> type.getFormattedName()
            EntityType.HELP -> type.getFormattedName()
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 1.1F)
            EntityType.HELP -> Entity.Help
        }
    }
}

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;

    fun getFormattedName(): String {
        return name.lowercase().replaceFirstChar { it.uppercase() }
    }
}

/**
 * When passed as argument to a when statement, compiler needs exhaustive list of branches
 * Cannot instantiate sealed types directly with a constructor
 * Classes extending sealed classes can have different sets of properties and methods
 * Compiler can perform smart casting on an instance variable
 * Also, we can have different types of classes withing the sealed classes
 * Even object declaration within the sealed class hierarchy is permitted
 */
sealed class Entity() {
    data class Easy(val id: String, val name: String) : Entity()
    class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()

    /*
     * Help is static - no constructor. Also, objects are singletons
     * If the object extends Entity, can be assigned to a variable of type Entity
    */
    object Help : Entity() {
        val name = "Help"
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    val entity2: Entity = EntityFactory.create(EntityType.HARD)
    println(entity2)

    /*
     * Static type checking on a sealed type's instance
     * Addition of a type within the sealed class will give compiler error - easy to identify
    */
    val message = when (entity2) {
        is Entity.Easy -> "Easy class"
        is Entity.Hard -> entity2.multiplier.toString()
        Entity.Help -> "Help class"
        is Entity.Medium -> "Medium class"
    }
    println("Message: $message")
}
