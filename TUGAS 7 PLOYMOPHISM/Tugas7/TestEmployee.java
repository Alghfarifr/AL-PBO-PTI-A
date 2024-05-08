package Tugas7;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {
        // Membuat objek dari masing-masing subclass
        SalariedEmployee salariedEmployee = new SalariedEmployee("Sumandi", "123456789", 5000, LocalDate.of(1990, LocalDate.now().getMonthValue(), 15));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Sukijan", "987654321", 200, 45, LocalDate.of(1992, 5, 20));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Dobleh", "222333444", 15000, 0.1, LocalDate.of(1985, LocalDate.now().getMonthValue(), 10));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Tango", "555666777", 20000, 0.05, 3000, LocalDate.of(1978, 12, 25));

        // Array untuk menyimpan referensi ke objek Employee
        Employee[] employees = {salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee};

        // Menampilkan informasi dan pendapatan masing-masing employee
        for (Employee emp : employees) {
            System.out.println(emp);  // Memanggil toString()
            System.out.println("Monthly Earnings: " + emp.monthlyEarnings());
            System.out.println();
        }
    }
}
