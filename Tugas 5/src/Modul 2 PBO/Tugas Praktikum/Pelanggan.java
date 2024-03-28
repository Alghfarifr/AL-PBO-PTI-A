public class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String jenisRekening;
    private String pin;
    private int autentifikasiSalah;
    private boolean isBlokir;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, String jenisRekening) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.jenisRekening = jenisRekening;
        this.pin = null;
        this.autentifikasiSalah = 0;
        this.isBlokir = false;
    }

    public boolean autentifikasi(String nomorPelanggan, String pin) {
        if (isBlokir) {
            System.out.println("Akun Anda telah diblokir.");
            return false;
        }

        if (this.nomorPelanggan.equals(nomorPelanggan) && this.pin.equals(pin)) {
            autentifikasiSalah = 0; // Reset counter autentifikasi salah
            return true;
        } else {
            autentifikasiSalah++;
            if (autentifikasiSalah == 3) {
                isBlokir = true;
                System.out.println("Akun Anda telah diblokir karena kesalahan autentifikasi yang berulang.");
            } else {
                System.out.println("Nomor pelanggan atau PIN salah. Silakan coba lagi.");
            }
            return false;
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void topUp(double jumlah) {
        if (!isBlokir) {
            saldo += jumlah;
            System.out.println("Top up berhasil. Saldo Anda sekarang Rp " + saldo);
        } else {
            System.out.println("Top up gagal. Akun Anda telah diblokir.");
        }
    }

    public void tarikSaldo(double jumlah) {
        if (!isBlokir && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik saldo berhasil. Saldo Anda sekarang Rp " + saldo);
        } else {
            System.out.println("Tarik saldo gagal.");
        }
    }

    public void pembelian(double jumlah) {
        if (!isBlokir) {
            if (saldo - jumlah < 10000) {
                System.out.println("Transaksi gagal. Saldo minimal tidak terpenuhi.");
            } else {
                double cashback;
                if (jumlah > 1000000) {
                    switch (jenisRekening) {
                        case "silver":
                            cashback = jumlah * 0.05;
                            break;
                        case "gold":
                            cashback = jumlah * 0.07;
                            break;
                        case "platinum":
                            cashback = jumlah * 0.1;
                            break;
                        default:
                            cashback = 0;
                    }
                } else {
                    switch (jenisRekening) {
                        case "silver":
                            cashback = 0;
                            break;
                        case "gold":
                            cashback = jumlah * 0.02;
                            break;
                        case "platinum":
                            cashback = jumlah * 0.05;
                            break;
                        default:
                            cashback = 0;
                    }
                }

                double totalPembelian = jumlah - cashback;
                saldo -= totalPembelian;
                System.out.println("Pembelian berhasil. Total yang dibayarkan: Rp " + totalPembelian);
            }
        } else {
            System.out.println("Transaksi pembelian gagal. Akun Anda telah diblokir.");
        }
    }

    public static class Transaksi {
        private Pelanggan pelanggan;

        public Transaksi(Pelanggan pelanggan) {
            this.pelanggan = pelanggan;
        }

        public void prosesTransaksi(String jenisTransaksi, double jumlah) {
            if (jenisTransaksi.equals("tambah")) {
                pelanggan.topUp(jumlah);
            } else if (jenisTransaksi.equals("tarik")) {
                pelanggan.tarikSaldo(jumlah);
            } else {
                System.out.println("Jenis transaksi tidak valid.");
            }
        }
    }
}
