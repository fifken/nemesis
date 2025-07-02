## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai? B
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`

2. Method `onPause()` biasanya dipanggil ketika... C
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_

3. Method `onDestroy()` akan selalu dipanggil jika... D
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?  D
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`

5. Lifecycle `onRestart()` akan dipanggil saat... B
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`

6. Saat user menekan tombol home, urutan method yang dipanggil adalah: B
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan: C
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan? C
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`? C
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`

10. Fungsi dari `onResume()` adalah... B
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul 
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity. F
12. `onPause()` dipanggil sebelum `onStop()`. T
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain. F
14. Rotasi layar akan memanggil kembali `onCreate()`. T
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif. T
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi. F
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian. F
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total. T
19. `onCreate()` hanya digunakan untuk menampilkan layout. F
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.F

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.
onCreate(), onStart(), onResume()

22. Apa fungsi utama dari method `onSaveInstanceState()`?
menyimpan data data sementara untuk dipanggil lagi saat recreate

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?
onPause() masih kelihatan, sudah tidak aktif
onStop() tidak kelihatan

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?
akan auto recreate -> destroy lalu create

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.
saat aplikasi crash atau force closed
---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}

override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
}
```

27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
override fun onStop() {
  super.onStop()
  Log.d("LIFECYCLE", "Stopped")
}
```

28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}

override fun onResume() {
  super.onResume()
}

```

29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}

override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  Log.d("LIFECYCLE", "Created")
}
```

30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}

override fun onSaveInstanceState(outState: Bundle) {
  super.onSaveInstanceState(outState)
  outState.putString("username", "admin")
}
```

---
