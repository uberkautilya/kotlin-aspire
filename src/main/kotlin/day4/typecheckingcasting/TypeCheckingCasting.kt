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
    if (infoProvider !is SessionInformationProvider) {
        println("$infoProvider is not a SessionInformationProvider")
    } else {
        println("$infoProvider is a SessionInformationProvider")
        /*
        'as' is the keyword used to cast an object into an instance of a class
         */
        (infoProvider as SessionInformationProvider).getSessionId()
        /*
        Since this occurs inside an if condition where the type is checked, smart cast is performed
        i.e., the above cast is redundant. All methods on SessionInformationProvider is available already
        */
        infoProvider.getSessionId()
    }
}

fun main() {
    val provider = BasicInformationProvider()
    checkTypes(provider)

    val multiInterfaceProvider = MultipleInterfaceImplementer()
    checkTypes(multiInterfaceProvider)
}