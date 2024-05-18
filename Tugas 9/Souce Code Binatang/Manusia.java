// Mendeklarasikan kelas Manusia yang mengimplementasikan antarmuka MakhlukHidup dan Identitas.
public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    // Mendeklarasikan variabel instance nama dan umur.
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    // Mengimplementasikan metode makan, berjualan, dan bersuara dari interface MakhlukHidup
    @Override
    public void makan() {
        System.out.println("Makan pakai sendok dan garpu");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya merdu");
    }

    @Override
    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }

}