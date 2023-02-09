package main.kotlin.userdefined

fun main() {
    var animal: Animal = Animal ("Animal")
    animal = Lion()
    printAnimal(animal)
}

fun printAnimal(animal: Animal) {
    println("Animal: $animal")
}
