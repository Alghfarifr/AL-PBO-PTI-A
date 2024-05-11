package Praktikum8;

// merupakan turunan dari kelas Pegawai. Artinya, PegawaiTetap mewarisi semua properti dan metode dari kelas Pegawai.
public class PegawaiTetap extends Pegawai {
    // Ini adalah deklarasi variabel upah, yang merupakan gaji pegawai tetap.
    private double upah;

    // Konstruktor ini menerima tiga parameter: nama, noKTP, dan upah, dan kemudian memanggil konstruktor kelas 
    // induk Pegawai dengan menggunakan kata kunci super, lalu menginisialisasi variabel upah dengan nilai yang diberikan.
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    // metode untuk mengatur nilai upah.
    public void setUpah(double upah) {
        this.upah = upah;
    }

    // metode untuk mendapatkan nilai upah.
    public double getUpah() {
        return upah;
    }

    // Metode ini mengembalikan nilai upah, yang merupakan gaji pegawai tetap.
    @Override
    public double gaji() {
        return upah;
    }

    // untuk mengonversi objek menjadi representasi string. Dalam hal ini, metode ini mengembalikan string yang 
    // berisi representasi dari objek PegawaiTetap, termasuk informasi yang diwarisi dari kelas Pegawai, ditambah informasi spesifik upah.
    @Override
    public String toString() {
        return super.toString() + ", Upah: " + upah;
    }
}
