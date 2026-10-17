import java.util.TreeSet;
public class StudentID {
    public static void main(String[] args) {
        TreeSet<Integer> studentIDs = new TreeSet<>();
        studentIDs.add(105);
        studentIDs.add(102);
        studentIDs.add(108);
        studentIDs.add(105);
        studentIDs.add(101);
        studentIDs.add(108);
        studentIDs.add(110);
        
        System.out.println("Unique Sorted IDs: " + studentIDs);
        System.out.println("First ID: " + studentIDs.first());
        System.out.println("Last ID: " + studentIDs.last());
        System.out.println("ID higher than 105: " + studentIDs.higher(105));
        System.out.println("ID lower than 105: " + studentIDs.lower(105));
    }
}