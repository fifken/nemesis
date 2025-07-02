fun main(){
    print("Masukkan angka pertama: ")
    val x = readln().toDoubleOrNull()?:0.0
    print("Masukkan operator [/,*,+,-]: ")
    val y = readln()
    print("Masukkan angka kedua: ")
    val z = readln().toDoubleOrNull()?:0.0
    
    var hasil = when(y){
        "/" -> {
            if(z == 0.0){
                println("Tidak bisa dibagi 0")
                return
            }
            x/z
        }
        "*" -> x*z
        "+" -> x+z
        "-" -> x-z
        else -> {
            println("Input Symbol Again")
            return
        }
    }

    println("Hasil: ${"%.1f".format(hasil)}")
}