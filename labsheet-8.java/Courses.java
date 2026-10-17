import java.util.ArrayList;
import java.util.Scanner;
public class Courses {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Data Structures");
        courses.add("Operating Systems");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a course name to search: ");
        String searchCourse = sc.nextLine();
        if (courses.contains(searchCourse)) {
            System.out.println("The course '" + searchCourse + "' exists in the list.");
        } else {
            System.out.println("The course '" + searchCourse + "' does not exist in the list.");
        }
        sc.close();
    }
}