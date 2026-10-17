import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());           
            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = Double.parseDouble(sc.nextLine());           
            if (withdrawalAmount < 0) {
                throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
            }            
            if (withdrawalAmount > balance) {
                throw new InsufficientBalanceException("Withdrawal amount exceeds available balance.");
            }   
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Current balance: " + balance); 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input entered.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
            sc.close();
        }
    }
}