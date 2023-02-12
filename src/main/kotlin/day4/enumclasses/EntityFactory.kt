package main.kotlin.day4.enumclasses

import java.util.*

/**
 * Object declarations are used to create thread safe singletons
 */
object EntityFactory {
    fun create(type: EntityType) : Entity {
        val id = UUID.randomUUID().toString()

        val name = when (type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.name
            //type.name would return the name of the enum
            EntityType.HARD -> type.getFormattedName()
        }
        return Entity(id, name)
    }
}
enum class EntityType{
    EASY, MEDIUM, HARD;

    fun getFormattedName(): String {
       return name.lowercase().replaceFirstChar { it.uppercase() }
    }
}

class Entity constructor(var id: String, val name: String) {
    override fun toString(): String {
        return "id: $id, name: $name"
    }
}

fun main() {
    val entity = EntityFactory.create(EntityType.EASY)
    println(entity)
    val entity2 = EntityFactory.create(EntityType.HARD)
    println(entity2)
}
