fun main(){
    val score: MutableMap<String, MutableList<Int>> = mutableMapOf()

    while(true){
        print("\n=== MENU NILAI SISWA ===\n1. Tambah Nilai Siswa\n2. Lihat Semua Data\n3. Cari Nilai Tertinggi\n4. Siswa yang Lulus\n5. Keluar\n")
        print("Pilih Menu: ")
        val input = readln()

        when(input){
            "1" -> addStudent(score)
            "2" -> viewStudents(score)
            "3" -> topScore(score)
            "4" -> passStudent(score)
            "5" -> {println("Terima Kasih!"); return}
            else -> print("Pilihan tidak valid. Silakan pilih lagi.")
        }
        println("\nTekan Enter untuk melanjutkan...")
        readLine()
    }
}

fun addStudent(data: MutableMap<String, MutableList<Int>>) {
    print("Masukkan nama siswa: ")
    val nama = readLine()?.trim() ?: return

    print("Masukkan jumlah mapel: ")
    val jumlahMapel = readLine()?.toIntOrNull() ?: return

    val nilaiBaru = mutableListOf<Int>()
    for (i in 1..jumlahMapel) {
        print("Nilai mapel ke-$i [0-100]: ")
        val nilai = readLine()?.toIntOrNull()
        if (nilai != null) nilaiBaru.add(nilai)
    }

    if (data.containsKey(nama)) {
        data[nama]?.addAll(nilaiBaru)
    } else {
        data[nama] = nilaiBaru
    }

    println("Data berhasil ditambahkan!")
}

fun viewStudents(data: Map<String, List<Int>>) {
    if (data.isEmpty()) {
        println("Belum ada data siswa.")
        return
    }

    for ((nama, nilaiList) in data) {
        val rata = if (nilaiList.isNotEmpty()) nilaiList.average() else 0.0
        println("\nNama: $nama")
        println("Nilai: ${nilaiList.joinToString(", ")}")
        println("Rata-rata: ${"%.2f".format(rata)}")
    }
}

fun topScore(data: Map<String, List<Int>>) {
    print("Masukkan nama siswa: ")
    val nama = readLine()?.trim() ?: return

    val nilaiList = data[nama]
    if (nilaiList == null || nilaiList.isEmpty()) {
        println("Siswa tidak ditemukan atau belum memiliki nilai.")
        return
    }

    val nilaiTertinggi = nilaiList.maxOrNull()
    println("Nilai tertinggi $nama adalah $nilaiTertinggi")
}

fun passStudent(data: Map<String, List<Int>>) {
    val siswaLulus = data.filter { (_, nilaiList) ->
        nilaiList.isNotEmpty() && nilaiList.average() >= 75
    }

    if (siswaLulus.isEmpty()) {
        println("Belum ada siswa yang lulus.")
        return
    }

    println("Siswa yang lulus:")
    for ((nama, nilaiList) in siswaLulus) {
        println("- $nama (Rata-rata: ${"%.2f".format(nilaiList.average())})")
    }
}