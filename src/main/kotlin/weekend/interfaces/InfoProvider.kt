package main.kotlin.weekend.interfaces

import main.kotlin.weekend.classes.Human4

/**
 * Like classes, if there are no members in the interface, can omit the curly braces '{}'
 * interface InfoProvider
 */
interface InfoProvider {
    //Default implementation for methods is allowed in the interface if desired
    fun printInfo(human4: Human4){
        println("basicInfoProvider")
        human4.printInfo()
    }
}

/**
 * To implement an interface, use a ':' on the definition
 */
class BasicInfoProvider : InfoProvider {
    /*
To override a method in Kotlin, need override keyword before it
Here, the interface has a default implementation for the method, hence this override is not necessary
*/
    override fun printInfo(human4: Human4) {
        println("basicInfoProvider")
        human4.printInfo()
    }
}


fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Human4())
}