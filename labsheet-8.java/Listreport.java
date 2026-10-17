import java.util.ArrayList;
import java.util.ListIterator;
public class Listreport {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("Data Structures");
        courses.add("Operating Systems");
        ListIterator<String> iterator = courses.listIterator();
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            System.out.println("Index " + iterator.nextIndex() + ": " + iterator.next());
        }
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println("Index " + iterator.previousIndex() + ": " + iterator.previous());
        }
    }
}