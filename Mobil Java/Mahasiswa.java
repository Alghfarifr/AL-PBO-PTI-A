public class Mahasiswa {
    // Mendeklarasikan atribut nama, kataPerHari, jumlahHalamanBuku, dan jumlahKataPerBuku dengan tipe data yang sesuai.
    private String nama;
    private int kataPerHari;
    private int jumlahHalamanBuku;
    private int jumlahKataPerBuku;

    // Mendefinisikan konstruktor untuk kelas Mahasiswa, digunakan untuk inisialisasi objek saat dibuat.
    public Mahasiswa(String nama, int kataPerHari, int jumlahHalamanBuku) {
        this.nama = nama;
        this.kataPerHari = kataPerHari;
        this.jumlahHalamanBuku = jumlahHalamanBuku;
        this.jumlahKataPerBuku = hitungJumlahKata();
    }

    // Menghitung jumlah kata per buku berdasarkan kataPerHari dan jumlahHalamanBuku.
    public int hitungJumlahKata() {
        int kataPerHalaman = 2 * kataPerHari;
        return kataPerHalaman * jumlahHalamanBuku;
    }

    // Menghitung lama menulis satu buku berdasarkan jumlah kata per buku dan kataPerHari.
    public double hitungLamaMenulis() {
        return (double) jumlahKataPerBuku / kataPerHari;
    }

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswaA = new Mahasiswa("Mahasiswa A", 100, 50);

        // Menghitung jumlah kata per buku
        int jumlahKataPerBuku = mahasiswaA.hitungJumlahKata();

        // Menetapkan jumlah kata per buku pada objek Mahasiswa
        mahasiswaA.setJumlahKataPerBuku(jumlahKataPerBuku);

        // Menghitung lama menulis 1 buku
        double lamaMenulisBuku = mahasiswaA.hitungLamaMenulis();

        // Menampilkan hasil
        System.out.printf("%s memerlukan %.2f hari untuk menulis 1 buku.%n", mahasiswaA.getNama(), lamaMenulisBuku);
    }

    // Getter dan setter (opsional, tergantung kebutuhan)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKataPerHari() {
        return kataPerHari;
    }

    public void setKataPerHari(int kataPerHari) {
        this.kataPerHari = kataPerHari;
    }

    public int getJumlahHalamanBuku() {
        return jumlahHalamanBuku;
    }

    public void setJumlahHalamanBuku(int jumlahHalamanBuku) {
        this.jumlahHalamanBuku = jumlahHalamanBuku;
    }

    public int getJumlahKataPerBuku() {
        return jumlahKataPerBuku;
    }

    public void setJumlahKataPerBuku(int jumlahKataPerBuku) {
        this.jumlahKataPerBuku = jumlahKataPerBuku;
    }
}

// Getter digunakan untuk mendapatkan nilai atribut.
// Setter digunakan untuk mengatur nilai atribut.