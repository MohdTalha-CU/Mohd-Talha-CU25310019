class SummationThread extends Thread {
    long sum = 0;
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        System.out.println("Calculation completed. Sum: " + sum);
    }
}
public class Main7 {
    public static void main(String[] args) {
        SummationThread t1 = new SummationThread();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Task finished");
    }
}