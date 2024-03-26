public class Quest {
    private String nama;
    private String deskripsi;
    private boolean status;
// untuk menginisialisasi nilai-nilai awal untuk nama, deskripsi, dan status. status diatur sebagai false 
// untuk menunjukkan bahwa quest belum dimulai.
    public Quest(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.status = false;
    }
// untuk memulai quest. Ini mengatur status quest menjadi true dan mencetak pesan yang menyatakan bahwa 
// quest dengan nama tertentu telah dimulai.
    public void startQuest() {
        status = true;
        System.out.println("Quest " + nama + " dimulai!");
    }
// untuk menyelesaikan quest. Ini mengatur status quest menjadi false dan mencetak pesan yang menyatakan 
// bahwa quest dengan nama tertentu telah selesai.
    public void completeQuest() {
        status = false;
        System.out.println("Quest " + nama + " selesai!");
    }
// untuk memeriksa status quest. Metode ini mengembalikan nilai true jika quest telah dimulai (status = true) 
// dan false jika belum dimulai (status = false).
    public boolean checkStatus() {
        return status;
    }
}
