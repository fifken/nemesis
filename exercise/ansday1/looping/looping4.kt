fun main(){

    while(true){
        print("1. Lihat menu\n2. Beli\n3. Keluar\n")
        print("Pilih: \n")
        val inp = readln()

        when(inp){
            "1" -> println("Menu: Nasi Goreng, Mie Ayam")
            "2" -> println("Menu Berhasil diorder")
            "3" -> {println("Terima kasih!"); break}
            else -> println("Pilih Ulang")
        }
    }
}