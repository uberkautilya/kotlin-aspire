package main.kotlin.thursday.demosynchronized

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

var sharedCounter = 0
@Synchronized
fun updateCounter() {
    sharedCounter++
}

fun main() = runBlocking {
    val scope = CoroutineScope(
        newFixedThreadPoolContext(4, "synchronizationPool")
    ) // We want our code to run on 4 threads

    scope.launch {
        //Create 1000 coroutines (light-weight threads).
        val coroutines = 1.rangeTo(1000).map {
            launch {
                // and in each of them, increment the sharedCounter 1000 times.
                for (i in 1..1000) {
                    // Call the newly created function that is now synchronized
                    updateCounter()
                }
            }
        }

        coroutines.forEach { coroutine ->
            // wait for all coroutines to finish their jobs.
            coroutine.join()
        }
    }.join()

    println("The number of shared counter is $sharedCounter")
}