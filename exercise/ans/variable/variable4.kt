fun main(){
    print("Masukkan Nama Barang: ")
    val item = readln()
    print("Jumlah: ")
    val jumlah = readln().toIntOrNull()?:0
    val jumlah2 = jumlah.toDouble()
    print("Harga satuan: ")
    val prc = readln().toDoubleOrNull() ?: 0.0
    val total: Double = jumlah2*prc
    println("Barang: $item \n Jumlah: $jumlah \n Harga satuan: ${"%.1f".format(prc)} \n Total: ${"%.1f".format(total)}")
}