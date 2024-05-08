package Praktikum7;

// deklarasi dari sebuah kelas abstrak yang bernama Kue. Kelas abstrak adalah kelas yang tidak dapat diinstansiasi (tidak bisa membuat objek dari kelas ini secara langsung) dan sering digunakan sebagai kelas dasar. Kelas ini mungkin memiliki metode abstrak yang harus diimplementasikan oleh kelas 
abstract class Kue {
    // Mendeklarasikan variabel nama dengan tipe data String yang memiliki akses protected. Akses protected memungkinkan variabel ini diakses oleh kelas ini sendiri, kelas turunan, dan kelas lain dalam paket yang sama.
    protected String nama;
    // dideklarasikan dengan akses protected. Variabel ini bertipe data double dan digunakan untuk menyimpan harga dari kue.
    protected double harga;

    // Ini adalah konstruktor dari kelas Kue. Konstruktor ini mengambil dua parameter: nama dan harga. Konstruktor digunakan untuk inisialisasi objek.
    public Kue(String nama, double harga) {
        // this.nama merujuk pada variabel nama yang merupakan anggota dari kelas ini. Pernyataan ini mengatur nilai dari variabel nama dengan nilai yang diberikan melalui parameter konstruktor.
        this.nama = nama;
        // Sama dengan penjelasan sebelumnya, tetapi untuk variabel harga. Mengatur nilai dari variabel harga dengan nilai yang diberikan melalui parameter konstruktor.
        this.harga = harga;
    }

    // Ini adalah deklarasi metode abstrak hitungHarga yang mengembalikan nilai bertipe double. Karena ini adalah metode abstrak, tidak ada implementasi diberikan di sini. Setiap kelas turunan harus menyediakan implementasi untuk metode ini.
    abstract double hitungHarga();

    // Anotasi ini menunjukkan bahwa metode berikutnya, yaitu toString, adalah override dari metode yang ada di kelas dasar (dalam hal ini dari kelas Object).
    @Override
    // Metode toString ini digunakan untuk mengembalikan representasi string dari objek. Metode ini sering digunakan untuk memberikan representasi yang mudah dibaca oleh manusia dari objek.
    public String toString() {
        // Metode toString ini mengembalikan sebuah string yang menggabungkan nama kue dan hasil perhitungan dari metode hitungHarga dengan format tertentu.
        return nama + " dengan harga akhir Rp " + hitungHarga();
    }
}

