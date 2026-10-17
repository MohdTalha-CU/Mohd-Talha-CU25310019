import java.util.Scanner;
class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}
public class main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        String marksInput = sc.nextLine();
        try {
            int marks = Integer.parseInt(marksInput);
            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Marks must be between 0 and 100.");
            }   
            if (marks >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }   
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input entered.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Evaluation Error: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
            sc.close();
        }
    }
}