package Praktikum8;

// Kelas abstrak tidak dapat diinstansiasi secara langsung, tetapi dapat memiliki metode abstrak yang 
// harus diimplementasikan oleh kelas turunannya.
public abstract class Pegawai {
    // Merupakan sebuah deklarasi dua variabel instance (fields), yang merupakan atribut dari kelas Pegawai
    // Hanya dapatdiakse di dalam kelas pegawai
    private String nama;
    private String noKTP;

    // Ini adalah konstruktor kelas Pegawai. Konstruktor ini menerima dua parameter, yaitu nama dan noKTP, 
    // dan digunakan untuk menginisialisasi nilai dari atribut-atribut nama dan noKTP ketika objek Pegawai dibuat.
    public Pegawai(String nama, String noKTP) {
        // pernyataan yang menginisialisasi nilai atribut-atribut nama dan noKTP dengan nilai yang diberikan oleh konstruktor.
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // metode akses (getter) yang digunakan untuk mengambil nilai dari atribut nama dan noKTP. Karena 
    // atribut-atribut ini ditandai sebagai private, maka metode akses diperlukan untuk mengakses nilainya dari luar kelas.
    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    // metode yang dioverride dari kelas Object. Metode ini mengembalikan representasi string dari objek Pegawai, 
    // yang berisi informasi tentang nama dan nomor KTP pegawai tersebut.
    @Override
    public String toString() {
        return "Nama: " + nama + ", No. KTP: " + noKTP;
    }

    // deklarasi metode abstrak gaji() yang mengembalikan nilai bertipe double. Metode ini bertujuan untuk menghitung 
    // gaji pegawai, tetapi implementasinya tidak diberikan di kelas Pegawai karena kelas ini merupakan kelas abstrak. 
    // Implementasi metode ini akan diberikan oleh kelas turunan dari Pegawai.
    public abstract double gaji();
}
