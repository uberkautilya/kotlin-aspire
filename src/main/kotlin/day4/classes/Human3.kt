package main.kotlin.day4.classes

/**
 * Secondary constructors can be avoided at times, if we use default parameters in the primary constructor
 * 'val' keyword ensures these parameters are also properties of the class
 */
class Human3(val firstName: String = "Prime", val lastName: String = "Optimus") {
    //val properties exposes getters which is how they can be accessed directly with human.lastName

    //Since this property is a var, its getters and setters are automatically generated by the compiler
    var nickName: String? = null

    //To customize getters and setters
    var secondaryName: String? = null
        set(value) {
            //field represents the backing field - the variable
            field = value
            println("Setter for secondaryName")
        }
        get() {
            println("Ther returned value is $field")
            return field
        }
}