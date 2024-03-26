public class Enemy {
// Baris ini mendeklarasikan kelas Enemy.
    private String jenis;
    private float health;
    private int damage;
// Baris ini mendeklarasikan tiga variabel instance: jenis (tipe String), health (tipe float), dan damage (tipe int). Ini adalah atribut-atribut yang digunakan untuk mewakili jenis musuh, kesehatan, dan kerusakan musuh.
    public Enemy(String jenis, float health, int damage) {
        this.jenis = jenis;
        this.health = health;
        this.damage = damage;
    }
// konstruktor kelas Enemy. Ketika sebuah objek Enemy dibuat, konstruktor ini digunakan untuk menginisialisasi nilai-nilai awal untuk jenis, health, dan damage sesuai dengan nilai yang diberikan pada saat pembuatan objek.
// // Metode attack() digunakan untuk menampilkan pesan bahwa musuh melakukan serangan ke pemain.
    public void attack() {
        System.out.println("Musuh melakukan serangan ke player.");
    }
// untuk mengurangi kesehatan musuh sesuai dengan jumlah kerusakan yang diberikan sebagai argumen. Ini mengurangi nilai health musuh dan mencetak pesan yang menampilkan kesehatan musuh yang tersisa.
    public void takeDamage(int amount) {
        health -= amount;
        System.out.println("Kesehatan musuh berkurang menjadi " + health);
    }
// untuk memainkan animasi kematian musuh. Ini hanya mencetak pesan bahwa animasi kematian musuh sedang dimainkan.
    public void deathAnimation() {
        System.out.println("Memainkan animasi kematian musuh.");
    }
}
