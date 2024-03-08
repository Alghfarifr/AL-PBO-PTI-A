public class Mobil {
    // Mendeklarasikan atribut-atribut privat yang merepresentasikan karakteristik mobil, seperti nomor plat, warna, manufaktur, kecepatan, waktu, dll.
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double setWaktu;
    private double waktuSek;
    private double Kecepatandirubah;
    private double Jarak1;
    private double Jarakkm;

    // Method setter untuk menetapkan nilai atribut noPlat.
    public void setNoPlat(String s) {
        noPlat = s;
    }

    // Method setter untuk menetapkan nilai atribut warna.
    public void setWarna(String s) {
        warna = s;
    }

    // Method setter untuk menetapkan nilai atribut manufaktur.
    public void setManufaktur(String s) {
        manufaktur = s;
    }

    // Method setter untuk menetapkan nilai atribut kecepatan. Memanggil method rubahKecepatan dengan nilai kecepatan sebagai parameter.
    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan(i);
    }

    // Method setter untuk menetapkan nilai atribut setWaktu. Memanggil method rubahSekon dengan nilai waktu sebagai parameter.
    public void setWaktu(double d) {
        setWaktu = d;
        rubahSekon(d);
    }

    // Mengubah waktu dari jam ke detik dan mencetak hasilnya.
    public void rubahSekon(double d) {
        waktuSek = setWaktu * 3600;
        System.out.println("ubah sekon " + waktuSek);
    }

    // Mengubah kecepatan dari km/jam menjadi m/detik.
    public void rubahKecepatan(double d) {
        Kecepatandirubah = (kecepatan * 1000) / 3600;
    }

    // Menghitung jarak tempuh dengan rumus kecepatan * waktu dan mencetak kecepatan dalam detik.
    public void hitungJarak(double d) {
        Jarak1 = Kecepatandirubah * waktuSek;
        System.out.print("Kecepatan dalam sekon: " + Kecepatandirubah);
    }

    // Menghitung jarak tempuh dalam kilometer dan mencetak hasilnya.
    public void hitungKm(double d) {
        Jarakkm = Jarak1 / 1000;
        System.out.println("Jarak KM : "  + Jarakkm);
    }

    // Menampilkan informasi lengkap tentang mobil, termasuk merek, nomor plat, warna, dan kecepatan. Memanggil method rubahSekon untuk menampilkan waktu dalam detik.
    public void displayMessage() {
        System.out.println("Mobil	anda	adalah	bermerek" + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan	mampu	menempuh	kecepatan" + kecepatan);
        rubahSekon(waktuSek);
    }
}
