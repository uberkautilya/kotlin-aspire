package main.kotlin.`2022_03_08`

/**
 * Generics allows us to pass some context to the compiler which allows it to provide information
 * Generics is a compile time feature. No runtime implication
 */
fun main() {
    val footballPlayer1 = FootballPlayer("Football player 101")
    val footballPlayer2 = FootballPlayer("Football player 102")

    val baseballPlayer1 = BaseballPlayer("Baseball player 101")
    val baseballPlayer2 = BaseballPlayer("Baseball player 102")

    val teamFootball = Team<FootballPlayer>(
        "Team Football", mutableListOf(
            footballPlayer1
        )
    )
    //The type is inferred by the Kotlin compiler from the list of player that is passed in the mutable list
    val teamBaseball = Team(
        "Team Baseball", mutableListOf(
            baseballPlayer1
        )
    )
    teamFootball.addPlayer(footballPlayer2)
    teamBaseball.addPlayer(baseballPlayer2)

    teamFootball.addPlayer(footballPlayer1)
    teamBaseball.addPlayer(baseballPlayer1)
}

class Team<T>(val name: String, val genericList: MutableList<T>) {
    fun addPlayer(genericObj: T) {
        if (genericList.contains(genericObj)) {
            //Generid type cast into type Player
            println("${(genericObj as Player).name} is already in: ${this.name}}")
        } else {
            genericList.add(genericObj)
            println("${(genericObj as Player).name} added to: ${this.name}")
        }
    }
}

open class Player(
    val name: String
)

class FootballPlayer(name: String) : Player(name)
class BaseballPlayer(name: String) : Player(name)









