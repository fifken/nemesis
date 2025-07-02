# 🚀 Kategori: Challenge Lanjutan Kotlin

---

### 🧩 Challenge 1 – **"Statistik Nilai Ujian"**

**📖 Cerita**:
Kamu membuat alat analisis nilai. Program harus bisa menghitung nilai minimum, maksimum, dan rata-rata dari sekumpulan nilai.

**🎯 Tugas**:

- Input: daftar nilai (contoh: 75, 80, 92, 65, 88)
- Tampilkan:

  - Nilai tertinggi
  - Nilai terendah
  - Nilai rata-rata

**⚙️ Requirement**:

- Gunakan `List<Int>`
- Gunakan fungsi: `.maxOrNull()`, `.minOrNull()`, `.average()`

**✅ Ekspektasi Output**:team 1

```
Nilai: [75, 80, 92, 65, 88]
Tertinggi: 92
Terendah: 65
Rata-rata: 80.0
```

---

### 🧩 Challenge 2 – **"Daftar Tamu dengan Nullable"**

**📖 Cerita**:
Kamu membuat sistem daftar tamu di mana beberapa tamu belum mengisi data alamat.

**🎯 Tugas**:

- Buat list `List<String?>` berisi nama tamu
- Tampilkan semua nama tamu yang tidak `null`
- Tampilkan jumlah tamu yang belum mengisi nama (null)

**⚙️ Requirement**:

- Gunakan `filterNotNull()` dan `count { it == null }`

**✅ Ekspektasi Output**:

```
Tamu terdaftar: Budi, Tania, Reza
Tamu tanpa nama: 2
```

---

### 🧩 Challenge 3 – **"Analisa Kalimat"**

**📖 Cerita**:
Kamu membuat aplikasi yang bisa membantu siswa menghitung jumlah huruf vokal dalam kalimat.

**🎯 Tugas**:

- Input kalimat
- Hitung jumlah huruf vokal (a, i, u, e, o)
- Tampilkan total vokal dan jumlah karakter

**⚙️ Requirement**:

- Gunakan `for` loop atau `.count { }`
- Bonus: fungsi `hitungVokal(kalimat: String): Int`

**✅ Ekspektasi Output**:

```
Kalimat: Aku suka Kotlin
Vokal: 6
Total karakter: 15
```

---

### 🧩 Challenge 4 – **"Validasi Input Email"**

**📖 Cerita**:
Kamu sedang membuat fitur login sederhana yang hanya menerima email yang valid (mengandung `@` dan `.`).

**🎯 Tugas**:

- Minta input email
- Cek apakah email valid
- Tampilkan hasil validasi

**⚙️ Requirement**:

- Gunakan `contains("@")` dan `contains(".")`
- Gunakan fungsi `fun isValidEmail(email: String): Boolean`

**✅ Ekspektasi Output**:

```
Input: tes@example.com
Status: Valid
```

---

### 🧩 Challenge 5 – **"Rekap Pengeluaran Harian"**

**📖 Cerita**:
Kamu sedang membuat aplikasi pencatatan keuangan harian. Aplikasi ini harus mampu menghitung total pengeluaran dari daftar transaksi dan menampilkan pengeluaran terbesar dan terkecil.

**🎯 Tugas**:

- Input: `List<Int>` yang merepresentasikan jumlah pengeluaran setiap hari (misal: 20000, 5000, 30000, 10000)
- Tampilkan:

  - Total pengeluaran
  - Pengeluaran terbesar
  - Pengeluaran terkecil

**⚙️ Requirement**:

- Gunakan `.sum()`, `.maxOrNull()`, dan `.minOrNull()`

**✅ Ekspektasi Output**:

```
Pengeluaran: [20000, 5000, 30000, 10000]
Total: 65000
Terbesar: 30000
Terkecil: 5000
```

---

```
repository name  = final-basic-kotlin-nama-team
nama project /folder contoh "challenge-1"
```

-----