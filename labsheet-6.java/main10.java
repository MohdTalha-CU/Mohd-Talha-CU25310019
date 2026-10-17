import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter student marks (0-100): ");
        int marks = sc.nextInt();      
        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid marks entered. Marks must be between 0 and 100.");
            }
            System.out.println("Marks successfully recorded: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } 
        sc.close();
    }
}