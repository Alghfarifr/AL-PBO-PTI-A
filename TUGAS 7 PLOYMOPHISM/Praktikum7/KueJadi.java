package Praktikum7;

// Deklarasi kelas KueJadi yang merupakan subclass atau turunan dari kelas Kue. Ini berarti KueJadi mewarisi sifat dan perilaku dari kelas Kue, namun juga dapat menambahkan atau mengubah sifat dan perilaku tersebut.
public class KueJadi extends Kue {
    // Mendeklarasikan variabel instance jumlah dengan modifier private, artinya variabel ini hanya bisa diakses oleh metode-metode dalam kelas KueJadi ini saja. Variabel jumlah bertipe double dan digunakan untuk menyimpan jumlah kue.
    private double jumlah;

    // Constructor dari kelas KueJadi. Constructor ini memiliki tiga parameter: nama (tipe String), harga (tipe double), dan jumlah (tipe double). Constructor ini digunakan untuk membuat objek KueJadi.
    public KueJadi(String nama, double harga, double jumlah) {
        // Memanggil constructor dari kelas induk (Kue) dengan memberikan argumen nama dan harga. Ini adalah cara untuk menginisialisasi bagian dari objek yang merupakan instance dari kelas induk.
        super(nama, harga);
        // Menginisialisasi variabel instance jumlah dengan nilai yang diberikan melalui parameter constructor. Penggunaan this digunakan untuk merujuk pada variabel instance dari objek saat ini.
        this.jumlah = jumlah;
    }

    // untuk menandakan bahwa metode hitungHarga yang akan didefinisikan berikutnya adalah sebuah override dari metode hitungHarga yang ada di kelas induk.
    @Override
    // Mendefinisikan metode hitungHarga yang mengembalikan nilai tipe double. Metode ini digunakan untuk menghitung harga total dari kue berdasarkan harga per unit dan jumlah, dengan pengganda 2.
    double hitungHarga() {
        // Mengembalikan hasil perhitungan harga total. Ini mengambil harga dari kelas induk (protected double harga di Kue) dikalikan dengan jumlah dan faktor pengganda 2. 
        return harga * jumlah * 2;
    }

    // Mendefinisikan metode getJumlah yang mengembalikan nilai dari variabel jumlah. Metode ini bersifat public sehingga dapat diakses dari luar kelas KueJadi.
    public double getJumlah() {
        // Mengembalikan nilai dari variabel jumlah.
        return jumlah;
    }
}
