package `2023_03_16`

/**
 * Can be called on almost any object in the code - execute the code on it
 * Make code more concise and readable
 * Differ on how the context object is referred(this or it) and the result of the expression(lambda result or the context object)
 *
 * With::  context object: this, returns: Lambda result
 * Apply:: context object: this, returns: The context object itself
 * Also::  context object: it, returns: The context object itself
 * Let::   context object: it, returns: lambda result
 *         Used generally to avoid null pointer exception
 * Run::   context object: this, returns: lambda result
 *         Combination of with and let function
 */
fun main() {
    val user = User()

    //<editor-fold desc="with scope function">
    //WITH: The return object is the result of the lambda, not necessarily the context object
    val result = with(user) {
        this.firstName = "Pinaka"
        this.lastName = "Brahmos"
        this.age = 4
        "Success"//returned
    }
    println("user: $user, result: $result")
    //</editor-fold>

    //<editor-fold desc="apply scope function">
    //APPLY: Called on an object. Returns the object itself, this is the context object name
    val user2 = User().apply {
        this.firstName = "Arjun"
        this.age = 9
        //returns the context object itself
    }
    println("user2: $user2")
    //</editor-fold>

    //<editor-fold desc="also scope function">
    /* ALSO: Called on an object. Returns the context object itself */
    val tech = Tech("Tank", "Arjun", 9).also {
        it.firstName = "Main Battle Tank"
        println("it: $it")
    }
    //</editor-fold>

    //<editor-fold desc="let scope function">
    var text: String? = null
    /*
    LET: Called on an object. Returns the lambda result.
    Execute the block of code inside let block, only if the value is not null
    */
    val letResult = text?.let {
        println("it: $it")
        "Success"
    }
    println("Let Result: $letResult")
    //</editor-fold>

    //<editor-fold desc="run scope function">
    val tech1: Tech? = Tech(firstName = "First", lastName = "Last", age = 31)
    //Nullable needs safe calls using with -> with(user3) { println(this?.firstName)}
    val runResult = tech1?.run {
        println(firstName)
        31
    }
    println("runResult: $runResult")
    //</editor-fold>

}


private class User() {
    var firstName: String = ""
    var lastName = ""
    var age = -1

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age)"
    }
}

private data class Tech(var firstName: String, var lastName: String, var age: Int)