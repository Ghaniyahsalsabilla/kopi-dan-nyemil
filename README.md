#  Kopi dan Nyemil

## Deskripsi

**Kopi dan Nyemil** merupakan aplikasi pemesanan kopi dan makanan ringan berbasis Android yang dikembangkan menggunakan Kotlin dan XML Layout.

Aplikasi ini dirancang untuk memudahkan pengguna melihat daftar menu, memilih produk, mengisi informasi penerima, dan melakukan konfirmasi pesanan melalui perangkat Android.

## Fitur Aplikasi

1. **Welcome Page** — Halaman awal aplikasi.
2. **Sign Up** — Pilihan untuk masuk atau membuat akun.
3. **Register** — Pendaftaran akun pengguna.
4. **Login** — Masuk menggunakan username dan password yang telah didaftarkan.
5. **Home** — Menampilkan sapaan pengguna dan daftar produk.
6. **Daftar Produk** — Menampilkan enam pilihan kopi dan makanan ringan beserta gambar dan harga.
7. **Profile** — Menampilkan informasi nama dan username pengguna serta fitur logout.
8. **Delivery Address** — Formulir untuk mengisi nama penerima, nomor telepon, dan alamat pengiriman.
9. **Order Confirmation** — Menampilkan ringkasan produk dan informasi penerima sebelum pesanan dikonfirmasi.
10. **Order Success** — Menampilkan pemberitahuan bahwa pesanan berhasil dikonfirmasi.

## Daftar Menu

| No. | Nama Produk | Harga |
|---|---|---:|
| 1 | Kopi Gula Aren | Rp25.000 |
| 2 | Butterscotch Latte | Rp27.000 |
| 3 | Chocolate | Rp22.000 |
| 4 | Matcha Latte | Rp27.000 |
| 5 | Brownie with Ice Cream | Rp30.000 |
| 6 | Croissants | Rp18.000 |

## Teknologi yang Digunakan

- **Kotlin** — Bahasa pemrograman aplikasi.
- **Android Studio** — Integrated Development Environment (IDE).
- **XML Layout** — Membuat tampilan antarmuka aplikasi.
- **RecyclerView** — Menampilkan daftar produk.
- **SharedPreferences** — Menyimpan informasi akun pengguna secara lokal.
- **Intent** — Menghubungkan perpindahan antarhalaman aplikasi.
- **Android SDK** — Platform pengembangan aplikasi Android.

## Cara Menjalankan Aplikasi

1. Download atau clone repository ini.
2. Buka Android Studio.
3. Pilih **Open** dan arahkan ke folder project `kopi-dan-nyemil`.
4. Tunggu proses Gradle Sync hingga selesai.
5. Hubungkan perangkat Android atau jalankan emulator.
6. Klik tombol **Run** untuk menjalankan aplikasi.

## Alur Penggunaan

1. Pengguna membuka aplikasi melalui halaman Welcome.
2. Pengguna memilih Register untuk membuat akun.
3. Setelah akun berhasil dibuat, pengguna melakukan Login.
4. Pengguna masuk ke halaman Home dan memilih produk.
5. Pengguna mengisi informasi penerima dan alamat pengiriman.
6. Pengguna memeriksa detail pesanan pada halaman Order Confirmation.
7. Pengguna menekan tombol Konfirmasi Pesanan.
8. Aplikasi menampilkan halaman Order Success.

## Screenshot Aplikasi

Screenshot setiap halaman aplikasi akan ditambahkan pada bagian ini.

1. Welcome Page
![img.png](img.png), ![img_1.png](img_1.png)
2. Register Page
![img_2.png](img_2.png)
3. Login Page
![img_3.png](img_3.png)
4. Home Page
![img_5.png](img_5.png), ![img_6.png](img_6.png) 
5. Profile Page
![img_10.png](img_10.png)
6. Delivery Address Page
![img_7.png](img_7.png)
7. Order Confirmation 
![img_8.png](img_8.png)
8. Order Success Page
![img_9.png](img_9.png)

## Catatan

Aplikasi ini merupakan proyek UTS mata kuliah Pengembangan Aplikasi Mobile. Proses pemesanan masih berupa simulasi dan belum terhubung dengan database, payment gateway, maupun layanan pengiriman secara nyata.

## Pengembang

**Nama:** Ghaniyah Salsabilla

**NIM:** 1247050109

**Proyek:** Kopi dan Nyemil

**Platform:** Android
