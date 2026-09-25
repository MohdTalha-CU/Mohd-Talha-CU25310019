
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs. " + amount + " successfully.");
        }
    }
    public void withdraw(double amount) {
        boolean success; 

        if (amount > balance) {
            success = false;
            System.out.println("Withdrawal Failed: Insufficient balance. Attempted to withdraw Rs. " + amount);
        } else {
            balance -= amount;
            success = true;
            System.out.println("Withdrawn Rs. " + amount + " successfully.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccount() {
        System.out.println("Account Number : " + accountNo);
        System.out.println("Holder Name : " + accountHolderName);
        System.out.println("Current Balance: Rs. " + balance);
    }
}
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC-987654321", "Aditya", 5000.0);

        System.out.println(" Initial Account Details ");
        myAccount.displayAccount();

        System.out.println(">> Attempting to deposit Rs. 2000...");
        myAccount.deposit(2000.0);
        
        System.out.println("\n>> Attempting to withdraw Rs. 10000...");
        myAccount.withdraw(10000.0);

        System.out.println("\n>> Attempting to withdraw Rs. 1500...");
        myAccount.withdraw(1500.0);

        System.out.println("\nChecking balance via getter: Rs. " + myAccount.getBalance());
        System.out.println("\n--- Final Account Details ---");
        myAccount.displayAccount();
    }
}