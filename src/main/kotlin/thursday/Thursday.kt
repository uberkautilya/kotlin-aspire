package main.kotlin.thursday

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import main.kotlin.thursday.exceptions.*

/**
 * 1. Can we override custom exception classes in Kotlin
 * 2. ObjectMapper in Kotlin
 * 3. Hashcode and equals in Map
 * 4. What is copy method? Can we use it in dto to entity conversion
 * 5. Try with resource - Kotlin
 * 6. Synchronization in Kotlin
 * 7. TreeSet - Kotlin
 * 8. Spring AOP with Kotlin
 * 9. Controller Layer, RequestBody, RequestParam - Kotlin
 */
val objMapper = jacksonObjectMapper()
fun main() {
    objectMapperUserDefined()
    objectMapperMap()
    objectMapperList()
    extendingCustomException()
}

/**
 * Direct subclasses of sealed classes and interfaces must be declared in the same package.
 * class CustomExceptionExtension(message: String): CustomException(message) - not allowed here
 */


fun extendingCustomException() {
    println("\nThursday.kt:: extendingCustomException()")
    var intVal = 4;
    try {
        val throwable: CustomException = when (intVal) {
            1 -> CustomExceptionChildOne("One")
            2 -> CustomExceptionChildTwo("Two")
            3 -> CustomExceptionChildThree("Three")
            else -> {
                CustomExceptionChildDefault("Root Custom Exception")
            }
        }
        println("exception: $throwable")
        throw throwable
    } catch (e: CustomExceptionChildOne) {
        println("e.message: ${e.message}")
    } catch (e: CustomExceptionChildTwo) {
        println("e.message: ${e.message}")
    } catch (e: CustomExceptionChildThree) {
        println("e.message: ${e.message}")
    } catch (e: CustomException) {
        println("Catch block of Root Exception. e.message: ${e.message}")
    }
}

fun objectMapperList() {
    println("\nThursday.kt:: objectMapperList()")
    val listOfString = listOf<String>("One", "Two", "Three")
    val stringList = objMapper.writeValueAsString(listOfString)
    println("stringList: $stringList")

    val backToList: List<String> = objMapper.readValue(stringList)
    println("backToList: $backToList")
    println("listOfString == backToList: ${listOfString == backToList}")
}

fun objectMapperMap() {
    println("\nThursday.kt:: objectMapperMap()")
    val mapIntToString = hashMapOf<Int, String>(
        1 to "One",
        2 to "Two",
        3 to "Three"
    )
    val mapIntToStringText = objMapper.writeValueAsString(mapIntToString)
    println("mapIntToStringText: $mapIntToStringText")
    // Deserialization
    val backToMap = objMapper.readValue<Map<Int, String>>(mapIntToStringText)
    println("backToMap: $backToMap")
    println("mapIntToString == backToMap: ${mapIntToString == backToMap}")
}

fun objectMapperUserDefined() {
    println("\nThursday.kt:: objectMapperUserDefined()")
    val movie = Movie("John Wick 4", "Method Studios", 9.23f)
    val serializedMovie = objMapper.writeValueAsString(movie)
    println("serializedMovie: $serializedMovie")

    // Deserialization
    val deserializedMovie: Movie = objMapper.readValue(serializedMovie)
    // Alternative: val deserializedMovie = objMapper.readValue<Movie>(serializedMovie)
    println("deserializedMovie: $deserializedMovie")
    println("movie == deserializedMovie: ${movie == deserializedMovie}")
}
