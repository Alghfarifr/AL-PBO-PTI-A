import java.lang.reflect.Method;
import java.util.List;
// Kelas ini merepresentasikan entitas penulis buku.
// Memiliki atribut nama yang bersifat privat.
// Memiliki konstruktor untuk inisialisasi objek dengan nama penulis.
// Menyediakan getter (getNama()) untuk mendapatkan nilai atribut nama.
class Penulis {
    private String nama;

    public Penulis(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

// Kelas ini merepresentasikan entitas buku.
// Memiliki atribut judul dan penulisList (daftar penulis) yang bersifat privat.
// Memiliki konstruktor untuk inisialisasi objek buku dengan judul dan daftar penulis.
// Menyediakan getter (getJudul() dan getPenulisList()) untuk mendapatkan nilai atribut.
class Buku {
    private String judul;
    private List<Penulis> penulisList;

    public Buku(String judul, List<Penulis> penulisList) {
        this.judul = judul;
        this.penulisList = penulisList;
    }

    public String getJudul() {
        return judul;
    }

    public List<Penulis> getPenulisList() {
        return penulisList;
    }
}

// Kelas ini merepresentasikan entitas kategori buku dalam perpustakaan.
// Memiliki atribut nama dan bukuList (daftar buku) yang bersifat privat.
// Memiliki konstruktor untuk inisialisasi objek kategori dengan nama dan daftar buku.
// Menyediakan getter (getNama() dan getBukuList()) untuk mendapatkan nilai atribut.
class Kategori {
    private String nama;
    private List<Buku> bukuList;

    public Kategori(String nama, List<Buku> bukuList) {
        this.nama = nama;
        this.bukuList = bukuList;
    }

    public String getNama() {
        return nama;
    }

    public List<Buku> getBukuList() {
        return bukuList;
    }
}

// Kelas Perpustakaan merupakan kelas utama (main class) yang berisi method main untuk menjalankan program.
// Dalam method main, dilakukan inisialisasi objek untuk penulis, buku, dan kategori.
// Pemanggilan method tampilkanBuku untuk menampilkan buku-buku dalam setiap kategori.
public class Perpustakaan {
    public static void main(String[] args) {
        // Inisialisasi Penulis
        Penulis penulis1 = new Penulis("Penulis Novega Pratama Adiputra.");
        Penulis penulis2 = new Penulis("Penulis Jostein Gaarder.");
        Penulis penulis3 = new Penulis("Penulis Pramoedya Ananta Toer.");
        Penulis penulis4 = new Penulis("Penulis A. Helwa.");
        Penulis penulis5 = new Penulis("Penulis Robin Sharma.");
        Penulis penulis6 = new Penulis("Penulis Noam Chomsky");
        Penulis penulis7 = new Penulis("Penulis Andrea Hirata");

        // Inisialisasi Buku
        List<Penulis> penulisList1 = List.of(penulis1);
        List<Penulis> penulisList2 = List.of(penulis2);
        List<Penulis> penulisList3 = List.of(penulis3);
        List<Penulis> penulisList4 = List.of(penulis4);
        List<Penulis> penulisList5 = List.of(penulis5);
        List<Penulis> penulisList6 = List.of(penulis6);
        List<Penulis> penulisList7 = List.of(penulis7);
        Buku buku1 = new Buku("Buku 1", penulisList1);
        Buku buku2 = new Buku("Buku 2", penulisList2);
        Buku buku3 = new Buku("Buku 3", penulisList3);
        Buku buku4 = new Buku("Buku 4", penulisList4);
        Buku buku5 = new Buku("Buku 5", penulisList5);
        Buku buku6 = new Buku("Buku 6", penulisList6);
        Buku buku7 = new Buku("Buku 7", penulisList7);

        // Inisialisasi Kategori
        List<Buku> teknologiList = List.of(buku1);
        List<Buku> filsafatList = List.of(buku3);
        List<Buku> sejarahList = List.of(buku5);
        List<Buku> agamaList = List.of(buku2);
        List<Buku> psikologiList = List.of(buku4);
        List<Buku> politikList = List.of(buku7       );
        List<Buku> fiksiList = List.of(buku6);

        Kategori teknologi = new Kategori("Teknologi", teknologiList);
        Kategori filsafat = new Kategori("Filsafat", filsafatList);
        Kategori sejarah = new Kategori("Sejarah", sejarahList);
        Kategori agama = new Kategori("Agama", agamaList);
        Kategori psikologi = new Kategori("Psikologi", psikologiList);
        Kategori politik = new Kategori("Politik", politikList);
        Kategori fiksi = new Kategori("Fiksi", fiksiList);

        // Tampilkan nilai dari properties entitas
        System.out.println("Daftar Buku dalam Kategori Teknologi: Buku Dasar-Dasar Teknik Informatika");
        tampilkanBuku(teknologi);

        System.out.println("\nDaftar Buku dalam Kategori Filsafat: Dunia Sophie");
        tampilkanBuku(filsafat);

        System.out.println("\nDaftar Buku dalam Kategori Sejarah: Bumi Manusia, Jejak Langkah, Anak Segala Bangsa, Rumah Kaca, Arus Balik, Mangir");
        tampilkanBuku(sejarah);

        System.out.println("\nDaftar Buku dalam Kategori Agama:  Secrets of Divine Love: Sebuah Perjalanan Spiritual yang Mendalam tentang Islam");
        tampilkanBuku(agama);

        System.out.println("\nDaftar Buku dalam Kategori Psikologi: The 5 AM Club");
        tampilkanBuku(psikologi);

        System.out.println("\nDaftar Buku dalam Kategori Politik : Politik Kuasa Media");
        tampilkanBuku(politik);

        System.out.println("\nDaftar Buku dalam Kategori Fiksi: Laskar Pelangi");
        tampilkanBuku(fiksi);

        // Implementasikan dan tampilkan untuk kategori lainnya sesuai kebutuhan
    }

// Method ini menerima objek kategori sebagai parameter.
// Digunakan untuk menampilkan informasi buku-buku dalam suatu kategori.
// Melakukan iterasi melalui daftar buku dalam kategori dan menampilkan judul buku serta daftar penulisnya.
    private static void tampilkanBuku(Kategori kategori) {
        for (Buku buku : kategori.getBukuList()) {
            System.out.println("Judul Buku: " + buku.getJudul());
            System.out.println("Penulis:");
            for (Penulis penulis : buku.getPenulisList()) {
                System.out.println("- " + penulis.getNama());
            }
            System.out.println();
        }
    }
}
