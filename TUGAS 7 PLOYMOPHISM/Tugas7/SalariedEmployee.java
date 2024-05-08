package Tugas7;

import java.time.LocalDate;

// Ini mendefinisikan kelas SalariedEmployee yang merupakan subkelas dari kelas Employee. Ini berarti SalariedEmployee mewarisi sifat-sifat dan metode-metode dari kelas Employee.
public class SalariedEmployee extends Employee {
    // Deklarasi variabel weeklySalary untuk menyimpan gaji mingguan karyawan. private berarti variabel ini hanya dapat diakses dari dalam kelas SalariedEmployee itu sendiri.
    private double weeklySalary; // gaji/minggu

    // Constructor ini menginisialisasi objek SalariedEmployee. super(name, noKTP, birthDate) memanggil constructor dari kelas induk (Employee), mengirimkan nama, nomor KTP, dan tanggal lahir ke sana. setWeeklySalary(salary) menginisialisasi gaji mingguan.
    public SalariedEmployee(String name, String noKTP, double salary, LocalDate birthDate) {
        super(name, noKTP, birthDate);
        setWeeklySalary(salary);
    }

    // Metode ini menetapkan nilai untuk weeklySalary. Parameter salary merupakan nilai yang diterima dan diset pada field weeklySalary.
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    // Metode ini mengembalikan nilai dari weeklySalary, memungkinkan akses terhadap nilai gaji mingguan karyawan dari luar kelas ini.
    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Metode ini menghitung dan mengembalikan pendapatan karyawan, yang dalam kasus ini sama dengan weeklySalary.
    public double earnings() {
        return getWeeklySalary();
    }

    // Mengembalikan tanggal lahir karyawan. Asumsi di sini adalah bahwa birthDate merupakan field yang diwarisi dari kelas Employee.
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Ini mengeset tanggal lahir karyawan. Namun, ada kesalahan karena tidak ada metode extracted yang didefinisikan dalam kode ini. Mungkin seharusnya ini adalah this.birthDate = birthDate;.
    public void setBirthDate(LocalDate birthDate) {
        extracted(birthDate);
    }

    // Metode ini mengoverride metode toString() dari kelas Employee untuk menyediakan representasi string dari objek SalariedEmployee. Ini menggunakan super.toString() untuk memanggil implementasi toString() dari kelas Employee, dan menambahkan informasi tentang gaji mingguan karyawan.
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
