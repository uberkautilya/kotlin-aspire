package `2023_03_03`

fun main() {
    val lenovo = Laptop("Ideapad", "Lenovo", 62999.00)

    //UninitializedPropertyAccessException as 'lateinit' property not yet initialized
    println("lenovo.diskSpace: ${lenovo.diskSpace}")

    lenovo.diskSpace = "512 GB"
}


class Laptop(var name: String, var brand: String, var price: Double){

    //Without the value in constructor or a default value in the body
    //Tells the compiler it will be initialized later
    lateinit var diskSpace: String

    /*
    NOT allowed on primitive data types (String is a special data type)
    lateinit var id: Int
    */
}