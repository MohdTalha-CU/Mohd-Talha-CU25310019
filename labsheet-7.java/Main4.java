class CounterThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
        }
    }
}
public class Main4 {
    public static void main(String[] args) {
        CounterThread t1 = new CounterThread();
        CounterThread t2 = new CounterThread();
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
    }
}