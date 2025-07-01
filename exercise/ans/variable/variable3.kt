fun main(){
    print("Masukkan Nama: ")
    val name = readln()
    print("Status Aktif: [true/space]")
    val status = readln()?.toBoolean()?:false

    println("Nama: $name\nStatus Aktif: $status")
}