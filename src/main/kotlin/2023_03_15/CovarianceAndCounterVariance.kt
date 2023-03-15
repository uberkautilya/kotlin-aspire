package `2023_03_15`

/*
Covariance and Countervariance is like th lower limit and the upper limit of generics in Java
 */

/**
 * CounterVariant: Allow for 'super' types of type 'T' to be the players list
 * All super types can be made the type of list, of the 'players' property
 */
class CounterVarianceTeam<T: Player>(val name: String, private val players: MutableList<in T>){
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("${player.name} already in the team")
        } else {
            players.add(player)
            println("Player added to the team")
        }
    }
}

/**
 * Covariance: Permit subclasses of the type to be the players list
 * out keyword added in players type. This permits support to the subclasses of type T
 * More flexibility to the types held in the generic type
 */
class CovarianceTeam<T : Player>(val name: String, private val players: MutableList<out T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("${player.name} already in the team")
        } else {
            /*
            This will no longer be permitted.
            'players' is a list of a subclass and 'player', which could be of any other subclass type cannot be added to it
            players.add(player)
             */
            println("${player.name} cannot be added to the team")
        }
    }
}

/**
 * Internal access modifier allows this to be used only within the same module
 * For single module projects, it works same as public access modifier?
 */
internal class Team<T : Player>(val name: String, private val players: MutableList<T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("${player.name} already in the team")
        } else {
            players.add(player)
            println("${player.name} added to the team")
        }
    }
}


open class Player(val name: String)
class FootballPlayer(name: String) : Player(name)

open class GamesPlayer(name: String) : Player(name)
class CounterStrikePlayer(name: String) : GamesPlayer(name)


fun main() {

    val footballTeam = Team<Player>(
        //This is allowed
        "Football", mutableListOf(
            FootballPlayer("FootballPlayer101")
        )
    )

    /*
    Not allowed: Team can not specifically contain FootballPlayer alone unless Covariant with 'out' keyword
    val footballTeam = Team<Player>(
        "Football", mutableListOf<FootballPlayer>()
    )
    */

    val footballCovarianceTeam = CovarianceTeam<Player>(
        //Now it is allowed
        "Football", mutableListOf<FootballPlayer>(
            FootballPlayer("FootballPlayer102")
        )
    )

    //CounterStrikePlayer inherits from the GamesPlayer
    val counterStrikeTeam3 = CounterVarianceTeam<CounterStrikePlayer>(
        "Games Team", mutableListOf<CounterStrikePlayer>()
    )
    //Allowed as GamesPlayer is a super type of CounterStrikePlayer
    val counterStrikeTeam1 = CounterVarianceTeam<CounterStrikePlayer>(
        "Games Team", mutableListOf<GamesPlayer>()
    )
    //Allowed as Player is a super type of CounterStrikePlayer
    val counterStrikeTeam2 = CounterVarianceTeam<CounterStrikePlayer>(
        "Games Team", mutableListOf<Player>()
    )
}