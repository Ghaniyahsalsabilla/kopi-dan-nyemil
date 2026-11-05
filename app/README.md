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
<img width="282" height="546" alt="Screenshot 2026-11-04 195306" src="https://github.com/user-attachments/assets/f0644641-7712-4483-8998-face3916c243" />

<img width="280" height="556" alt="Screenshot 2026-11-04 195327" src="https://github.com/user-attachments/assets/f89b4951-38bd-4a55-82e0-7a88c01eada5" />

2. Register Page
<img width="283" height="558" alt="Screenshot 2026-11-04 195343" src="https://github.com/user-attachments/assets/a9e36c9d-7089-44dc-92d1-b8c6393bc32e" />

3. Login Page
<img width="276" height="552" alt="Screenshot 2026-11-04 195353" src="https://github.com/user-attachments/assets/41d1b533-fab2-4ca7-ab5f-58c6bc6ae908" />

4. Home Page
<img width="265" height="555" alt="Screenshot 2026-11-04 195445" src="https://github.com/user-attachments/assets/b67ede06-16fa-49e8-ba1a-4abda7d0e240" />

<img width="261" height="552" alt="Screenshot 2026-11-04 195454" src="https://github.com/user-attachments/assets/e9182b20-ced6-423b-96d9-32751ffa9510" />

5. Profile Page
<img width="340" height="727" alt="Screenshot 2026-11-05 215052" src="https://github.com/user-attachments/assets/fba76083-0ab8-470c-ac25-b6b2e31e2980" />

6. Delivery Address Page
<img width="280" height="553" alt="Screenshot 2026-11-04 195506" src="https://github.com/user-attachments/assets/b9dbd3d8-0299-4dce-9bd1-c2272caa3ebd" />

7. Order Confirmation 
<img width="266" height="542" alt="Screenshot 2026-11-04 195529" src="https://github.com/user-attachments/assets/2f88d894-e128-498a-bdc5-d6c073babd08" />

8. Order Success Page
<img width="300" height="606" alt="Screenshot 2026-11-05 201515" src="https://github.com/user-attachments/assets/775d6a53-2ecb-40ce-b34a-b1fb5b0bad9f" />


## Catatan

Aplikasi ini merupakan proyek UTS mata kuliah Pengembangan Aplikasi Mobile. Proses pemesanan masih berupa simulasi dan belum terhubung dengan database, payment gateway, maupun layanan pengiriman secara nyata.

## Pengembang

**Nama:** Ghaniyah Salsabilla

**NIM:** 1247050109

**Proyek:** Kopi dan Nyemil

**Platform:** Android
