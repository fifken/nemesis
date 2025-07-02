fun main(){
    print("Umur: ")
    val x = readln().toIntOrNull()?:0
    print("Member: ")
    val y = readln()?.toBoolean()?:false

    if(x>21 && y == true) println("Boleh Masuk") else println("Tidak Boleh Masuk")
}