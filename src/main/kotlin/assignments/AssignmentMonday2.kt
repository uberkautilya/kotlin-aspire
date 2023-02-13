package main.kotlin.assignments

fun main() {
    fun nested():String {
        return "String from nested function"
    }
    println("Nested Output: ${PrivateGetterSetter().getName()}")


    println("packageLevelStaticFunction(): ${packageLevelStaticFunction()}")
    println("CompanionObjectStatic.staticMethodViaCompanionObject(): ${CompanionObjectStatic.staticMethodViaCompanionObject()}")
}

//Package level functions are static, as no object need to be created to invoke them
fun packageLevelStaticFunction(): String {
    fun innerMethodOfPackageLevelFunction(): String {
        return "Inner method of package level function"
    }
    return innerMethodOfPackageLevelFunction()
}

class PrivateGetterSetter {
    //Unless it is private, same JVM signature error is thrown by Kotlin
    private val name: String = "Default"
    val id: Long = 101L

    fun getName(): String {
        return "$name !"
    }
}

class CompanionObjectStatic {
    companion object {
        fun staticMethodViaCompanionObject(): String {
            fun innerMethod(): String {
                return "innerMethod of a companion object method"
            }
            return innerMethod()
        }
    }

    fun enclosingFun() {
        nonStaticMethod()
        staticMethodViaCompanionObject()
    }
    fun nonStaticMethod() {

    }
}