package main.kotlin.day4.typecheckingcasting

import main.kotlin.day4.interfaces.BasicInformationProvider
import main.kotlin.day4.interfaces.InformationProvider
import main.kotlin.day4.interfaces.MultipleInterfaceImplementer
import main.kotlin.day4.interfaces.SessionInformationProvider

fun checkTypes(infoProvider: InformationProvider) {
    /*
    'is' is like 'instanceOf'? to check if the object is an instance of a type
    If a class implements an interface, the instance will give true when checking
    */
    if (infoProvider is SessionInformationProvider) {
        println("$infoProvider is a SessionInformationProvider")
    } else {
        println("$infoProvider is not a SessionInformationProvider")
    }
}

fun main() {
    val provider = BasicInformationProvider()
    checkTypes(provider)

    val multiInterfaceProvider = MultipleInterfaceImplementer()
    checkTypes(multiInterfaceProvider)
}