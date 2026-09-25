
class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative. Update rejected for age: " + age);
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be greater than zero. Update rejected for weight: " + weight);
        }
    }
    public void displayPatient() {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age          : " + age);
        System.out.println("Weight       : " + weight + " kg");
    }
}

public class PatientMain1 {
    public static void main(String[] args) {
        Patient p1 = new Patient("Karan Sharma", 40, 75.5);
        System.out.println("--- Initial Patient Record ---");
        p1.displayPatient();

        System.out.println(">> Attempting VALID updates (Age: 41, Weight: 74.0)...");
        p1.setAge(41);
        p1.setWeight(74.0);
        p1.displayPatient();

        System.out.println(">> Attempting INVALID updates (Age: -5, Weight: 0.0)...");
        p1.setAge(-5);
        p1.setWeight(0.0);
        
        System.out.println("\n Final Patient Record (After Invalid Attempts) ");
        p1.displayPatient();
    }
}