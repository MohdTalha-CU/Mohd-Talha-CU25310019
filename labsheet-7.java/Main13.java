class SharedBuffer {
    private int data;
    private boolean hasData = false;
    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }
    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
    }
}
class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer b) {
        buffer = b;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
        }
    }
}
class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer b) {
        buffer = b;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();
        }
    }
}
public class Main13 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);  
        p.start();
        c.start();
    }
}