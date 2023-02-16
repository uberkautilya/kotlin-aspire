package main.kotlin.thursday.exceptions

/**
 * Note: All the subclasses of the sealed class must be defined within the same Kotlin file.
 * It not necessary to define them within the sealed class,
 * they can be defined in any scope where the sealed class is visible.
 */
sealed class CustomException(override val message: String?) : Throwable(message = message) {
    constructor() : this(null)
}

/**
 * In some sense, sealed classes are similar to enum classes:
 * the set of values for an enum type is also restricted,
 * but each enum constant exists only as a single instance,
 * whereas a subclass of a sealed class can have multiple instances,
 * each with its own state.
 */
class CustomExceptionChildOne(message: String) : CustomException(message)
class CustomExceptionChildTwo(message: String) : CustomException(message)
class CustomExceptionChildThree(message: String) : CustomException(message)
class CustomExceptionChildDefault(message: String) : CustomException(message)

