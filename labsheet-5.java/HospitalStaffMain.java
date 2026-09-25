class Person {
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount = 0;
    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }
    public String getLicenseNo() {
        return licenseNo;
    }
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}
class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        for (Employee employee : staff) {
            employee.displayEmployee();

            if (employee instanceof Doctor) {
                Doctor doctor = (Doctor) employee;
                System.out.println("Role: Doctor");
                System.out.println("Specialization: "
                        + doctor.getSpecialization());
            } 
            else if (employee instanceof Pharmacist) {
                Pharmacist pharmacist = (Pharmacist) employee;
                System.out.println("Role: Pharmacist");
                System.out.println("License No: "
                        + pharmacist.getLicenseNo());
            }
        }
        System.out.println("Total Employees: "
                + Employee.employeeCount);
    }
}
public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Ayesha", 35, 101,
                    75000.0, "Cardiology"),
            new Pharmacist("Sahil Kumar", 25, 102,
                    40000.0, "PH12345")
        };
        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}