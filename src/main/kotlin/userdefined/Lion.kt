package main.kotlin.userdefined

class Lion: Animal("Animal") {
    override var name: String = "Lion"
    override fun toString(): String {
        return "Lion(name='$name')"
    }

}