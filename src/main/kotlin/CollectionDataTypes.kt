//Arrays, Lists and Maps


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[2])
    println(interestingThings.get(2))

    println("For Loop")
    for (interest in interestingThings) {
        println(interest)
    }

    /*
    it is the default element name, referenced in the loop
    Lambda syntax in Kotlin: If only a single function passed in to another function, we can omit the parenthesis -> Only need the curly braces
    ForEach loop doesn't preserve the order, the indexing information cannot be accessed
     */
    println("\nForEach Loop")
    interestingThings.forEach { println(it) }
    //interestingThings.forEach {interest -> println(interest)}
}