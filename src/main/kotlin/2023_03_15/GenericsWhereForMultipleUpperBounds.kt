package `2023_03_15`

fun main() {

    //Cannot have Group<CounterStrikeAthlete>() because 'CounterStrikeAthlete' does not implement Listener interface
    val footballGroup = Group<FootballAthlete>(
        "Football", mutableListOf(
            Athlete("FootballAthlete")
        )
    )

    // Cannot: addAthlete(CounterStrikeAthlete("CSPlayer")) as CounterStrikePlayer does not implement the Listener interface

    //Allowed as FootballAthlete inherits from the Athlete class as well as implements the Listener interface
    addAthlete(FootballAthlete("FootballPlayer"))

}

/**
 * Generic function: Add <T> after the fun keyword
 * Multiple upper bounds for the generic type is specified with a 'where' keyword
 */
fun <T> addAthlete(athlete: T) where T : Athlete, T : Listener {

}


/**
 * When the generic type is to have implemented an interface in addition to extending a class, use 'where' keyword
 * For one implement, needn't use where - Group<T: Listener> would be sufficient. Both are valid though?
 */
class Group<T>(val name: String, private val athletes: MutableList<in T>) where T : Athlete, T : Listener {

    fun addAthlete(athlete: T) {
        if (athletes.contains(athlete)) {
            println("${athlete.name} already in the team")
        } else {
            athletes.add(athlete)
            println("${athlete.name} added to the team")
        }
    }

}

interface Listener {
    fun listen()
}

open class Athlete(val name: String)
class FootballAthlete(name: String) : Athlete(name), Listener {
    override fun listen() {
        TODO("Not yet implemented")
    }
}

open class GamesAthlete(name: String) : Athlete(name)
class CounterStrikeAthlete(name: String) : GamesAthlete(name)








