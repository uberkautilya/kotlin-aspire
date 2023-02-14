package main.kotlin.tuesday

data class Product(val id: Long, var name: String, private var price: Double) {
    fun setPrice(_price: Double) {
        price = _price
    }
    fun getPrice(): Double {
        return price
    }
    fun discountPrice(discount: Double): Double {
        return price * (1- discount)
    }
}