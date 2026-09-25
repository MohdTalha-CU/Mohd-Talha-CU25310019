
class Hospital {
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "Default Hospital";
        hospitalCode = "HOSP-000";
    }
    public void displayHospital() {
        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Hospital Code : " + hospitalCode);
    }
}
public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital h1 = new Hospital();

        System.out.println(" Initial State ");
        h1.displayHospital();
        h1.hospitalName = "Doon Government Hospital";
        h1.hospitalCode = "DGH-101";

        System.out.println(" After Direct Public Access Modification ");
        h1.displayHospital();
    }
}