package Tugas7;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Kode ini membuat objek untuk setiap jenis karyawan (SalariedEmployee, HourlyEmployee, dsb.) dengan parameter spesifik seperti nama, ID, gaji/honor, dan tanggal lahir.
        SalariedEmployee salariedEmployee = new SalariedEmployee("Sumandi", "135", 800.00, LocalDate.of(1980, Month.JANUARY, 15));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Sukijan", "234", 16.75, 40, LocalDate.of(1980, Month.JANUARY, 15));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Dobleh", "145", 10000, .06, LocalDate.of(1985, Month.MARCH, 25));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Tango", "234", 5000, .04, 300, LocalDate.of(1975, Month.APRIL, 10));
        PieceWorkerEmployee pieceWorker = new PieceWorkerEmployee("Budi", "9876", 120, 50.0, LocalDate.of(1990, Month.FEBRUARY, 12));

        CommissionEmployee ce = new CommissionEmployee("Mulyanto", "123456789", 10000, 0.1, LocalDate.of(1985, Month.MARCH, 25));
        HourlyEmployee he = new HourlyEmployee("Sumardi", "987654321", 50, 42, LocalDate.of(1980, Month.JANUARY, 15));
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Sukiyem", "192837465", 5000, 0.05, 300, LocalDate.of(1975, Month.APRIL, 10));

        // Menampilkan informasi dan penghasilan setiap karyawan secara individual menggunakan metode earnings() yang akan menghitung gaji berdasarkan jenis karyawan.
        System.out.println("Employees processed individually:\n");
        System.out.printf("%s\nEarnings: $%,.2f\n\n", salariedEmployee, salariedEmployee.earnings());
        System.out.printf("%s\nEarnings: $%,.2f\n\n", hourlyEmployee, hourlyEmployee.earnings());
        System.out.printf("%s\nEarnings: $%,.2f\n\n", commissionEmployee, commissionEmployee.earnings());
        System.out.printf("%s\nEarnings: $%,.2f\n\n", basePlusCommissionEmployee, basePlusCommissionEmployee.earnings());
        System.out.printf("%s\nEarnings: $%,.2f\n\n", pieceWorker, pieceWorker.earnings());

        // Membuat array employees yang berisi semua objek karyawan yang telah dibuat.
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee, pieceWorker, ce, he, bce};

        // Menampilkan dan menghitung gaji karyawan menggunakan konsep polimorfisme, memungkinkan pemanggilan metode earnings() yang spesifik untuk jenis objek yang sebenarnya, meskipun melalui referensi tipe Employee.
        System.out.println("Employees processed using polymorphism:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            // Memeriksa apakah objek saat ini adalah BasePlusCommissionEmployee. Jika iya, gaji dasarnya dinaikkan sebesar 10% dan menampilkan gaji baru.
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("New base salary after 10%% raise: $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("Earnings: $%,.2f\n\n", currentEmployee.earnings());
        }
        // Melakukan iterasi melalui array employees dan menampilkan nama kelas dari setiap objek, yang memberikan informasi tentang tipe karyawan yang sebenarnya.
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
