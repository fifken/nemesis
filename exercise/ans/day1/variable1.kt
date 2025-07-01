fun main(){
    print("Masukkan nama: ")
    val nama = readln()
    print("Masukkan usia: ")
    val age = readln().toIntOrNull()?:0
    print("Masukkan kota: ")
    val kota = readln()

    println("Nama: $nama\nUmur: $age tahun\nKota: $kota")
}