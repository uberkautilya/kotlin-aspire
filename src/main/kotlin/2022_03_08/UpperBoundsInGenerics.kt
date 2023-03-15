package main.kotlin.`2022_03_08`

fun main() {

    val footballPlayer1 = FBPlayer("Football player 101")
    val footballPlayer2 = FBPlayer("Football player 102")

    val baseballPlayer1 = BBPlayer("Baseball player 101")
    val baseballPlayer2 = BBPlayer("Baseball player 102")

    val teamFootball = GTeam<FBPlayer>(
        "Team Football", mutableListOf(
            footballPlayer1
        )
    )
    //The type is inferred by the Kotlin compiler from the list of player that is passed in the mutable list
    val teamBaseball = GTeam(
        "Team Baseball", mutableListOf(
            baseballPlayer1
        )
    )
/*
  //Not allowed: Requires a mutable list of GPlayer or its subclasses
    val teamPC = GTeam(
        "PC Player", mutableListOf(
            PCPlayer("AOE")
        )
    )
*/
    teamFootball.addPlayer(footballPlayer2)
    teamBaseball.addPlayer(baseballPlayer2)

    teamFootball.addPlayer(footballPlayer1)
    teamBaseball.addPlayer(baseballPlayer1)
}

/**
 * Upper bound: T has to have properties inherited from the GPlayer class
 */
class GTeam<T : GPlayer>(val name: String, val genericList: MutableList<T>) {
    fun addPlayer(genericObj: T) {
        if (genericList.contains(genericObj)) {
            //Casting no longer required to access name property as T inherits from GPlayer
            println("${genericObj.name} is already in: ${this.name}}")
        } else {
            genericList.add(genericObj)
            println("${genericObj.name} added to: ${this.name}")
        }
    }
}

open class GPlayer(
    val name: String
)

class FBPlayer(name: String) : GPlayer(name)
class BBPlayer(name: String) : GPlayer(name)

/**
 * Cannot create a GTeam instance of type PCPlayer, as it does not inherit from GPlayer
 */
class PCPlayer(name: String)



