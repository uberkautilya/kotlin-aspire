package `2023_03_06`

/**
 * Delegation: Giving power from one class to another
 * You can inherit from only one class
 * With delegation, multiple behavior can be brought in from separate classes
 * A by FirstDelegate directs to inherit A as per implementation provided by FirstDelegate
 */

class App: A by FirstDelegate(), B by SecondDelegate(){
    //Overriding these functions from the interfaces is optional
    override fun print1() {
        TODO("Not yet implemented")
    }
    override fun print2() {
        TODO("Not yet implemented")
    }
}

open class FirstDelegate: A {
    override fun print1() {

    }
}
open class SecondDelegate: B{
    override fun print2() {

    }
}


interface A{
    fun print1()
}
interface B{
    fun print2()
}









