package main.kotlin.day4.classes

/**
 * Here since 'val' keyword is used before variable name, they are also members of the class,
 * not just parameters of the constructor
 */
class Human2(val fName: String, val lName: String) {
    //Secondary constructors, if invoked are run after init blocks
    init {
        println("Init block")
    }
    //Secondary constructor
    constructor() : this("Peter", "Parker"){
        println("Secondary Constructor")
    }

}