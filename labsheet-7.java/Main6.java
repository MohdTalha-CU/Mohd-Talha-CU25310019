class StatusThread extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class Main6 {
    public static void main(String[] args) throws InterruptedException {
        StatusThread t1 = new StatusThread();
        System.out.println("Before start(), isAlive: " + t1.isAlive());
        t1.start();
        System.out.println("After start(), isAlive: " + t1.isAlive());
        t1.join();
        System.out.println("After thread finishes, isAlive: " + t1.isAlive());
    }
}