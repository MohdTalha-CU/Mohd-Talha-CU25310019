import java.util.ArrayList;
public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Frank");
        students.add("Grace");
        students.add("Hannah");
        students.add("Ian");
        students.add("Jack");
        System.out.println("Student Names: " + students);
        System.out.println("Total size: " + students.size());
    }
}