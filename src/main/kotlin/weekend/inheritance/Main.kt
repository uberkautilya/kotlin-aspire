package main.kotlin.weekend.inheritance

import main.kotlin.weekend.classes.Human4
import main.kotlin.weekend.interfaces.MultipleInterfaceImplementer

fun main() {
    val infoProvider: MultipleInterfaceImplementer = FancyInfoProvider()
    println("Provider Info: ${infoProvider.providerInfo}")

    infoProvider.printInfo(Human4())

    /*infoProvider.sessionIdPrefix*/
}