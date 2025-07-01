---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin? C

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`

2. Kata kunci `val` digunakan untuk: B

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak

3. Apa hasil dari `println(5 + 3 * 2)`? B

   - a. 16
   - b. 11
   - c. 13
   - d. 6

4. Fungsi utama program Kotlin adalah: B

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`

5. Di Android Studio, layout antarmuka ditulis dengan: C

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON

6. Apa hasil dari kode berikut? B

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14

7. Fungsi `readLine()` dalam Kotlin digunakan untuk: C

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`? B

   - a. true
   - b. false
   - c. error
   - d. null

9. Android Studio adalah tools untuk: C

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan: A

- a. Intent
- b. Fragment
- c. TextView
- d. XML

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin. 
value dari val tidak bisa berubah, sedangkan var bisa
12. Sebutkan dua tipe data numerik dalam Kotlin. 
integer, double
13. Apa kegunaan fungsi `println()`? 
menampilkan output teks
14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
menggunakan toIntOrNull()
15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
Linear Layout mengatur tampilan turunan dalam satu baris atau satu kolom 
16. Apa itu `Intent` dalam Android?
memungkinkan komunikasi antar bagian
17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
textView
18. Apa arti dari null safety dalam Kotlin?
mencegah error ketika memanggil objek yang memiliki anggota bernilai null
19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
kalau value nya null toInt() akan error sedangkan toIntOrNull() bisa mengembalikan null
20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
lebih ringkas daripada Java
21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
app/src/main/res/layout/activity_main.xml
22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
fun main(){
   println("Halo Agus")
}
23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
memungkinkan suatu variabel dipanggil dalam string dalam bentuk $namavariabel
24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
?. mencegah error saat memanggil properti yang memiliki value null sedangkan ?: akan menyediankan nilai alternatif jika null
25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?
menggunakan try-catch, input validation, ? , dll

---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}

fun main() {
    val umur = readLine()?.toIntOrNull()
    println("Umur anda adalah ${(umur ?: 0) + 5}")
}
```

---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")

val nama: String = "Agus"
println("Halo $nama")
```

---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}

fun main() {
    var nama = readLine()
    var umur = readLine()?.toIntorNull()
    println("Nama saya: $nama, umur: $umur tahun")
}
```

---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)

val angka = 20
val hasil = angka + 5
println(hasil)
```

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}

fun main() {
  val tinggi = readLine().toDoubleOrNull()
  println("Tinggi kamu adalah $tinggi")
}
```

---
