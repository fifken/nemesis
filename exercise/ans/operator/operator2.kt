fun main(){
    print("Nomor Kursi: ")
    val x = readln().toIntOrNull()?:0
    if(x % 2 == 0) println("Status: Genap") else println("Status: Ganjil")
}