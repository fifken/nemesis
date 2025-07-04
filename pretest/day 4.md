```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: C. Membagi antarmuka aplikasi ke dalam bagian modular
   A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar

2. Kelas dasar untuk membuat fragment adalah: C. `Fragment`
   A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`

3. Metode untuk menambahkan fragment ke activity adalah: B. `beginTransaction().add()`
   A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`

4. Untuk mengelola fragment, kita menggunakan: C. `FragmentManager`
   A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah: C. `FrameLayout`
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`

```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity. F
7. Satu activity bisa menampilkan lebih dari satu fragment. T
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan. F
9. Fragment bisa mengakses komponen UI dari activity langsung. T
10. Fragment tidak bisa hidup tanpa activity. T

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android? 
add, edit, dan delete fragment dari activity
12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment? 
onCreateView()
13. Sebutkan dua metode lifecycle penting pada fragment! 
onCreateView() dan onViewCreated()
14. Bagaimana cara mengirim data dari activity ke fragment?
Bundle
15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
menampilkan view satu sekaligus
16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
mengganti fragment sebelumnya dan menumpuk fragment sebelumnya
17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
tidak bisa karena fragment bergantung pada konteks dari activity
18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
addToBackStack() dan panggil menggunakan popBackStack()
19. Apa tujuan dari `setArguments(Bundle)` di fragment?
untuk memeberi data ke fragment yang dibuat
20. Sebutkan alasan menggunakan fragment dibanding activity!
lebih ringan dan modular

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()

val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}

class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />

<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)

val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle
```

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()

supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit()
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}

class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)

val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle = args
```

28.

```kotlin
supportFragmentManager.pop()

supportFragmentManager.popBackStack()
```

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()

if (fragment != null) {
    activity.supportFragmentManager.beginTransaction()
        .remove(fragment)
        .commitNowAllowingStateLoss()
}
```

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)

val view = inflater.inflate(R.layout.fragment_home, container, false)
```

---
