package Praktikum7;

public class TokoKue {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];
        // Isi array dengan berbagai jenis kue
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) { // KuePesanan
                kueArray[i] = new KuePesanan("Kue Pesanan " + i, 10000, 1.5 + i);
            } else { // KueJadi
                kueArray[i] = new KueJadi("Kue Jadi " + i, 5000, 2 + i);
            }
        }

        // Inisialisasi variabel-variabel yang digunakan untuk menghitung total harga semua kue, total berat dan harga kue pesanan, total jumlah dan harga kue jadi, dan menentukan kue dengan harga paling mahal.
        double totalHarga = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKuePesanan = 0;
        double totalJumlahKueJadi = 0;
        double totalHargaKueJadi = 0;
        Kue kueTermahal = kueArray[0]; // Asal ada nilai awal

        // Ini adalah loop for-each yang digunakan untuk iterasi melalui setiap objek Kue dalam kueArray.
        for (Kue kue : kueArray) {
            // Menampilkan setiap objek Kue dan menambahkan harga kue tersebut ke totalHarga.
            System.out.println(kue);
            totalHarga += kue.hitungHarga();
            
            // Periksa tipe dari setiap kue. Jika kue adalah instans dari KuePesanan, menambahkan harga dan beratnya ke total yang sesuai. Jika kue adalah KueJadi, melakukan hal yang sama untuk harga dan jumlahnya.
            if (kue instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) kue;
                totalHargaKuePesanan += kp.hitungHarga();
                totalBeratKuePesanan += kp.getBerat();
            } else if (kue instanceof KueJadi) {
                KueJadi kj = (KueJadi) kue;
                totalHargaKueJadi += kj.hitungHarga();
                totalJumlahKueJadi += kj.getJumlah();
            }

            // Membandingkan harga kue saat ini dengan harga kue termahal yang sudah dicatat. Jika harga kue saat ini lebih tinggi, kue tersebut menjadi kue termahal yang baru.
            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        // Cetak total harga semua kue, total harga dan berat untuk KuePesanan, total harga dan jumlah untuk KueJadi, dan kue dengan harga terbesar.
        System.out.println("Total harga semua kue: Rp " + totalHarga);
        System.out.println("Total harga dan total berat Kue Pesanan: Rp " + totalHargaKuePesanan + ", " + totalBeratKuePesanan + " kg");
        System.out.println("Total harga dan total jumlah Kue Jadi: Rp " + totalHargaKueJadi + ", " + totalJumlahKueJadi);
        System.out.println("Kue dengan harga terbesar adalah " + kueTermahal);
    }
}
