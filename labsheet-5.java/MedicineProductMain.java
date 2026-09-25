
class MedicineProduct {
    private String medicineName;
    private String batchNo;
    private double price;

    MedicineProduct(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }
    public String getMedicineName() {
        return medicineName;
    }
    public String getBatchNo() {
        return batchNo;
    }
    public double getPrice() {
        return price;
    }
    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void displayProduct() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Batch Number : " + batchNo);
        System.out.println("Price : Rs. " + price);
    }
}
public class MedicineProductMain {
    public static void main(String[] args) {
        MedicineProduct med = new MedicineProduct("Ibuprofen 400mg", "IB-2026", 45.00);
        System.out.println(" Initial Product Details ");
        med.displayProduct();
        System.out.println("Updating price and batch number...");
        med.setPrice(55.50);
        med.setBatchNo("IB-2027");
        System.out.println("New price retrieved via getter: Rs. " + med.getPrice());
        
        System.out.println(" Updated Product Details ");
        med.displayProduct();
    }
}