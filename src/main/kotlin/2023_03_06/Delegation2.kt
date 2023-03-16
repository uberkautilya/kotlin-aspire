package `2023_03_06`

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val user = UserForDelegate()
    with(user) {
        firstName = "Raul"
        lastName = "Vinci"
    }
    with(user) {
        println("firstName: $firstName")
        println("lastName: $lastName")
    }
}

class UserForDelegate {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}

class FormatDelegate : ReadWriteProperty<Any?, String> {

    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.lowercase()
    }
}