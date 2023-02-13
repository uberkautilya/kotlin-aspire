package main.kotlin.weekend.objectdeclarations

/**
 * Object declarations are used to create thread safe singletons
 */
object EntityFactory {
    fun create() = Entity("Id", "Name")
}

class Entity constructor(var id: String, val name: String) {
    override fun toString(): String {
        return "id: $id, name: $name"
    }
}

fun main() {
    val entity = EntityFactory.create()
    println(entity)
}
