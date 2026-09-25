class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Doctor extends Person {
    private String specialization;
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    void displayDoctor() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
    }
}
class Nurse extends Person {
    private String ward;
    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }
    void displayNurse() {
        System.out.println("Nurse Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ward: " + ward);
    }
}
public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor d = new Doctor(
            "Dr. Ayesha",
            35,
            "Cardiology"
        );
        Nurse n = new Nurse(
            "Sara",
            28,
            "Emergency Ward"
        );
        d.displayDoctor();
        System.out.println();
        n.displayNurse();
    }
}