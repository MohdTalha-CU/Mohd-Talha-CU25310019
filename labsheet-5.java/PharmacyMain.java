
class Pharmacy {
    String pharmacyName;
    String location;
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name : " + pharmacyName);
        System.out.println("Location : " + location);
    }

    static void displayPharmacyCount() {
        System.out.println("Total Pharmacies Registered: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {
       
        Pharmacy p1 = new Pharmacy("City Health Pharmacy", "Dehradun");
        Pharmacy p2 = new Pharmacy("Apollo Pharmacy", "New Delhi");
        Pharmacy p3 = new Pharmacy("MedPlus Pharmacy", "Mumbai");

        System.out.println(" Pharmacy Details ");
        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();
        Pharmacy.displayPharmacyCount();
    }
}