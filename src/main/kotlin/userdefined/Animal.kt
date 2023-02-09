package main.kotlin.userdefined

open class Animal {
    open var name: String = "Generic"

    constructor(name: String) {
        this.name = name
    }

    override fun toString(): String {
        return "Animal(name='$name')"
    }
}