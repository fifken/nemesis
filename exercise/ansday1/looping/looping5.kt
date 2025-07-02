fun main(){
    print("Input: ")
    val text = readLine()
    print("Jumlah: ")
    val n = readln().toIntOrNull()?:0

    for(i in 1..n){
        println(text)
    }

}