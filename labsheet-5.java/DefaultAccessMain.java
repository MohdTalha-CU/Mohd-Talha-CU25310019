class Pharmacy {
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Aspirin";
        price = 15.5;
    }
    void displayMedicine() {
        System.out.println("Medicine: " + medicineName + " | Price: Rs. " + price);
    }
}
public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy();
        p.displayMedicine();
        p.medicineName = "Crocin";
        p.price = 20.0;
        System.out.println("Directly Accessed Name: " + p.medicineName);
        System.out.println("Directly Accessed Price: Rs. " + p.price);
        p.displayMedicine();
    }
}