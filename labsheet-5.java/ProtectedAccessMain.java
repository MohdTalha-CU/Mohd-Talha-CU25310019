class HospitalStaff {
    protected int staffId;
    protected String staffName;

    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    protected void displayStaff() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
    }
}
class Pharmacist extends HospitalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        System.out.println("Pharmacist Details:");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("License No: " + licenseNo);
        displayStaff();
    }
}
public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist(101, "Mohd Talha", "PH12345");
        p.displayPharmacist();
    }
}