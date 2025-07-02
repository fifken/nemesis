fun main() {
    print("Masukkan nama: ")
    val input = readln().ifBlank { "Pengunjung" }
    halo(input)
}

fun halo(nama: String = "Pengunjung") = println("Halo, [$nama]!")