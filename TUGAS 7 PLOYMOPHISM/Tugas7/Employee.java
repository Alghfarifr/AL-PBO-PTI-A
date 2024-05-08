// package Tugas7; mendefinisikan paket di mana kelas ini berada, yang membantu dalam pengorganisasian kode.
// import java.time.LocalDate; mengimpor kelas LocalDate dari pustaka Java untuk mengelola tanggal.
package Tugas7;
import java.time.LocalDate;

// public membuat kelas dapat diakses dari kelas lain.
// abstract menandakan bahwa kelas ini abstrak dan tidak dapat diinstansiasi secara langsung, tetapi harus diwariskan oleh kelas lain.
// Employee adalah nama kelas.
public abstract class Employee {

// private String name; adalah variabel untuk menyimpan nama karyawan, hanya dapat diakses dalam kelas Employee.
// private String noKTP; adalah variabel untuk menyimpan nomor KTP karyawan, juga bersifat private.
// protected static LocalDate birthDate; adalah variabel statis untuk menyimpan tanggal lahir. Karena statis, nilai ini sama untuk semua instance kelas ini atau turunannya. protected memungkinkan akses dari kelas turunan.
    private String name;
    private String noKTP;
    protected static LocalDate birthDate;

    // Konstruktor ini digunakan untuk inisialisasi objek Employee.
    // this.name = name; dan this.noKTP = noKTP; mengatur nilai variabel instance name dan noKTP.
    // extracted(birthDate); memanggil metode extracted untuk mengatur tanggal lahir.
    public Employee(String name, String noKTP, LocalDate birthDate) {
        this.name = name;
        this.noKTP = noKTP;
        extracted(birthDate);
    }

    // Metode ini mengatur nilai dari variabel birthDate dan mengembalikan nilai yang telah diset.
    protected LocalDate extracted(LocalDate birthDate) {
        return Employee.birthDate = birthDate;
    }

    // Metode ini digunakan untuk mengambil nilai dari variabel instance masing-masing.
    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }
    
    // Mengatur tanggal lahir karyawan.
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        extracted(birthDate);
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan. Biasanya digunakan untuk menghitung pendapatan karyawan.
    public abstract double earnings();

    // Metode ini menghitung pendapatan bulanan dengan menambahkan bonus jika bulan saat ini adalah bulan lahir karyawan.
    public double monthlyEarnings() {
        double bonus = 0;
        if (LocalDate.now().getMonth() == birthDate.getMonth()) {
            bonus = 100000;
        }
        return earnings() + bonus;
    }

    // Mengembalikan representasi string dari objek Employee, yang mencakup nama, nomor KTP, dan tanggal lahir.
    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), getBirthDate());
    }
}

