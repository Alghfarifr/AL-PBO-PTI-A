public class Main {
    public static void main(String[] args) {
    // Baris ini membuat objek player dari kelas Player dengan menggunakan konstruktor yang menerima tiga argumen: nama ("Hero"), level (1), dan kesehatan (100).
        Player player = new Player("Hero", 1, 100);
    // Baris ini membuat objek enemy dari kelas Enemy dengan menggunakan konstruktor yang menerima tiga argumen: jenis ("Monster"), kesehatan (50), dan kerusakan (10).
        Enemy enemy = new Enemy("Monster", 50, 10);
    // menggunakan konstruktor yang menerima tiga argumen: jenis senjata ("Sword"), kekuatan serangan (20), dan bonus serangan (10).
        Weapon weapon = new Weapon("Sword", 20, 10);
    // menggunakan konstruktor yang menerima satu argumen: kapasitas inventori (5).
        Inventory inventory = new Inventory(5);
    // menggunakan konstruktor yang menerima dua argumen: nama misi ("Kill Monsters") dan deskripsi misi ("Kill 10 monsters in the forest.").
        Quest quest = new Quest("Kill Monsters", "Kill 10 monsters in the forest.");
    // memanggil metode attack() pada objek player.
        player.attack();
        enemy.attack();
        weapon.attack();
        inventory.addItem("Potion");
        inventory.checkCapacity();
        quest.startQuest();
        quest.completeQuest();
    }
}