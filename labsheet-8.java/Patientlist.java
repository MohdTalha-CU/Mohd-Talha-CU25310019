import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Patientlist {
    public static void main(String[] args) {
        List<String> patientNames = new ArrayList<>();
        Set<Integer> patientIDs = new HashSet<>();
        patientNames.add("John Doe");
        patientNames.add("Jane Smith");
        patientIDs.add(1001);
        patientIDs.add(1002);
        System.out.println("Initial Patients: " + patientNames);
        System.out.println("Initial IDs: " + patientIDs);
        
        patientNames.add("Alice Brown");
        patientIDs.add(1003);
        patientNames.remove("Jane Smith");
        patientIDs.remove(1002);
        System.out.println("\nAfter adding Alice Brown and removing Jane Smith:");
        System.out.println("Patients: " + patientNames);
        System.out.println("IDs: " + patientIDs);
        
        System.out.println("\nSearching Records:");
        System.out.println("Is 'John Doe' in the list? " + patientNames.contains("John Doe"));
        System.out.println("Is ID '1003' in the set? " + patientIDs.contains(1003));
    }
}