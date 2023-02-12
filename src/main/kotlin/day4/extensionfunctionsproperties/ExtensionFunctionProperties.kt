package main.kotlin.day4.extensionfunctionsproperties

import main.kotlin.day4.dataclasses.EntityFactory
import main.kotlin.day4.dataclasses.EntityType
import main.kotlin.day4.dataclasses.Entity

/**
 * Extension functions and properties allow
 * addition of new functions and properties on existing class
 * It can also be used to customize the behavior of classes which you can't control
 * New API around an existing class
 */
fun Entity.Hard.printInfo() {
    println("Hard class with id: $id")
}
//Extension property on Entity.Hard
val Entity.Hard.info: String
    get() = "Extension Prop"

fun main() {
    Entity.Hard("101", "name", 1.23F).printInfo()
    val entity = EntityFactory.create(EntityType.HARD)
    if (entity is Entity.Hard) {
        /*
         * Within this if context, compiler makes available all methods defined on Entity.Hard
         * Note that since the printInfo() is an extension function on Hard, it is not available on Entity.Easy, Entity.Medium etc.
        */
        entity.printInfo()
        println("Extension Property on Entity.Hard: ${entity.info}")
    }
}