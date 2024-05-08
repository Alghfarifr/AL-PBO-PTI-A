package Tugas7;

import java.time.LocalDate;

// Deklarasi kelas PieceWorkerEmployee yang mewarisi dari kelas Employee. Ini berarti PieceWorkerEmployee adalah subkelas dari Employee dan mewarisi semua atribut dan metode yang dimiliki oleh kelas Employee.
public class PieceWorkerEmployee extends Employee {
    // menyimpan jumlah potongan/piece yang diproduksi oleh karyawan. Modifier private memastikan bahwa variabel ini hanya dapat diakses oleh metode-metode dalam kelas PieceWorkerEmployee.
    private int piecesProduced;
    // menyimpan upah per potongan/piece. Sama seperti piecesProduced, wagePerPiece juga hanya dapat diakses oleh metode dalam kelas ini.
    private double wagePerPiece;

    // Constructor dari kelas PieceWorkerEmployee. Constructor ini mengambil parameter name, noKTP, piecesProduced, wagePerPiece, dan birthDate. name, noKTP, dan birthDate dilewatkan ke constructor kelas induk (Employee) menggunakan super.
    public PieceWorkerEmployee(String name, String noKTP, int piecesProduced, double wagePerPiece, LocalDate birthDate) {
        // Memanggil constructor dari kelas induk (Employee) dengan parameter name, noKTP, dan birthDate.
        super(name, noKTP, birthDate);
        // Menginisialisasi variabel piecesProduced dengan nilai yang diberikan pada saat objek dibuat.
        this.piecesProduced = piecesProduced;
        // Menginisialisasi variabel wagePerPiece dengan nilai yang diberikan.
        this.wagePerPiece = wagePerPiece;
    }

    // Mengizinkan pengubahan nilai piecesProduced setelah objek dibuat.
    public void setPiecesProduced(int pieces) {
        this.piecesProduced = pieces;
    }

    // Metode getter untuk piecesProduced. Mengembalikan jumlah piece yang diproduksi.
    public int getPiecesProduced() {
        return piecesProduced;
    }

    public void setWagePerPiece(double wage) {
        this.wagePerPiece = wage;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    // Anotasi yang menunjukkan bahwa metode berikut (earnings) merupakan override dari metode yang ada di kelas induk.
    @Override
    // Metode untuk menghitung pendapatan total karyawan berdasarkan jumlah piece yang diproduksi dikali dengan upah per piece.
    public double earnings() {
        // Mengembalikan hasil perhitungan pendapatan.
        return piecesProduced * wagePerPiece;
    }

    // Anotasi yang menunjukkan bahwa metode berikut (toString) merupakan override dari metode yang ada di kelas induk.
    @Override
    // mengembalikan representasi string dari objek PieceWorkerEmployee, mencakup detail dari karyawan serta informasi khusus tentang jumlah piece dan upah per piece.
    public String toString() {
        // Mengembalikan string yang terformat yang mencakup representasi string dari kelas induk (Employee) serta detail piecesProduced dan wagePerPiece.
        return String.format("Piece worker employee: %s\npieces produced: %d, wage per piece: %.2f", super.toString(), getPiecesProduced(), getWagePerPiece());
    }
}
