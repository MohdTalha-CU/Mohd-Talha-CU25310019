public class Main1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Alice");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Main1 t1 = new Main1();
        t1.start();
    }
}