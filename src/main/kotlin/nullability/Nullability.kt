package nullability

fun main() {
//    notNulllAsserted()
//    safeCallOperator()
    elvisOperator(null)
}

/**
 * Parameters of functions are final ('val') within the functions
 */
private fun elvisOperator(text: String?) {
    //var text1 = text needs to be done if value is to be reassigned

    //textAnother will get text's value if not null, else 'Value when null
    var textAnother = text ?: "Value when null, with elvis operator"
    println("textAnother: $textAnother")
}

private fun safeCallOperator() {
    var num: Int? = 12
    num = null
    //Will evaluate to toDouble() value if num is not null, else null
    println("num?.toDouble(): ${num?.toDouble()}")
}

private fun notNulllAsserted() {
    var text: String? = null
    println("text!!.length: ${text!!.length}")
}