fun main(){
    println("1. Nasi Goreng\n2. Mie Ayam\n3. Ayam Geprek")
    print("Pilihan: ")
    val x = readln()

    when(x){
        "1" -> println("Kamu memilih: Nasi Goreng")
        "2" -> println("Kamu memilih: Mie Ayam")
        "3" -> println("Kamu memilih: Ayam Geprek")
        else -> println("Pilih lagi")
    }
}