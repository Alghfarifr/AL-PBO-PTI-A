// Mendeklarasikan kelas Employee yang mengimplementasikan antarmuka Payable.
public class Employee implements Payable {
    // Mendefinisikan variabel instance registrationNumber, name, salaryPerMonth, dan invoices.
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    // Konstruktor yang menginisialisasi registrationNumber, name, salaryPerMonth, dan invoices dengan nilai yang diberikan.
    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // Mengimplementasikan metode getPayableAmount() dari antarmuka Payable untuk menghitung gaji bersih setelah mengurangi total jumlah faktur.
    @Override
    public double getPayableAmount() {
        // Mendeklarasikan variabel untuk menyimpan total jumlah faktur.
        double totalInvoiceAmount = 0;
        // Melakukan iterasi melalui setiap objek Invoice dalam array invoices
        for (Invoice invoice : invoices) {
            // Menambahkan jumlah yang harus dibayar dari setiap faktur ke totalInvoiceAmount.
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        // Mengembalikan gaji bersih dengan mengurangi total jumlah faktur dari gaji per bulan.
        return salaryPerMonth - totalInvoiceAmount;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    // Metode yang mengembalikan representasi string dari objek Employee, termasuk nomor registrasi, nama, gaji per bulan, dan gaji bersih.
    @Override
    public String toString() {
        return "Employee [Registration Number: " + registrationNumber + ", Name: " + name + ", Salary per Month: " + salaryPerMonth + ", Net Salary: " + getPayableAmount() + "]";
    }
}
