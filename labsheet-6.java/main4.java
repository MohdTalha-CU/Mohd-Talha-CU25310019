import java.util.Scanner;
public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(sc.nextLine()); 
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(sc.nextLine()); 
            int result = num1 / num2;
            System.out.println("Division Result: " + result);
            
            int[] arr = {10, 20, 30, 40, 50};
            System.out.print("Enter an array index to access: ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Element at index " + index + " is: " + arr[index]);  
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format entered.");
        } 
        sc.close();
    }
}