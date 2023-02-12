package main.kotlin.day4.interfaces

import main.kotlin.day4.classes.Human4

interface InformationProvider {
    //Properties cannot be initialized in interfaces
    val providerInfo: String

    //Default implementation provided
    fun printInfo(human4: Human4) {
        println(providerInfo)
        human4.printInfo()
    }
}

/**
 * Only classes that are 'open' can be extended - inherited from.
 */
open class BasicInformationProvider : InformationProvider {
    override val providerInfo: String
        get() = "BasicInformationProvider"

    override fun printInfo(human4: Human4) {
        super.printInfo(human4)
        println("printInfo overridden in BasicInformationProvider")
    }
}

fun main() {
    val provider = BasicInformationProvider()
    provider.printInfo(Human4())

    //Creating instance of Class implementing multiple interfaces
    val multipleInterfaceInstance: MultipleInterfaceImplementer = MultipleInterfaceImplementer()
    multipleInterfaceInstance.getSessionId()
}

interface SessionInformationProvider {
    fun getSessionId(): String
}

/**
 * To implement multiple interfaces, separate them with commas
 * Only open classes can be extended
 */
open class MultipleInterfaceImplementer : InformationProvider, SessionInformationProvider {
    override val providerInfo: String
        get() = "BasicInformationProvider"

    /* Only 'open' properties can be overridden in extending classes
    * 'protected' properties can only be accessed from within the class or its subclasses
    * */
    protected open val sessionIdPrefix = "Session"

    override fun printInfo(human4: Human4) {
        println("printInfo overridden in BasicInformationProvider")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}