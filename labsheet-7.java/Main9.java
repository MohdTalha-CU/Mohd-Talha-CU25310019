class RacedThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (Priority " + getPriority() + ") - step " + i);
        }
    }
}
public class Main9 {
    public static void main(String[] args) {
        RacedThread t1 = new RacedThread();
        RacedThread t2 = new RacedThread();
        RacedThread t3 = new RacedThread();
        RacedThread t4 = new RacedThread();
        RacedThread t5 = new RacedThread();

        t1.setName("Thread-A");
        t2.setName("Thread-B");
        t3.setName("Thread-C");
        t4.setName("Thread-D");
        t5.setName("Thread-E");
        
        t1.setPriority(2);
        t2.setPriority(4);
        t3.setPriority(6);
        t4.setPriority(8);
        t5.setPriority(10);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}