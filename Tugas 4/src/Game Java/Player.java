public class Player {
// untuk mewakili nama pemain, level pemain, dan kesehatan pemain.
    private String nama;
    private int level;
    private float health;
// untuk menginisialisasi nilai-nilai awal untuk nama, level, 
// dan health sesuai dengan nilai yang diberikan pada saat pembuatan objek.
    public Player(String nama, int level, float health) {
        this.nama = nama;
        this.level = level;
        this.health = health;
    }
// untuk menampilkan pesan bahwa pemain sedang melakukan serangan terhadap musuh.
    public void attack() {
        System.out.println("Player melakukan serangan terhadap musuh.");
    }
// untuk menampilkan pesan bahwa pemain sedang menyembuhkan dirinya sendiri.
    public void heal() {
        System.out.println("Player menyembuhkan diri sendiri.");
    }
// untuk meningkatkan level pemain dan menampilkan pesan yang menyatakan pemain telah naik ke level yang baru. 
// Perhatikan bahwa nilai level dinaikkan terlebih dahulu dengan operator ++ sebelum digunakan dalam string.
    public void levelUp() {
        System.out.println("Player naik ke level " + (++level) + "!");
    }
}
