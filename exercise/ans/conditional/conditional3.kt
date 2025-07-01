fun main(){
    print("Username: ")
    val x = readln()
    print("Password: ")
    val y = readln()
    val user = "admin"
    val pass = "1234"

    if(x == user && y == pass) println("Login berhasil!") else println("Username/password salah.")
    
}