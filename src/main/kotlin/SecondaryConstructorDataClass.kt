package main.kotlin

import javax.xml.crypto.Data

data class DataClassWithSecondaryConstructors(
    var name: String, var surname: String, var age: Number
) {
    var approvalStatus: Boolean = false
    constructor() : this("", "Doe", Int.MIN_VALUE) {
        if (name.startsWith("S")) {
            approvalStatus = true
        }
    }
    constructor(name: String) : this(name, "Deere", Int.MIN_VALUE)
    constructor(name: String, surname: String) : this(name, surname, Int.MIN_VALUE)

    fun encapsulatedFun() {
        println("Some text")
    }
}

fun main() {
    val obj: DataClassWithSecondaryConstructors = DataClassWithSecondaryConstructors("Super")
    println(obj.approvalStatus)
}