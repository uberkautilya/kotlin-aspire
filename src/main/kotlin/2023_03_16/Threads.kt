package `2023_03_16`

import kotlin.concurrent.thread

/**
 * Threads are units of execution within a process
 * Any application has to have at least the main thread: The Application thread
 */

fun main() {
    println("Main Thread: Start of execution")
    //The code block will be executed on a secondary thread created, which will not block the execution of the main thread
    val thread = thread {
        Thread.sleep(4000)
        println("Secondary Thread: Wait over")
    }
    println("Main Thread: End of execution")
    thread.join() //this is optional
    println("Program terminated")
}