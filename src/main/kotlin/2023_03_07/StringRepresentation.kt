package main.kotlin.`2023_03_07`

fun main() {
    val strList = listOf("one", "two", "three", "four")
    //Calls the toString() function on the list instance
    println("\nstrList: $strList")

    //joins the values with a comma separation
    println("\nstrList.joinToString(): ${strList.joinToString()}")

    //This would add the stringBuffer value before the string produced on joinTo function
    val strBuffer = StringBuffer("The list of numbers: ")
    println(strList.joinTo(strBuffer))

    println(
        "\nstrList.joinToString(separator = \" | \", prefix = \"  start: \", postfix = \" :end\"): ${
            strList.joinToString(
                separator = " | ",
                prefix = "  start: ",
                postfix = " :end"
            )
        }"
    )

    val numberList = (1 .. 100).toList()
    //To limit the number of items shown in the string
    println(numberList.joinToString(limit = 5, truncated = "<..>"))

    println(strList.joinToString{
        "Element: ${it.uppercase()}"
    })
}


