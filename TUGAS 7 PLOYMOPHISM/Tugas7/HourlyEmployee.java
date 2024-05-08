package Tugas7;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // Dua variabel instance yang menyimpan tarif upah per jam (wage) dan jumlah jam kerja (hours) dari karyawan.
    private double wage;
    private double hours;

    // menerima beberapa parameter untuk inisialisasi. Parameter ini mencakup nama, nomor KTP, upah per jam, jam kerja, dan tanggal lahir.
    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked, LocalDate birthDate) {
        // Panggilan ke konstruktor kelas induk (Employee) untuk mengatur nama, nomor KTP, dan tanggal lahir.
        super(name, noKTP, birthDate);
        // metode yang didefinisikan di bawah. Ini memastikan bahwa nilai diatur melalui metode yang mungkin mencakup validasi atau manipulasi khusus.
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    // Metode untuk mengatur wage. Tidak ada validasi khusus yang dilakukan di sini, tetapi bisa ditambahkan jika diperlukan.
    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    // Metode untuk mengatur hours. Seperti setWage, tidak ada validasi khusus yang dilakukan di sini.
    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    // Metode ini mungkin redundan jika kelas induk (Employee) sudah menyediakannya, tetapi digunakan di sini untuk mengembalikan tanggal lahir.
    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    // menghitung total gaji berdasarkan jumlah jam kerja. Jika karyawan bekerja tidak lebih dari 40 jam, gaji dihitung dengan mengalikan jam kerja dengan upah per jam. Jika lebih dari 40 jam, jam-jam lembur (jam di atas 40) dihitung dengan tarif 1.5 kali upah normal.
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) *
                    getWage() * 1.5;
    }

    // mengembalikan representasi string dari objek HourlyEmployee, termasuk informasi dari kelas induk dan juga detail tentang upah per jam dan jam kerja.
    public String toString() {
        return String.format("Hourly employee:" + super.toString() + "\nhourly wage" + getWage() + "\nhours worked:" + getHours());
    }
}
