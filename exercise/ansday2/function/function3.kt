fun main(){
    print("Input Celcius: ")
    var x = readln().toDoubleOrNull()?:0.0
    var far = konversiSuhu(x)
    println("Suhu dalam Fahrenheit: $far")
}

fun konversiSuhu(celcius: Double): Double{
    return (celcius * 9/5) + 32
}