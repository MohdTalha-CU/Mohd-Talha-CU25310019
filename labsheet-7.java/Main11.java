class BankAccount {
    int balance = 2000;
    public synchronized void withdraw(int amount) {
        int currentBalance = balance;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        balance = currentBalance - amount;
    }
}
class CustomerThread extends Thread {
    BankAccount account;

    CustomerThread(BankAccount account) {
        this.account = account;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.withdraw(1);
        }
    }
}
public class Main11 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount();
        CustomerThread t1 = new CustomerThread(sharedAccount);
        CustomerThread t2 = new CustomerThread(sharedAccount);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Expected final balance: 0");
        System.out.println("Actual final balance: " + sharedAccount.balance);
    }
}