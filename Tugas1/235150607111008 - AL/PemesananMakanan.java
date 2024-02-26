import java.util.Scanner;

public class PemesananMakanan {

    static String[] menuMakanan = {"Nasi Goreng", "Mie Goreng", "Soto Ayam"};
    static double[] hargaMakanan = {25000, 20000, 15000};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu makanan
        System.out.println("Menu Makanan:");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i] + " - Rp " + hargaMakanan[i]);
        }

        // Meminta input dari pengguna
        System.out.print("Masukkan nomor menu yang dipilih: ");
        int nomorMenu = input.nextInt();

        // Memastikan nomor menu berada dalam rentang yang valid
        if (nomorMenu >= 1 && nomorMenu <= menuMakanan.length) {
            // Meminta input jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan = input.nextInt();

            // Menghitung total harga
            double totalHarga = hargaMakanan[nomorMenu - 1] * jumlahPesanan;
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        } else {
            System.out.println("Nomor menu tidak valid.");
        }

        input.close();
    }
}
