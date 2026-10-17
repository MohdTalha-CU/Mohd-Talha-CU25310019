public class Main15 {
    public static void main(String[] args) {
        final Object Lock1 = new Object();
        final Object Lock2 = new Object();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (Lock1) {
                    System.out.println("Thread 1: Holding Lock1...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Thread 1: Waiting for Lock2...");
                    synchronized (Lock2) {
                        System.out.println("Thread 1: Holding Lock1 & Lock2...");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (Lock1) {
                    System.out.println("Thread 2: Holding Lock1...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                    System.out.println("Thread 2: Waiting for Lock2...");
                    synchronized (Lock2) {
                        System.out.println("Thread 2: Holding Lock1 & Lock2...");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}