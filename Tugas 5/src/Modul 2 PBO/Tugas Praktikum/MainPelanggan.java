import java.util.Scanner;
public class MainPelanggan {
    public static void main(String[] args) {
        // Membuat objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("3801234567", "Nama Pelanggan", 1500000, "silver");
        pelanggan1.setPin("1234"); // Set PIN pelanggan

        // Contoh penggunaan:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelanggan = scanner.nextLine();

        System.out.print("Masukkan PIN: ");
        String pin = scanner.nextLine();

        if (pelanggan1.autentifikasi(nomorPelanggan, pin)) {
            Pelanggan.Transaksi transaksi1 = new Pelanggan.Transaksi(pelanggan1);

            System.out.println("Apakah anda ingin melakukan top up atau pembelian? (t/p)");
            String jenisTransaksi = scanner.nextLine();

            if (jenisTransaksi.equalsIgnoreCase("t")) {
                System.out.print("Masukkan jumlah top up: ");
                double jumlah = scanner.nextDouble();
                transaksi1.prosesTransaksi("tambah", jumlah);
            } else if (jenisTransaksi.equalsIgnoreCase("p")) {
                System.out.print("Masukkan jumlah pembelian: ");
                double jumlah = scanner.nextDouble();
                transaksi1.prosesTransaksi("tarik", jumlah);
            } else {
                System.out.println("Jenis transaksi tidak valid.");
            }

            System.out.println("Saldo akhir: " + pelanggan1.getSaldo());
        }
    }
}