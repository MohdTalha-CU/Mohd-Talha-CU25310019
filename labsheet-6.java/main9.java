import java.util.Scanner;
public class main9 {
    static void method3(int denominator) {
        int result = 100 / denominator;
        System.out.println("Calculation successful. Result: " + result);
    }
    static void method2(int denominator) {
        method3(denominator);
    }
    static void method1(int denominator) {
        method2(denominator);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a denominator: ");
        int denominator = sc.nextInt();
        try {
            method1(denominator);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main(): Division by zero is not allowed.");
        }
        sc.close();
    }
}