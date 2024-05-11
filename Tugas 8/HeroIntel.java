// merupakan subkelas dari kelas Hero. Ini berarti HeroIntel akan mewarisi semua properti dan metode dari kelas Hero.
public class HeroIntel extends Hero {
    // deklarasi variabel instance type dengan tipe data String. Variabel ini akan digunakan untuk menentukan jenis (type) dari hero.
    public String type;

    // deklarasi konstruktor untuk kelas HeroIntel. Konstruktor ini menerima dua parameter, yaitu name (nama hero) dan health (kesehatan hero). Ketika objek HeroIntel dibuat, konstruktor ini akan dipanggil untuk menginisialisasi objek.
    public HeroIntel(String name, double health) {
        // menggunakan kata kunci super. Ini dilakukan untuk menginisialisasi properti name dan health dari kelas Hero dengan nilai yang diterima dari konstruktor HeroIntel.
        super(name, health);
        // menginisialisasi variabel type dari kelas HeroIntel dengan nilai string "Intel", menandakan bahwa jenis hero ini adalah "Intel".
        this.type = "Intel";
    }

    // deklarasi metode display() yang akan menampilkan informasi tentang hero.
    public void display() {
        // mencetak nama hero (yang diambil dari kelas Hero menggunakan metode getName()), diikuti oleh jenis hero (type) dan teks tambahan "Hero.".
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}