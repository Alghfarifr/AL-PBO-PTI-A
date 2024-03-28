public class Vehicle {
    double load, maxLoad; 
// Mendefinisikan konstruktor untuk kelas 
    public Vehicle(double max) {
        this.maxLoad = max;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }
// mengembalikan nilai boolean yang menunjukkan apakah kotak berhasil ditambahkan atau tidak berdasarkan kapasitas beban kendaraan.
    public boolean addBox(double weight) {
    // Untuk menyimpan total beban sementara sebelum mengecek apakah kotak dapat ditambahkan ke kendaraan.
        double temp = 0.0D;
    // Menambahkan berat kotak yang ingin ditambahkan (weight) ke beban yang sudah ada 
    // (this.load) dan menyimpannya dalam variabel sementara temp.
        temp = this.load + weight;
    // Memulai blok percabangan untuk mengecek apakah total beban sementara (temp) tidak 
    // melebihi kapasitas maksimum beban kendaraan (maxLoad).
        if (temp <= maxLoad) {
    // Jika total beban sementara tidak melebihi kapasitas maksimum beban kendaraan, 
    // maka berat kotak (weight) ditambahkan ke beban kendaraan yang sudah ada (this.load).
            this.load = this.load + weight;
    // Mengembalikan nilai true
            return true;
    // Memulai blok else jika total beban sementara melebihi kapasitas maksimum beban kendaraan.
        } else {
    // Mengembalikan false untuk menandakan bahwa kotak tidak dapat 
    // ditambahkan ke kendaraan karena melebihi kapasitas maksimum beban.
            return false;
        }
    }
}