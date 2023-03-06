package `2023_03_04`

fun main() {
    val view = View(720)
    view.draw()

    println("\nCreating a button")
    val button = Button(1080, "Sign Up", "Vertical")
    button.draw()

    println("\nCreating a round button")
    val rButton = RoundButton(1080, "Sign Up", "Horizontal", 24)
    rButton.draw()
}

class RoundButton(pixels: Int, text: String, orientation: String, val corners: Int) :
    Button(pixels, text, orientation) {
    override fun draw() {
        println("Drawing RoundButton")
        super.draw()
    }
}

open class Button(pixels: Int, val text: String, val orientation: String) : View(pixels) {
    override fun draw() {
        println("Drawing button")
        super.draw()
    }
}

open class View(val pixels: Int) {
    open fun draw() {
        println("Drawing view")
    }
}





