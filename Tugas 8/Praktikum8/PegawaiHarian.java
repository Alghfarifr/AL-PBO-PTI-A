package Praktikum8;

// merupakan turunan dari kelas Pegawai. Artinya, PegawaiHarian akan mewarisi semua atribut dan metode yang ada dalam kelas Pegawai.
public class PegawaiHarian extends Pegawai {
    // untuk menyimpan upah per jam pegawai.
    private double upahPerJam;
    // untuk menyimpan total jam kerja pegawai.
    private int totalJam;

    // menerima empat parameter: nama, noKTP, upahPerJam, dan totalJam. Konstruktor ini menginisialisasi objek 
    // PegawaiHarian dengan nilai-nilai yang diberikan.
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        // menerima dua parameter nama dan noKTP. Ini digunakan untuk menginisialisasi atribut dari kelas induk.
        super(nama, noKTP);
        // Menginisialisasi atribut upahPerJam dengan nilai yang diterima dari parameter konstruktor.
        this.upahPerJam = upahPerJam;
        // Menginisialisasi atribut totalJam dengan nilai yang diterima dari parameter konstruktor.
        this.totalJam = totalJam;
    }

    // metode getter untuk mendapatkan nilai atribut upahPerJam.
    public double getUpahPerJam() {
        return upahPerJam;
    }

     // metode setter untuk mengatur nilai atribut upahPerJam.
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }    

    // metode getter untuk mendapatkan nilai atribut totalJam.
    public int getTotalJam() {
        return totalJam;
    }


    // metode setter untuk mengatur nilai atribut totalJam.
    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    // anotasi yang menunjukkan bahwa metode berikutnya akan meng-overide metode dari kelas induk.
    @Override
    // Metode ini menghitung gaji pegawai berdasarkan total jam kerja. Jika total jam kurang dari atau sama dengan 40, 
    // maka gaji dihitung dengan mengalikan upah per jam dengan total jam. Jika total jam melebihi 40, maka gaji 
    // dihitung dengan menambahkan gaji untuk 40 jam pertama dengan gaji untuk jam tambahan (dengan faktor 1.5).
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            return (40 * upahPerJam) + ((totalJam - 40) * upahPerJam * 1.5);
        }
    }

    @Override
    // Metode ini mengembalikan representasi string dari objek PegawaiHarian, termasuk informasi seperti nama, 
    // nomor KTP, upah per jam, dan total jam kerja.
    public String toString() {
        return super.toString() + ", Upah Per Jam: " + upahPerJam + ", Total Jam: " + totalJam;
    }
}
