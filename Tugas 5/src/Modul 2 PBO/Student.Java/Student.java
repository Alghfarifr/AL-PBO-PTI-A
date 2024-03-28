public class Student {
// untuk merepresentasikan informasi tentang seorang siswa.
    private String name;
// private dengan tipe data String yang menyimpan nama siswa.
    private int mark;
// untuk mengatur nilai atribut name dengan nilai yang diberikan.
    public void setName(String n) {
    // pernyataan yang menetapkan nilai parameter n ke atribut name, sehingga mengatur nama siswa.
        name = n;
    }
// mengambil nilai atribut name dari objek siswa.
    public String getName() {
    // pernyataan yang mengembalikan nilai dari atribut name, sehingga mengembalikan nama siswa.
        return name;
    }
//  untuk mengatur nilai atribut mark dengan nilai yang diberikan.
    public void setMark(int m) {
    // pernyataan yang menetapkan nilai parameter m ke atribut mark, sehingga mengatur nilai atau nilai siswa.
        mark = m;
    }
// untuk mengambil nilai atribut mark dari objek siswa.
    public int getMark() {
    // pernyataan yang mengembalikan nilai dari atribut mark, sehingga mengembalikan nilai atau nilai siswa.
        return mark;
    }
}
