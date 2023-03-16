package `2023_03_16`

fun main() {

    /*
    * In case of single parameter in a lambda definition
    * 'it' is the implicit name for a single parameter
    * */
    upperCase("world") { it.uppercase() }

    upperCase("hello") { s: String -> s.uppercase() }
}

fun upperCase(str: String, myFunction: (String) -> String) {
    val upperCasedWord = myFunction(str)
    println("upperCasedWord: $upperCasedWord")
}