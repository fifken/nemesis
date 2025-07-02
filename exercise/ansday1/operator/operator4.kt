fun main(){
    print("Angka A: ")
    val x = readln().toIntOrNull()?:0
    print("Angka B: ")
    val y = readln().toIntOrNull()?:0
    
    if(x>y){
        println("Angka lebih besar: $x")
    }
    
    else if(y>x){
        println("Angka lebih besar: $y")
    }
    
    else println("Equals")
}