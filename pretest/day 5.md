
---
## MULTIMEDIA 

1. Komponen bawaan Android yang digunakan untuk memutar video dari URL adalah: B

   * A. AudioManager
   * B. VideoView
   * C. MediaPlayer
   * D. ExoPlayer

2. Untuk menampilkan video YouTube dengan cara termudah, kita bisa menggunakan: A

   * A. Intent ke browser atau YouTube app
   * B. WebSocket
   * C. AssetManager
   * D. SharedPreferences

3. Metode `setVideoURI()` digunakan pada: B

   * A. TextView
   * B. VideoView
   * C. MediaPlayer
   * D. ImageView

4. Apa tujuan dari `start()` setelah `setVideoURI()`? C

   * A. Mengakhiri video
   * B. Pause video
   * C. Mulai pemutaran
   * D. Mengulang video

5. Library yang sering digunakan untuk video streaming dengan kontrol lebih lengkap adalah: C

   * A. Retrofit
   * B. Glide
   * C. ExoPlayer
   * D. Ktor

6. Sebutkan 2 cara menampilkan video YouTube dalam aplikasi Android.
Intent untuk YouTube App atau browser dan WebView untuk menampilkan iframe YouTube embed

7. Bagaimana Anda membuka link video YouTube secara langsung ke browser?
val intent = Intent(Intent.ACTION_VIEW, Uri.parse("link youtube"))
startActivity(intent)

8. Apa perbedaan `VideoView` dan `WebView` saat menampilkan konten video?
VideoView untuk memutar video lokal/streaming
WebView untuk menampilkan embed YouTube video dalam HTML (iframe)


9. Perbaiki kode berikut agar dapat memutar video dari URL:

```kotlin
val videoView = findViewById<VideoView>(R.id.videoView)
videoView.setVideoPath("https://youtube.com/videoid")
videoView.play()
```

10. Kode berikut digunakan untuk membuka video via browser. Namun tidak bekerja. Perbaiki:

```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = "https://youtu.be/abc123"
startActivity(intent)

val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/abc123"))
startActivity(intent)
```

---

##  SHARED PREFERENCES
  
11. SharedPreferences digunakan untuk menyimpan: C

* A. Gambar
* B. Video
* C. Data sederhana seperti token, nama
* D. Seluruh database

12. SharedPreferences hanya bisa diakses oleh: B

* A. Semua aplikasi
* B. Aplikasi yang sama
* C. Server
* D. Web browser

13. Untuk menulis ke SharedPreferences, Anda membutuhkan: A

* A. Editor
* B. Reader
* C. Database
* D. RecyclerView

14. Fungsi untuk menyimpan `String` ke SharedPreferences: C

* A. putValue()
* B. writeString()
* C. putString()
* D. save()

15. Fungsi `apply()` digunakan untuk: B

* A. Membatalkan perubahan
* B. Menyimpan secara async
* C. Menyimpan secara sync
* D. Logout

16. Bagaimana cara menyimpan nama pengguna ke SharedPreferences?
val pref = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
val editor = pref.edit()
editor.putString("username", "JohnDoe")
editor.apply()

17. Bagaimana cara menghapus semua data SharedPreferences?
val pref = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
pref.edit().clear().apply()

18. Sebutkan 2 jenis data yang bisa disimpan di SharedPreferences.
string, int

19. Perbaiki kode berikut agar dapat menyimpan token:

```kotlin
val pref = getSharedPreferences("MyApp", MODE_WORLD_WRITEABLE)
val editor = pref.edit()
editor.save("token", "abc123")

val pref = getSharedPreferences("MyApp", Context.MODE_PRIVATE)
val editor = pref.edit()
editor.putString("token", "abc123")
editor.apply()
```

20. Kode berikut digunakan untuk membaca data dari SharedPreferences namun error. Perbaiki:

```kotlin
val pref = getPreferences()
val name = pref.getString("username")

val pref = getPreferences(Context.MODE_PRIVATE)
val name = pref.getString("username", null)
```

---
##  ROOM DATABASE
21. Room adalah library untuk: C

* A. Menyimpan file
* B. Menyimpan video
* C. Database SQLite wrapper
* D. Akses Web

22. Setiap entitas dalam Room harus ditandai dengan: B

* A. @ViewModel
* B. @Entity
* C. @Activity
* D. @Column

23. DAO digunakan untuk: C

* A. Menyimpan layout
* B. Menyimpan aktivitas
* C. Akses ke database
* D. Migrasi

24. Untuk menjalankan query di DAO, kita bisa gunakan: D

* A. @Insert
* B. @Delete
* C. @Query
* D. Semua benar

25. Room membutuhkan apa agar bisa berjalan? C

* A. Koneksi internet
* B. UI
* C. Database dan DAO
* D. Activity

26. Sebutkan 3 komponen utama dari Room.
Entity, Dao, RoomDatabase

27. Apa itu `@PrimaryKey` dalam Room?
sebagai kunci utama dalam entitas Room

28. Sebutkan 1 contoh fungsi DAO untuk mendapatkan seluruh data.
@Query("SELECT * FROM user")
fun getAllUsers(): List<User>

29. Perbaiki entitas berikut agar bisa digunakan oleh Room:

```kotlin
data class User(
   val id: Int,
   val name: String
)

@Entity
data class User(
    @PrimaryKey val id: Int,
    val name: String
)

```

30. Kode berikut menampilkan error saat menjalankan `insert`. Perbaiki:

```kotlin
@Dao
interface UserDao {
    fun insertUser(user: User)
}

@Dao
interface UserDao {
    @Insert
    fun insertUser(user: User)
}
```

---
