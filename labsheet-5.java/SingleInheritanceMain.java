
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name : " + employeeName);
        System.out.println("Salary : Rs. " + salary);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("License No  : " + licenseNo);
    }
}
public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist(101, "Ravi Kumar", 45000.0, "PH-887766");
        System.out.println(" Pharmacist Record ");
        p.displayPharmacist();
    }
}