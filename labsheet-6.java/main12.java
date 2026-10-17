import java.util.Scanner;
class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}
public class main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        String ageInput = sc.nextLine();
        try {
            int age = Integer.parseInt(ageInput);
            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Patient age must be between 0 and 120.");
            } 
            System.out.println("Patient successfully registered: Name = " + name + ", Age = " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid number.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Registration Error: " + e.getMessage());
        }
        sc.close();
    }
}