import java.util.Scanner;
class InvalidDosageException extends Exception {
    public InvalidDosageException(String message) {
        super(message);
    }
}
public class main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String patientName = sc.nextLine(); 
        System.out.print("Enter drug name: ");
        String drugName = sc.nextLine();
        System.out.print("Enter dosage in mg: ");
        String dosageInput = sc.nextLine();
        try {
            int dosage = Integer.parseInt(dosageInput);
            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage must be between 1 mg and 1000 mg.");
            }
            System.out.println("Prescription valid: " + patientName + " - " + drugName + " (" + dosage + " mg)");
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be a valid number.");
        } catch (InvalidDosageException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
            sc.close();
        }
    }
}