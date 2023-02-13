package main.kotlin.weekend.classes

/**
 * Just because there are arguments to this constructor, there aren't any properties in the class unless defined
 *
 */
class Human(_firstName: String, _lastName: String) {
    val fName: String
    val lName: String

    /*
Init block can be used to initialize the values of the properties
It is run every time a new instance of the class is created
Init blocks are run in the order they are defined in the class body
*/
    init {
        //Same as assigning it at the declaration location
        fName = _firstName
        lName = _lastName
    }
}
