public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array invoices yang berisi beberapa objek Invoice.
        Invoice[] invoices = {
            // Membuat objek Invoice untuk "Laptop" dengan kuantitas 1 dan harga per item 15.000.000.
            new Invoice("Laptop", 1, 15000000),
            // Membuat objek Invoice untuk "Mouse" dengan kuantitas 2 dan harga per item 250.000.
            new Invoice("Mouse", 2, 250000),
            // Membuat objek Invoice untuk "Keyboard" dengan kuantitas 1 dan harga per item 1.000.000.
            new Invoice("Keyboard", 1, 1000000)
        };

        // Membuat objek Employee dengan nomor registrasi 12345, nama "Endang Soekamti", gaji per bulan 20.000.000, dan array invoices yang dideklarasikan sebelumnya.
        Employee employee = new Employee(12345, "Endang Soekamti", 20000000, invoices);

        // Menampilkan representasi string dari objek Employee, yang dihasilkan oleh metode toString() dalam kelas Employee.
        System.out.println(employee);

        // Menampilkan teks "Invoice Details:" ke konsol.
        System.out.println("\nInvoice Details:");
        // Melakukan iterasi melalui setiap objek Invoice dalam array invoices milik employee dan menampilkan representasi string dari setiap faktur menggunakan metode toString() dalam kelas Invoice.
        for (Invoice invoice : employee.getInvoices()) {
            System.out.println(invoice);
        }
    }
}
