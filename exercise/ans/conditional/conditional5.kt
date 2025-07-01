fun main(){
    print("Umur: ")
    val x = readln().toIntOrNull()?:0
    print("Member VIP: ")
    val y = readln()?.toBoolean()?:false

    if(x>21 && y == true) println("Diperbolehkan Masuk") else println("Tidak Boleh Masuk")
}