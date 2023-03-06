package `2023_03_06`

/**
 * Object expressions are used to create anonymous classes from interfaces
 */
fun main() {
    //Interface parameter accepts a concrete class of it
    val signUpButton = Button("Sign up", 12324, ClickListener())

    //Object expression replaces the above - each button can have a unique implementation of the click listener
    //Object creation and assignment happens simultaneously
    val loginButton = Button("Log in", 121, object : OnClickListener {
        override fun onClick() {

        }
    })
}

class ClickListener: OnClickListener {
    override fun onClick() {
        TODO("Not yet implemented")
    }
}

class Button(val text: String, val id: Int, onClickListener: OnClickListener)

interface OnClickListener {
    fun onClick()
}
