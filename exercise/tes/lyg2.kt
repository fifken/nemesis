fun main() {
    val n = 5
    // Bagian atas
    for (i in 1..n step 2) {
        val spasi = (n - i) / 2
        println(" ".repeat(spasi) + "*".repeat(i))
    }
    // Bagian bawah
    for (i in (n - 2) downTo 1 step 2) {
        val spasi = (n - i) / 2
        println(" ".repeat(spasi) + "*".repeat(i))
    }
}
