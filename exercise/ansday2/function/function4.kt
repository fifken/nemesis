fun main(){
    print("Masukkan angka pertama: ")
    val x = readln().toDoubleOrNull()?:0.0
    print("Masukkan angka kedua: ")
    val z = readln().toDoubleOrNull()?:0.0
    print("Masukkan operator [/,*,+,-]: ")
    val y = readln()

    when(y){
        "/" -> {
            if(z == 0.0){
                println("Tidak bisa dibagi 0")
                return
            }
            print(bagi(x,z))
        }
        "*" -> print(kali(x,z))
        "+" -> print(tambah(x,z))
        "-" -> print(kurang(x,z))
        else -> {
            println("Input Symbol Again")
            return
        }
    }

}

fun tambah(angka: Double, angka2: Double): Double{
    return angka + angka2
}

fun kurang(angka: Double, angka2: Double) = angka - angka2

fun kali(angka: Double, angka2: Double): Double{
    return angka * angka2
}

fun bagi(angka: Double, angka2: Double): Double{
    return angka / angka2
}