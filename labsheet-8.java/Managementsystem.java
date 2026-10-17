import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.TreeSet;
public class Managementsystem {
    public static void main(String[] args) {
        ArrayList<String> studentRecords = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();

        studentRecords.add("Alice");
        uniqueIDs.add(103);
        sortedIDs.add(103);
        studentRecords.add("Bob");
        uniqueIDs.add(101);
        sortedIDs.add(101);

        studentRecords.add("Charlie");
        uniqueIDs.add(102);
        sortedIDs.add(102);
        studentRecords.add("David");
        uniqueIDs.add(102); 
        sortedIDs.add(102); 
        studentRecords.remove("David");
        uniqueIDs.remove(104); 

        System.out.println("Search 'Bob' in records: " + studentRecords.contains("Bob"));
        System.out.println("Search ID '101' in unique IDs: " + uniqueIDs.contains(101));
        System.out.println("Total student records: " + studentRecords.size());
        System.out.println("\n Student Records (ArrayList) ");
        ListIterator<String> listIterator = studentRecords.listIterator();
        System.out.println("Forward:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\nBackward:");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();
        System.out.println("\n Unique Student IDs (HashSet) ");
        for (Integer id : uniqueIDs) {
            System.out.print(id + " ");
        }
        System.out.println();
        System.out.println("\n Sorted Student IDs (TreeSet) ");
        for (Integer id : sortedIDs) {
            System.out.print(id + " ");
        }
        System.out.println();
        System.out.println("\n Collection Differences Demonstrated ");
        System.out.println("1. List (ArrayList): Maintained insertion order (Alice, Bob, Charlie). Allowed duplicates if added.");
        System.out.println("2. Set (HashSet): Removed duplicate attempts (102 was added twice, stored once). No guaranteed order.");
        System.out.println("3. SortedSet (TreeSet): Maintained unique elements like HashSet, but automatically sorted them (101, 102, 103).");
    }
}