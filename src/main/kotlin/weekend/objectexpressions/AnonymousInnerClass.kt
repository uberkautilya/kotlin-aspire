package main.kotlin.weekend.objectexpressions

import main.kotlin.weekend.classes.Human4
import main.kotlin.weekend.interfaces.InformationProvider

fun main() {
    //To create object which implements an interface:
    // Creates an anonymous inner class: Called 'object expression'
    val providerAnonymous = object : InformationProvider {
        override val providerInfo: String
            get() = "providerInfo from anonymous inner class"

        override fun printInfo(human4: Human4) {
            println("printInfo method overridden from the anonymous inner class")
        }

        //Can add properties in the object expression
        fun getSessionId() = "Anonymous Id"
    }
    providerAnonymous.getSessionId()
    providerAnonymous.printInfo(Human4())
}