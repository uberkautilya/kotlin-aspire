package main.kotlin.day4.interfaces

import main.kotlin.day4.classes.Human4
import main.kotlin.day4.classes.Person

interface InformationProvider {
    //Properties cannot be initialized in interfaces
    val providerInfo: String

    //Default implementation provided
    fun printInfo(human4: Human4){
        println(providerInfo)
        human4.printInfo()
    }
}

class BasicInformationProvider : InformationProvider {
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
 */
class MultipleInterfaceImplementer : InformationProvider, SessionInformationProvider {
    override val providerInfo: String
        get() = "BasicInformationProvider"

    override fun printInfo(human4: Human4) {
        println("printInfo overridden in BasicInformationProvider")
    }

    override fun getSessionId(): String {
        return "Session Id"
    }
}