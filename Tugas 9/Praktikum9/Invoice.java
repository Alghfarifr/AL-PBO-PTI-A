// Mendeklarasikan kelas Invoice yang mengimplementasikan antarmuka Payable.
public class Invoice implements Payable {
    // Mendefinisikan variabel instance productName, quantity, dan pricePerItem.
    private String productName;
    private Integer quantity;
    private Integer pricePerItem;

    // Konstruktor yang menginisialisasi productName, quantity, dan pricePerItem dengan nilai yang diberikan.
    public Invoice(String productName, Integer quantity, Integer pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Mengimplementasikan metode getPayableAmount() dari antarmuka Payable untuk menghitung total harga berdasarkan quantity dan pricePerItem.
    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPricePerItem() {
        return pricePerItem;
    }

    // Metode yang mengembalikan representasi string dari objek Invoice, termasuk nama produk, kuantitas, harga per item, dan total harga.
    @Override
    public String toString() {
        return "Product: " + productName + ", Quantity: " + quantity + ", Price per Item: " + pricePerItem + ", Total: " + getPayableAmount();
    }
}
