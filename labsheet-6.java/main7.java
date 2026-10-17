import java.util.Scanner;
public class main7 {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18. Not eligible.");
        }
        System.out.println("Age verification successful. Age: " + age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        sc.close();
    }
}