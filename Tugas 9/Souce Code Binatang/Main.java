// Mendeklarasikan kelas Main
public class Main {
    // Metode utama yang menjadi titik awal eksekusi program.
    public static void main(String[] args) {

        // Membuat objek Hewan bernama hewan dengan nama "Kucing" dan umur 4.
        Hewan hewan = new Hewan("Kucing", 4);
        // Menampilkan teks "Hewan:" ke konsol.
        System.out.println("Hewan:");
        // Memanggil metode makan(), berjalan(), bersuara(), tampilkanNama(), dan tampilkanUmur() pada objek hewan.
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();

        // Membuat objek Hewan baru bernama burung dengan nama "Burung" dan umur 2.
        Hewan burung = new Hewan("Burung", 2);
        // Menampilkan teks "Hewan baru:" ke konsol.
        System.out.println("\nHewan baru:");
        // Memanggil metode makan(), berjalan(), bersuara(), tampilkanNama(), dan tampilkanUmur() pada objek burung.
        burung.makan();
        burung.berjalan();
        burung.bersuara();
        burung.tampilkanNama();
        burung.tampilkanUmur();

        // Membuat objek Manusia bernama manusia dengan nama "Al" dan umur 20.
        Manusia manusia = new Manusia("Al", 20);
        // Menampilkan teks "Manusia:" ke konsol.
        System.out.println("\nManusia:");
        // Memanggil metode makan(), berjalan(), bersuara(), tampilkanNama(), dan tampilkanUmur() pada objek manusia.
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();

        // Membuat objek Manusia baru bernama manusiaBaru dengan nama "Budi" dan umur 25.
        Manusia manusiaBaru = new Manusia("Budi", 25);
        // // Menampilkan teks "ManusiaBaru:" ke konsol.
        System.out.println("\nManusia baru:");
        // Memanggil metode makan(), berjalan(), bersuara(), tampilkanNama(), dan tampilkanUmur() pada objek manusia.
        manusiaBaru.makan();
        manusiaBaru.berjalan();
        manusiaBaru.bersuara();
        manusiaBaru.tampilkanNama();
        manusiaBaru.tampilkanUmur();
    }
}