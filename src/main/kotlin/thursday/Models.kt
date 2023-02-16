package main.kotlin.thursday

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @JsonInclude(JsonInclude.Include.NON_EMPTY ensures that the JSON produced has only the non-empty fields
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
data class Movie(
    val name: String,
    // When serializing the json field will be producationStudio
    @JsonProperty("productionStudio") val studio: String,
    val rating: Float? = 1.0f,
    val fanList: List<String>? = emptyList()
)

/**
 * To use a hashMap, need hashCode and equals methods.
 * The implementation may be overridden as provided here
 */
class Game(nameParam: String, genreParam: String, priceParam: Double) {
    val name: String = nameParam
    val genre: String = genreParam
    val price: Double = priceParam

    override fun hashCode(): Int {
        return super.hashCode()
    }
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}

data class Student (
    val studentId: Int,
    val firstName: String,
    val lastName: String,
    val score: Int
)