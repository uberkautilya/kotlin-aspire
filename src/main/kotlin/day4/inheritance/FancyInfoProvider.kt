package main.kotlin.day4.inheritance

import main.kotlin.day4.classes.Human4
import main.kotlin.day4.interfaces.BasicInformationProvider
import main.kotlin.day4.interfaces.MultipleInterfaceImplementer

/**
 * BasicInformationProvider is a class, in the interfaces package
 * Classes by default are closed - cannot be extended
 */
class FancyInfoProvider : MultipleInterfaceImplementer() {
    //override modifier is mandatory for properties which are overridden from Parent
    override val providerInfo: String
        get() = "Fancy Information Provider"

    override fun printInfo(human4: Human4) {
        println("Fancy Information Provider printInfo method overridden")
    }

    /*
     * protected properties can still be accessed within the class or its children
     */
    override val sessionIdPrefix: String
        get() = "Fancy Session"
}