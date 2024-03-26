import java.util.List;
import java.util.ArrayList;

public class Inventory {
// untuk menyimpan daftar item dalam inventori, sedangkan capacity digunakan untuk menentukan kapasitas maksimum inventori.
    private List<String> items;
    private int capacity;
// Ketika sebuah objek Inventory dibuat, konstruktor ini digunakan untuk menginisialisasi nilai kapasitas inventori 
// dan membuat instansiasi objek ArrayList untuk menyimpan item-item dalam inventori.
    public Inventory(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }
// untuk menambahkan item ke dalam inventori. 
// Jika jumlah item dalam inventori belum mencapai kapasitas maksimum, item baru akan ditambahkan ke dalam list 
// items. Jika inventori sudah penuh, pesan akan dicetak.
    public void addItem(String item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println("Item " + item + " ditambahkan ke inventori.");
        } else {
            System.out.println("Inventori sudah penuh, tidak bisa menambahkan item lagi.");
        }
    }
// untuk menghapus item dari inventori. Jika item yang dimaksud ada dalam inventori, item tersebut akan dihapus dari list items. Jika item tidak ditemukan, pesan akan dicetak.
    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
            System.out.println("Item " + item + " dihapus dari inventori.");
        } else {
            System.out.println("Item " + item + " tidak ditemukan dalam inventori.");
        }
    }
// untuk mencetak kapasitas maksimum inventori dan jumlah item yang saat ini ada dalam inventori.
    public void checkCapacity() {
        System.out.println("Kapasitas inventori: " + capacity);
        System.out.println("Jumlah item dalam inventori: " + items.size());
    }
}
