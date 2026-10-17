public class Main3 {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread(); 
        System.out.println("Original thread name: " + currentThread.getName());
        System.out.println("Original thread priority: " + currentThread.getPriority());
        currentThread.setName("JavaMainThread");
        System.out.println("Updated thread name: " + currentThread.getName());
    }
}