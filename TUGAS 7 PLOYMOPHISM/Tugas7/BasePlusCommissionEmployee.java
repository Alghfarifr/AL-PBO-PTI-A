package Tugas7;

import java.time.LocalDate;

// BasePlusCommissionEmployee yang merupakan subkelas dari CommissionEmployee. Ini menunjukkan bahwa BasePlusCommissionEmployee mewarisi (inherits) fungsionalitas dari CommissionEmployee.
public class BasePlusCommissionEmployee extends CommissionEmployee {
    // Mendeklarasikan variabel instance baseSalary dengan modifier private, yang berarti variabel ini hanya bisa diakses dari dalam kelas BasePlusCommissionEmployee itu sendiri.
    private double baseSalary;

    // Konstruktor dari BasePlusCommissionEmployee yang menginisialisasi objek menggunakan parameter nama, nomor KTP, total penjualan, rate komisi, gaji pokok, dan tanggal lahir.
    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary, LocalDate birthDate) {
        // Pemanggilan konstruktor kelas induk (CommissionEmployee) dengan argumen yang relevan. Ini memastikan bahwa atribut dari kelas induk diinisialisasi terlebih dahulu sebelum inisialisasi spesifik dari kelas ini.
        super(name, noKTP, sales, rate, birthDate);
        // Memanggil metode setBaseSalary dengan salary sebagai argumen untuk mengatur nilai dari baseSalary.
        setBaseSalary(salary);
    }

    // Metode setBaseSalary digunakan untuk menetapkan nilai gaji pokok. Parameter salary merupakan nilai gaji pokok yang baru.
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    // Metode getBaseSalary mengembalikan nilai gaji pokok saat ini dari objek.
    public double getBaseSalary() {
        return baseSalary;
    }

    // Metode earnings menghitung total pendapatan dengan menggabungkan gaji pokok dan penghasilan dari komisi.
    public double earnings() {
        // Mengembalikan jumlah dari gaji pokok (getBaseSalary()) dan penghasilan dari kelas induk (super.earnings()).
        return getBaseSalary() + super.earnings();
    }

    // Metode toString memberikan representasi string dari objek BasePlusCommissionEmployee.
    public String toString() {
        // Mengembalikan string yang menggambarkan objek, termasuk deskripsi dari kelas induk melalui super.toString() dan menambahkan informasi mengenai gaji pokok.
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
    }
}
