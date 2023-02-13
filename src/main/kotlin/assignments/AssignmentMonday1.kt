package main.kotlin.assignments

fun main() {
    val incrementByOne = incrementByOne(23)
    fun nested():String {
        return "String from nested function"
    }
    println("Nested Output: ${nested()}")

    //----------------------------
    println("Foo.a(): ${StaticWithCompanionObject.a()}")
    StaticWithCompanionObject.InnerClass().innerFun()
    StaticWithCompanionObject.InnerClass.innerStaticFun()
    //-------Inheriting static class method overridden---
    StaticWithCompanionObject.InheritingClass().innerFun()
}

/* val/var on a function's parameters is not allowed */
fun incrementByOne(num: Int): Int {
    /*
    val cannot be reassigned
    num = num + 1 : Not allowed
    */
    val result = num + 1
    println("result: $result")
    return result
}

//Static with companion object
class StaticWithCompanionObject {
    //Represent a static method on Foo
    companion object {
        fun a() : Int = 1
    }
    //Inner classes are static by default, while its methods are not. To make it non-static, need to add 'inner' keyword
    open class InnerClass {
        val a = 5
        companion object {
            fun innerStaticFun() {
                println("Static method in an inner class")
            }
        }
        open fun innerFun() {
            println("Inner class non-static method")
        }
    }
    class InheritingClass : InnerClass() {
        override fun innerFun() {
            println("Inner class non-static method overridden in an Inheriting class")
        }
    }
}