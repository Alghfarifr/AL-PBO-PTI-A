package Tugas7;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    // Variabel untuk menyimpan total penjualan kotor.
    private double grossSales;
    // Variabel untuk menyimpan tingkat komisi.
    private double commissionRate;

    // Konstruktor ini menerima parameter untuk nama, nomor KTP, penjualan, rate komisi, dan tanggal lahir. Parameter ini digunakan untuk menginisialisasi objek.
    public CommissionEmployee(String name, String noKTP, double sales, double rate, LocalDate birthDate) {
        // Pemanggilan super ini menginisialisasi bagian dari objek yang merupakan instance dari kelas dasar Employee menggunakan nama, nomor KTP, dan tanggal lahir
        super(name, noKTP, birthDate);
        // Metode ini mengatur nilai dari grossSales.
        setGrossSales(sales);
        // Metode ini mengatur nilai dari commissionRate.
        setCommissionRate(rate);
    }

    // Mengembalikan tanggal lahir.
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // Menetapkan nilai grossSales.
    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    
    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Menghitung pendapatan dengan mengalikan grossSales dengan commissionRate.
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // Metode ini mengembalikan representasi string dari objek CommissionEmployee, menggunakan juga toString() dari kelas dasar Employee untuk menyertakan informasi nama, no KTP, dan tanggal lahir, kemudian menambahkan detail tentang penjualan kotor dan tingkat komisi.
    public String toString() {
        return String.format("Commision employee:" + super.toString() + "\ngross sales:" + getGrossSales() + "\ncommission rate" + getCommissionRate());
    }
}
