fun main() {
    val n = 5
    println("*".repeat(n))
    for (i in 1 until n) {
        println(" ".repeat(n / 2) + "*")
    }
}
