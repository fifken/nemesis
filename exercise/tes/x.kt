fun main() {
    print("Masukkan ukuran (ganjil, minimal 3): ")
    val n = readln().toInt()

    if (n < 3 || n % 2 == 0) {
        println("Ukuran harus bilangan ganjil dan minimal 3.")
        return
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j || i + j == n - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}
