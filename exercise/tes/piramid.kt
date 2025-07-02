fun main() {
    val n = 5
    for (i in 1..n) {
        for (spasi in 1..(n - i)) {
            print(" ")
        }
        for (bintang in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}
