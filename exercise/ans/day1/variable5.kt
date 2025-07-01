fun main(){
    val inp = readln().toIntOrNull()?:0
    val hasil = inp.toDouble()/25
    println("Nilai $inp → skala 4.0 = ${"%.2f".format(hasil)}")
}