fun main(){
    print("Input sisi: ")
    var x = readln().toIntOrNull()?:0
    var hasil = luasPersegi(x)
    println("Luas Persegi: $hasil")
}

fun luasPersegi(sisi: Int): Int{
    return sisi*sisi
}