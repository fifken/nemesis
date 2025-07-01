fun main(){
    print("Nilai: ")
    val x = readln().toIntOrNull()?:0
    
    if(x>84) println("Predikat: A")
    else if(x>69) println("Predikat: B")
    else if(x>59) println("Predikat: C")
    else println("Predikat: D")
}