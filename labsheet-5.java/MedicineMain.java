
class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Batch Number : " + batchNo);
        System.out.println("Price : Rs. " + price);
    }
}

public class MedicineMain {
    public static void main(String[] args) {
      
        Medicine med1 = new Medicine("Paracetamol 500mg", "B-9870", 35.50);
        Medicine med2 = new Medicine("Amoxicillin 250mg", "B-4321", 120.00);

        System.out.println("Pharmacy Inventory");
        med1.displayMedicine();
        med2.displayMedicine();
    }
}