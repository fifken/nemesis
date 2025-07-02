fun main(){
    print("Tahun lahir: ")
    val born = readln().toIntOrNull()?:0
    println("Tahun sekarang: 2025")
    val usia = 2025 - born
    println("Usia Anda: $usia tahun")
}