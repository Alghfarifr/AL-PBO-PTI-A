package Praktikum8;

// deklarasi kelas Sales yang merupakan subclass dari kelas Pegawai. Ini berarti kelas Sales akan mewarisi semua properti dan metode yang dimiliki oleh kelas Pegawai.
public class Sales extends Pegawai {
    // menyimpan jumlah penjualan yang dilakukan oleh seorang sales.
    private int penjualan;
    // menyimpan nilai komisi yang diterima oleh seorang sales.
    private double komisi;

    // menerima empat parameter: nama (nama sales), noKTP (nomor KTP sales), penjualan (jumlah penjualan), dan komisi (nilai komisi).
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        // memanggil konstruktor dari kelas induk (Pegawai dalam hal ini) dan menginisialisasi bagian dari objek tersebut.
        super(nama, noKTP);
        // menginisialisasi variabel penjualan milik kelas Sales dengan nilai dari parameter penjualan yang diterima oleh konstruktor.
        this.penjualan = penjualan;
        // menginisialisasi variabel komisi milik kelas Sales dengan nilai dari parameter komisi yang diterima oleh konstruktor.
        this.komisi = komisi;
    }

    // untuk mendapatkan nilai dari variabel penjualan.
    public int getPenjualan() {
        // mengembalikan nilai dari variabel penjualan.
        return penjualan;  
    }

    // untuk mengatur nilai dari variabel penjualan.
    public void setPenjualan(int penjualan) {
        // mengatur nilai variabel penjualan dengan nilai yang diberikan.
        this.penjualan = penjualan;
    }

    // untuk mendapatkan nilai dari variabel komisi.
    public double getKomisi() {
        // untuk mendapatkan nilai dari variabel komisi.
        return komisi;
    }

    // untuk mengatur nilai dari variabel komisi.
    public void setKomisi(double komisi) {
        // mengatur nilai variabel komisi dengan nilai yang diberikan.
        this.komisi = komisi;
    }

    @Override
    // Metode ini menghitung gaji sales berdasarkan penjualan dan komisi.
    public double gaji() {
        // mengembalikan hasil perkalian dari variabel penjualan dan komisi, yang merupakan gaji dari sales.
        return penjualan * komisi;
    }

    @Override
    // untuk mengembalikan representasi string dari objek Sales.
    public String toString() {
        // mengembalikan representasi string yang mencakup representasi string dari objek Pegawai (diperoleh dari 
        // super.toString()), jumlah penjualan, dan nilai komisi.
        return super.toString() + ", Penjualan: " + penjualan + ", Komisi: " + komisi;
    }
}
