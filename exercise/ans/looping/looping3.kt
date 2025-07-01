fun main(){
    var tr = 5
    var total = 0

    for(index in 1..tr){
        print("Masukkan nilai: ")
        var scr = readln().toIntOrNull()?:0
        total += scr
    }

    var mean = total / 5
    println("Total: $total")
    println("Rata-rata: $mean")
}