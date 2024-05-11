// Mendefinisikan variabel instance name dengan tipe data String yang bersifat private, artinya hanya dapat diakses dalam kelas Hero itu sendiri.
public class Hero {
    // Mendefinisikan variabel instance health dengan tipe data double yang bersifat private.
    private String name;
    // Mendefinisikan variabel instance health dengan tipe data double yang bersifat private.
    private double health;

    // Mendefinisikan sebuah konstruktor untuk kelas Hero yang menerima dua parameter yaitu name (nama) dengan tipe data String dan health (kesehatan) dengan tipe data double.
    Hero(String name, double health) {
        // Menginisialisasi variabel instance name dengan nilai dari parameter name yang diterima oleh konstruktor.
        this.name = name;
        // Menginisialisasi variabel instance health dengan nilai dari parameter health yang diterima oleh konstruktor.
        this.health = health;
    }

    // Mendefinisikan sebuah metode publik getHealth() yang mengembalikan nilai dari variabel instance health.
    public double getHealth() {
        return this.health;
    }

    // Mendefinisikan sebuah metode publik setName() yang menerima parameter name dan mengubah nilai dari variabel instance name.
    public void setHealth(double health) {
        this.health = health;
    }

    // Mendefinisikan sebuah metode publik getName() yang mengembalikan nilai dari variabel instance name.
    public String getName() {
        return this.name;
    }

    // Mendefinisikan sebuah metode publik setHealth() yang menerima parameter health dan mengubah nilai dari variabel instance health.
    public void setName(String name) {
        this.name = name;
    }
    
    // Mendefinisikan sebuah metode publik display() yang tidak mengembalikan nilai (void) dan bertujuan untuk menampilkan informasi tentang objek Hero.
    public void display() {
        // Menampilkan nama hero dan pesan bahwa hero tersebut adalah hero reguler ke konsol.
        System.out.println(this.name + " is a regular hero.");
    }
}
