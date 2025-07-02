fun main(){
    for(index in 1..2){
        print("Input Nama: ")
        var x = readln()
        sapa(x)
    }
}

fun sapa(nama: String){
    println("Halo, [$nama]!")
}