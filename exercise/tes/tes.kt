fun main() {
    val dataNilai: MutableMap<String, MutableList<Int>> = mutableMapOf()

    while (true) {
        println("\n=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus (rata ≥ 75)")
        println("5. Keluar")
        print("Pilih menu: ")
        val pilih = readln()

        when (pilih) {
            "1" -> tambahSiswa(dataNilai)
            "2" -> tampilkanData(dataNilai)
            "3" -> cariNilaiTertinggi(dataNilai)
            "4" -> tampilkanLulus(dataNilai)
            "5" -> {
                println("Terima kasih!")
                break
            }
            else -> println("❌ Menu tidak dikenali")
        }
    }
}

// Fitur 1: Tambah Data Siswa
fun tambahSiswa(data: MutableMap<String, MutableList<Int>>) {
    print("Masukkan nama siswa: ")
    val nama = readln()

    print("Masukkan jumlah mata pelajaran: ")
    val jumlah = readln().toIntOrNull() ?: 0

    val nilaiList = mutableListOf<Int>()
    for (i in 1..jumlah) {
        print("Nilai pelajaran ke-$i: ")
        val nilai = readln().toIntOrNull() ?: 0
        nilaiList.add(nilai)
    }

    data[nama] = nilaiList
    println("✅ Data untuk $nama telah ditambahkan.")
}

// Fitur 2: Lihat Semua Data
fun tampilkanData(data: Map<String, List<Int>>) {
    if (data.isEmpty()) {
        println("❗ Belum ada data.")
        return
    }

    for ((nama, nilaiList) in data) {
        val rata = if (nilaiList.isNotEmpty()) nilaiList.average() else 0.0
        println("\nNama: $nama")
        println("Nilai: ${nilaiList.joinToString(", ")}")
        println("Rata-rata: %.2f".format(rata))
    }
}

// Fitur 3: Cari Nilai Tertinggi
fun cariNilaiTertinggi(data: Map<String, List<Int>>) {
    var maxNilai = Int.MIN_VALUE
    var siswaTerbaik = ""

    for ((nama, nilaiList) in data) {
        val tertinggi = nilaiList.maxOrNull() ?: continue
        if (tertinggi > maxNilai) {
            maxNilai = tertinggi
            siswaTerbaik = nama
        }
    }

    if (siswaTerbaik.isNotEmpty()) {
        println("🎯 Siswa dengan nilai tertinggi: $siswaTerbaik ($maxNilai)")
    } else {
        println("❗ Tidak ada data.")
    }
}

// Fitur 4: Siswa yang Lulus
fun tampilkanLulus(data: Map<String, List<Int>>) {
    val lulus = data.filter { (_, nilai) -> nilai.average() >= 75 }

    if (lulus.isEmpty()) {
        println("❗ Tidak ada siswa yang lulus.")
        return
    }

    println("🎉 Siswa yang lulus:")
    for ((nama, nilai) in lulus) {
        println("$nama (Rata-rata: %.2f)".format(nilai.average()))
    }
}
