package main.kotlin.tuesday

data class Product(val id: Long, var name: String, private var price: Double): Comparable<Product> {
    fun setPrice(_price: Double) {
        price = _price
    }
    fun getPrice(): Double {
        return price
    }
    fun discountPrice(discount: Double): Double {
        return price * (1- discount)
    }

    override fun compareTo(other: Product): Int {
        TODO("Not yet implemented")
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
    override fun toString(): String {
        return "Product: id:$id, name:$name, price:$price"
    }
}