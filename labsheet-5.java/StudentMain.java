
class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        name = "Aarav Sharma";
        rollNo = 101;
        marks = 88.5;
    }
    void displayDetails() {
        System.out.println(" Student Record ");
        System.out.println("Roll Number:" + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
    }
}