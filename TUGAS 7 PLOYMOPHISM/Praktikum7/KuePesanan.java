package Praktikum7;

public class KuePesanan extends Kue {
    // Baris ini mendeklarasikan variabel instance berat dengan tipe data double, yang hanya dapat diakses oleh metode-metode yang berada dalam kelas KuePesanan. Variabel ini digunakan untuk menyimpan berat kue yang dipesan.
    private double berat;

    // Ini adalah konstruktor dari kelas KuePesanan. Konstruktor ini memungkinkan pembuatan objek KuePesanan dengan spesifikasi nama, harga, dan berat. Konstruktor ini memiliki tiga parameter: nama, harga, dan berat.
    public KuePesanan(String nama, double harga, double berat) {
        // Kata kunci super digunakan untuk memanggil konstruktor dari kelas induk (Kue). Ini penting untuk menginisialisasi bagian dari objek yang diwarisi dari kelas Kue dengan nilai nama dan harga yang diberikan.
        super(nama, harga);
        // Baris ini menginisialisasi variabel instance berat dari objek KuePesanan. this.berat merujuk pada variabel instance berat dari objek saat ini, dan berat adalah nilai parameter yang diberikan kepada konstruktor.
        this.berat = berat;
    }

    // menunjukkan bahwa metode hitungHarga di bawahnya adalah override dari metode hitungHarga yang ada di kelas induk (Kue). Ini digunakan untuk memastikan bahwa metode tersebut benar-benar mengoverride metode dari kelas induk.
    @Override
    // deklarasi metode hitungHarga yang mengoverride metode yang sama dari kelas induk. Metode ini bertujuan untuk menghitung harga berdasarkan berat kue yang dipesan.
    double hitungHarga() {
        // mengembalikan hasil perhitungan harga total kue. harga diambil dari kelas induk Kue dan berat dari kelas KuePesanan. Perhitungan dilakukan dengan mengalikan harga per satuan dengan berat kue.
        return harga * berat;
    }

    // deklarasi metode getBerat yang digunakan untuk mengakses nilai dari variabel berat.
    public double getBerat() {
        // mengembalikan nilai dari variabel berat.
        return berat;
    }
}