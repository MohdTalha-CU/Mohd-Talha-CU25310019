import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array index to access: ");
        int index = sc.nextInt(); 
        try {
            System.out.println("Element at index " + index + " is: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and 4.");
        }
        sc.close();
    }
}