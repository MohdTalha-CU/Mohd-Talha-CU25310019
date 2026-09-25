
class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name : " + patientName);
        System.out.println("Age : " + age);
    }
}

class PatientManager {
    
    void displayAllPatients(Patient[] patients) {
        System.out.println(" All Patient Records ");
        
        for (int i = 0; i < patients.length; i++) {
            
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = new Patient[5];
        
        patients[0] = new Patient(101, "Amit Kumar", 45);
        patients[1] = new Patient(102, "Sneha Joshi", 34);
        patients[2] = new Patient(103, "Rahul Singh", 28);
        patients[3] = new Patient(104, "Priya Sharma", 52);
        patients[4] = new Patient(105, "Vikram Das", 60);

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}