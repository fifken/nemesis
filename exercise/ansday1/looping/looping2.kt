fun main(){
    val rhs = "7"
    print("Masukkan Angkamu: ")
    var inp = readln()
    var flag = 1

    while(inp!=rhs){
        flag++
        print("Coba Lagi: ")
        inp = readln()
    }

    println("Tebakan Anda benar! Jumlah percobaan: $flag")
}