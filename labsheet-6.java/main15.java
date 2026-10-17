import java.util.Scanner;
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}
class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}
public class main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();
            System.out.print("Enter available quantity: ");
            int availableQuantity = Integer.parseInt(sc.nextLine());
             System.out.print("Enter required quantity: ");
            int requiredQuantity = Integer.parseInt(sc.nextLine());
    
            if (availableQuantity < 0 || requiredQuantity < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative.");
            }
            if (requiredQuantity > availableQuantity) {
                throw new InsufficientMedicineStockException("Required quantity exceeds available stock.");
            }
            int remainingQuantity = availableQuantity - requiredQuantity;
            System.out.println("Order processed successfully. Medicine: " + medicineName);
            System.out.println("Remaining stock: " + remainingQuantity); 
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input entered for quantity.");
        } catch (InvalidQuantityException e) {
            System.out.println("Quantity Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Stock Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
            sc.close();
        }
    }
}