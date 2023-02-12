package main.kotlin.day4.companionobjects

//private constructor ensures only this class can access this constructor
class Entity private constructor(val id: String) {
    val prop: String = "Property"
    /*
     * Companion object is an object scoped to an instance of another class
     * Like other classes, can implement interfaces
    */
    companion object Factory: IdProvider{
        const val id = ""
        override fun getId(): String {
            return "123"
        }
        //Companion objects have access to private constructors, properties and methods of the enclosing class
        fun create() = Entity(getId())
    }
}

fun main() {
    val entity = Entity.Factory.create()
    //Can be shortened when accessed from a Kotlin file
    val entity2 = Entity.create()
    //Can access the companion object properties as if a static property
    entity2.id
}

interface IdProvider {
    fun getId(): String
}