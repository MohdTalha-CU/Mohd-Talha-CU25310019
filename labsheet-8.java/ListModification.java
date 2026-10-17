import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListModification {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        System.out.println("Original List: " + items); 
        ListIterator<String> iterator = items.listIterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equals("Banana")) {
                iterator.set("Blueberry");
                iterator.add("Orange");
            }
        }
        System.out.println("Modified List: " + items);
    }
}