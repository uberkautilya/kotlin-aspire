package main.kotlin.thursday.files

import main.kotlin.thursday.Student
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.io.BufferedReader
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
//    writeFile()
    readCsvFile()
}

fun readCsvFile() {
    println("\nReadWriteFiles.kt:: readCsvFile()")
    val br = File("C:\\Users\\Mithun\\IdeaProjects\\Kotlin-Aspire\\Kotlin101\\src\\main\\resources\\Students.csv").bufferedReader()
    val csvParser = CSVParser(br, CSVFormat.DEFAULT)
    for (csvRecord in csvParser) {
        println(csvRecord)
    }
}

/**
 * This will overwrite the file each time
 */
private fun writeFile() {
    val content = "This is some content that needs to be written to the file"

    //The file needs to be available in the path specified beforehand
    var file = File("C:\\Users\\Mithun\\IdeaProjects\\Kotlin-Aspire\\Kotlin101\\src\\main\\resources\\File101.txt")

    withPrintWriter(file, content)

    withBufferedWriter(file, content)

    withExtendedWriteTextKotlinFunction(file, content)

    withWriteExtendedKotlinFunction(file, content)

}

/**
 * To write as a byte array
 */
fun withWriteExtendedKotlinFunction(file: File, content: String) {
    val path: Path = file.toPath()
    Files.write(path, "\n$content\nSome more text".toByteArray(), StandardOpenOption.APPEND)
    println("Write as a byte array completed")
}

private fun withExtendedWriteTextKotlinFunction(file: File, content: String) {
    file.writeText(content)
    println("Write complete with Kotlin extension function")
}

private fun withBufferedWriter(file: File, content: String) {
    file.bufferedWriter().use { out -> out.write(content) }
    println("Write complete")
}

private fun withPrintWriter(file: File, content: String) {
    file.printWriter().use { out -> out.println(content) }
    print("Write complete")
}

