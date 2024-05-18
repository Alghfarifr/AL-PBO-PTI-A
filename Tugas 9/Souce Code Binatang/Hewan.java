// Mendeklarasikan kelas Hewan yang mengimplementasikan antarmuka MakhlukHidup dan Identitas.
public class Hewan implements MakhlukHidup, Identitas {
    // Mendeklarasikan variabel instance nama dan umur.
    private String nama;
    private int umur;

    // Konstruktor untuk kelas Hewan yang menerima parameter nama dan umur untuk menginisialisasi variabel instance.
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Mengimplementasikan metode makan, berjalan, dan bersuara dari interface MakhlukHidup
    @Override
    public void makan() {
        System.out.println("Hewan makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Hewan jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Hewan suaranya nggak jelas");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama hewan: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur hewan: " + this.umur);
    }
}
