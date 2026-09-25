
class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        String result; 

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }
        return result;
    }
}
public class EligibilityMain {
    public static void main(String[] args) {
        Medicine med = new Medicine("Strong Painkiller", 18);
        
        System.out.println(" Medicine Eligibility Check ");
        System.out.println("Medicine: " + med.medicineName);
        System.out.println("Minimum Age Required: " + med.ageLimit);

        int patient1Age = 25;
        String status1 = med.checkEligibility(patient1Age);
        System.out.println("Patient Age " + patient1Age + " -> " + status1);

        int patient2Age = 14;
        String status2 = med.checkEligibility(patient2Age);
        System.out.println("Patient Age " + patient2Age + " -> " + status2);
    }
}