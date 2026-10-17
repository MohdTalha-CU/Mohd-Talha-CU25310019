public class Main2 implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Bob");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Main2 obj = new Main2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}