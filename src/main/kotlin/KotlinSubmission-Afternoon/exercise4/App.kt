package id.infinitelearning.KotlinSubmission.exercise4

fun main(args: Array<String>) {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val str = "abc"
    val a: Int = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        -1
    }
    println(a)

}

