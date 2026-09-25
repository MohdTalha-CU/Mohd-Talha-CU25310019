class MedicalStaff {
    protected int staffId;
    protected String staffName;
    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}
class Doctor extends MedicalStaff {
    private String specialization;
    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }
    void displayDoctor() {
        System.out.println("Doctor Details:");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}
class Pharmacist extends MedicalStaff {
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
    }
}
public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor d = new Doctor(101, "Dr. Ayesha", "Cardiology");
        Pharmacist p = new Pharmacist(102, "Mohd Talha", "PH12345");
        d.displayDoctor();
        System.out.println();
        p.displayPharmacist();
    }
}