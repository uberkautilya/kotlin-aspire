package main.kotlin.userdefined

fun main() {
    var animal: Animal = Animal("Animal")
    var lion = Lion()

    printAnimal(animal2=lion, animal1 = animal)
    //Polymorphism: Child object assigned to parent reference
    animal = lion
}

fun printAnimal(animal1: Animal, animal2: Animal) {
    println("Animal 1: $animal1")
    println("Animal 2: $animal2")
}
