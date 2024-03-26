public class Weapon {
    private String nama;
    private int damage;
    private int durability;
// untuk menginisialisasi nilai-nilai awal untuk nama, damage, 
// dan durability sesuai dengan nilai yang diberikan pada saat pembuatan objek.
    public Weapon(String nama, int damage, int durability) {
        this.nama = nama;
        this.damage = damage;
        this.durability = durability;
    }
// untuk menyerang dengan senjata. Jika daya tahan senjata (durability) masih lebih dari 0, 
// maka pesan akan dicetak bahwa senjata digunakan untuk menyerang, dan nilai daya tahan akan dikurangi satu. 
// Jika daya tahan sudah habis, pesan akan dicetak bahwa senjata sudah rusak.
    public void attack() {
        if (durability > 0) {
            System.out.println("Senjata " + nama + " digunakan untuk menyerang.");
            durability--;
        } else {
            System.out.println("Senjata " + nama + " sudah rusak.");
        }
    }
// untuk memperbaiki senjata. Metode ini mengatur ulang nilai daya tahan senjata menjadi 10, 
// dan mencetak pesan bahwa senjata telah diperbaiki
    public void repair() {
        System.out.println("Senjata " + nama + " diperbaiki.");
        durability = 10; 
    }
}
