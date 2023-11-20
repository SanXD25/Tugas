package id.infinitelearning.KotlinSubmission.exercise4

import java.io.BufferedReader
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

fun main() {

/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini


    try {
        val fileName = "file_rahasia:v.txt" // muehehehe:)
        val reader = BufferedReader(FileReader(fileName))

        var line: String?

        while (reader.readLine().also { line = it } != null) {
            println(line)
        }

        reader.close()
    } catch (e: FileNotFoundException) {
        println("File tidak ditemukan: ${e.message}")
    } catch (e: IOException) {
        println("Terjadi kesalahan saat membaca file: ${e.message}")
    }
}

