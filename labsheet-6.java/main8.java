import java.util.Scanner;
public class main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num1 = sc.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = sc.nextInt();
            
            int result = num1 / num2;
            System.out.println("Division Result: " + result);
            try {
                int[] arr = {10, 20, 30};
                System.out.print("Enter array index to access (0-2): ");
                int index = sc.nextInt();
                
                System.out.println("Element at index " + index + " is: " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index out of bounds.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by zero is not allowed.");
        }
        sc.close();
    }
}