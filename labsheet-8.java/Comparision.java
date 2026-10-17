import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Comparision {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add(1, "Inserted Item");
        
        linkedList.add("Item 1");
        linkedList.add("Item 2");
        linkedList.add(1, "Inserted Item");
        arrayList.remove("Item 1");
        linkedList.remove("Item 1");

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("ArrayList get(0): " + arrayList.get(0));
        System.out.println("LinkedList get(0): " + linkedList.get(0));
        System.out.print("ArrayList iteration: ");
        for (String item : arrayList) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.print("LinkedList iteration: ");
        for (String item : linkedList) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("\nComparison Observations:");
        System.out.println("| Feature | ArrayList | LinkedList |");
        System.out.println("| Internal Structure | Dynamic Array | Doubly Linked List |");
        System.out.println("| Insertion/Deletion | Slower (shifts elements) | Faster (updates pointers) |");
        System.out.println("| Access (get) | Faster (O(1)) | Slower (O(n)) |");
        System.out.println("| Memory Overhead | Lower | Higher (stores nodes) |");
    }
}