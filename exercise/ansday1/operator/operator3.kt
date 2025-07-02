fun main(){
    print("Total Belanja: ")
    val x = readln().toDoubleOrNull()?:0.0
    val con = 100000.0

    if(x > con){
        val disc = x * 0.1
        val total = x - disc
        println("Diskon: $disc")
        println("Total Bayar: $total")
    }
    else println("Total Bayar: $x")
}