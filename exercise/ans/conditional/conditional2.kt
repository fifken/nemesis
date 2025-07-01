fun main(){
    print("Umur: ")
    val x = readln().toIntOrNull()?:0
    
    if(x>59) println("Kategori: Lansia")
    else if(x>19) println("Kategori: Dewasa")
    else if(x>12) println("Kategori: Remaja")
    else println("Kategori: Anak-anak")
}