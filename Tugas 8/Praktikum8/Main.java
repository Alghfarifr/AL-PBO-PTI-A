package Praktikum8;

public class Main {
    // Method main ini akan dieksekusi terlebih dahulu saat program dijalankan.
    public static void main(String[] args) {
        // sub-kelas dari kelas Pegawai. Dengan demikian, mereka dapat di-referensi oleh variabel bertipe Pegawai. 
        // Ini juga menunjukkan konsep polimorfisme, dimana objek-objek dengan tipe yang berbeda dapat diakses melalui referensi yang sama.
        Pegawai pegawai1 = new PegawaiTetap("Ali", "123456789", 5000);
        Pegawai pegawai2 = new PegawaiHarian("Budi", "987654321", 100, 45);
        Pegawai pegawai3 = new Sales("Cici", "192837465", 200, 50);

        // memanggil metode toString() dari kelas PegawaiTetap.
        System.out.println(pegawai1);
        // memanggil metode gaji() dari objek pegawai1. Objek pegawai1 adalah tipe PegawaiTetap, jadi metode gaji() 
        // yang akan dipanggil adalah yang didefinisikan di dalam kelas PegawaiTetap.
        System.out.println("Gaji: " + pegawai1.gaji());
        // Ini mencetak baris kosong untuk memisahkan keluaran antar pegawai.
        System.out.println();

        System.out.println(pegawai2);
        System.out.println("Gaji: " + pegawai2.gaji());
        System.out.println();

        System.out.println(pegawai3);
        System.out.println("Gaji: " + pegawai3.gaji());
        System.out.println();
    }
}
