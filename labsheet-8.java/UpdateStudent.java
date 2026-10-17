import java.util.ArrayList;
public class UpdateStudent {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");
        students.set(1, "Karan");
        students.remove(3);
        System.out.println("Updated Student List: " + students);
    }
}
