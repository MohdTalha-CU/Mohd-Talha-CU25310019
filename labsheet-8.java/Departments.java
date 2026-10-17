import java.util.HashSet;

public class Departments {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science");
        departments.add("IT");
        departments.add("Mechanical");
        departments.add("Electrical");
        departments.add("IT");
        departments.add("Computer Science");
        System.out.println("Unique Departments: " + departments);
    }
}
