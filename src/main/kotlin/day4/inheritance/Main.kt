package main.kotlin.day4.inheritance

import main.kotlin.day4.classes.Human4
import main.kotlin.day4.interfaces.MultipleInterfaceImplementer

fun main() {
    val infoProvider: MultipleInterfaceImplementer = FancyInfoProvider()
    println("Provider Info: ${infoProvider.providerInfo}")

    infoProvider.printInfo(Human4())

    /*infoProvider.sessionIdPrefix*/
}