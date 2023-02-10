package main.kotlin.lambdas

import main.kotlin.userdefined.Animal
import main.kotlin.userdefined.Lion

fun main() {
    var sample: (Int, Int) -> String = { a: Int, b: Int -> "Sum of $a and $b is ${a + b}" }
    println(sample(12, 14))

    var animalLambda: (Animal, Animal) -> Boolean? = { animal1, animal2 -> animal1.name?.equals(animal2.name) }
    val lion: Lion = Lion()
    lion.name = "Animal"
    println("animalLambda result: ${animalLambda(Animal("Animal"), lion)}")


    fun higherOrder(a: Int, b: Int, c: Int, aFun: (Int, Int, Int) -> Int) {
        //Print the result yielded by running the aFun Lambda
        println(aFun(a, b, c))
    }
    higherOrder(
        a = 11,
        b = 22,
        c = 3,
        aFun = { num1: Int, num2: Int, num3: Int -> num1 + num2 + num3 }
    )

    //The below works with listOf as well
    var interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    //it is the default lambda receiver object
    interestingThings.forEach { println(it)}
    interestingThings.forEachIndexed{index, it -> println("Thing at index $index is $it")}

    val map = mapOf<Int, String>(1 to "14L", 2 to "18L")
    map.forEach{ (k, v) -> println("$k : $v")}
}

private fun methodsOnArray(interestingThings: Array<String>) {
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
}