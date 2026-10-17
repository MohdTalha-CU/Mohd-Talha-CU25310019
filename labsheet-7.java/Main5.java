class TaskThread extends Thread {
    public TaskThread(String name) {
        super(name);
    }
    public void run() {
        try {
            int sleepTime = (int) (Math.random() * 501);
            Thread.sleep(sleepTime);
            System.out.println(getName() + " is executing after sleeping for " + sleepTime + " ms.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class Main5 {
    public static void main(String[] args) {
        TaskThread reader = new TaskThread("Reader");
        TaskThread writer = new TaskThread("Writer");
        TaskThread logger = new TaskThread("Logger");
        reader.start();
        writer.start();
        logger.start();
    }
}