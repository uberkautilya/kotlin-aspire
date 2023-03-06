package `2023_03_06`

fun main() {
    val success = Result.Success("Success")
    val progress = Result.Progress("Progress")
    val error = Result.Error.RecoverableError(ArithmeticException(), "Error")

    getData(progress)
}

fun getData(result: Result) {
    when (result) {
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError -> result.showMessage()
        //Above subtypes needn't handled separately
        is Result.Error -> result.showMessage()
        else -> println("Unhandled sealed class type")
    }
}

/**
 * Similar to enum classes, but can have properties
 * Sealed classes themselves cannot be instantiated
 * Only its subtypes can be instantiated
 */
sealed class Result(val message: String) {
    class Progress(message: String) : Result(message)
    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message){
        class RecoverableError(val exception: Exception, message: String): Error(message)
        class NonRecoverableError(val exception: Exception, message: String): Error(message)
    }

    fun showMessage() {
        println("Message: $message")
    }
}

