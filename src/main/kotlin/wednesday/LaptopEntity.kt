package main.kotlin.wednesday

import javax.persistence.*

@Entity
class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    open var id: Int? = null

    var brand: String? = null

    var price: Double? = null

    constructor() {}
    constructor(id: Int?, brand: String?, price: Double?){
        this.id = id
        this.brand = brand
        this.price = price
    }

    override fun toString(): String {
        return "LaptopEntity:: id: $id, brand: $brand, price: $price"
    }
}