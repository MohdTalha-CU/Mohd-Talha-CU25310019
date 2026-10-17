import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        String strNumber = sc.nextLine();
        try {
            int convertedNumber = Integer.parseInt(strNumber);
            System.out.println("Successfully converted to integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: The provided string does not contain a valid integer.");
        }
        sc.close();
    }
}