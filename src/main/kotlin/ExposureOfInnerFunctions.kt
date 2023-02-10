package main.kotlin

fun main() {
    /*The below is not allowed as the scope of the inner function is only within the encapsulating function
    math().arithmetic().add()*/

    println(mathV2("Arithmetic", "Add", 12, 2))
}

fun math(): Unit {
    fun arithmetic(): Unit {
        fun add(num1: Number, num2: Number): Number {
            return num1.toDouble() + num2.toDouble()
        }
    }
}

fun mathV2(type: String, method: String, num1: Number, num2: Number): Number {
    fun arithmetic(method: String, num1: Number, num2: Number): Number {
        fun add(num1: Number, num2: Number): Number {
            return num1.toDouble() + num2.toDouble()
        }

        if ("Add".equals(method, true)) {
            return add(num1, num2)
        }
        return -1
    }

    if ("Arithmetic".equals(type, true)) {
        return arithmetic(method, num1, num2)
    }
    return -1
}