fun main() {
    val n = 5
    for (i in 1..n) {
        for (spasi in 1..(n - i)) {
            print("x")
        }
        for (bintang in 1..i) {
            print("*")
        }
        println()
    }
}