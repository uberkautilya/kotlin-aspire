package main.kotlin.day4.dataclasses;

import java.util.*

/**
 * Data classes are concise, immutable data types
 * Generates equals, toString and hashCode implicitly
 * Allows comparisons on instances of data classes using '==' - data contained equal or not
 */

enum class EntityType {
    EASY, MEDIUM, HARD, HELP;
    fun getFormattedName(): String {
        return name.lowercase().replaceFirstChar { it.uppercase() }
    }

}

sealed class Entity() {
    data class Easy(val id: String, val name: String) : Entity()
    class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity(){
        /*
         * 'equals' function is used to check for value equals with '=='
         * data class already provides a default implementation for equals
        */
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    object Help : Entity() {
        val name = "Help"
    }
}

fun main() {
    //Won't be equal as UUID is used to generate Ids
    var entity1 = EntityFactory.create(EntityType.EASY)
    var entity2 = EntityFactory.create(EntityType.EASY)

    entity1 = Entity.Easy("id", "name")
    entity2 = entity1.copy()
    //Named arguments can be used to override only the desired values of the instance
    entity2 = entity1.copy(name = "Mithun")
    /*
    Double equals is used to compare against values
    This works off of the equals method generated by the compiler implicitly for a data class
    For referential comparison, use ===: triple equals
    */
    if (entity1 == entity2) {
        println("They are equal")
    } else {
        println("Not equal. $entity1, $entity2")
    }
}

/**
 * Sealed classes implements restrictive class hierarchies
 */
object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()

        val name = when (type) {
            EntityType.EASY -> type.name
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
