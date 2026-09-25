class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    static int employeeCount = 0; 
    protected String department = "Pharmacy"; 
    Employee(int employeeId, String employeeName, double salary) { 
        this.employeeId = employeeId; 
        this.employeeName = employeeName;
        this.salary = 0;
        setSalary(salary);
        employeeCount++;
    }
    public int getEmployeeId() { 
        return employeeId;
    }
    public void setEmployeeId(int employeeId) { 
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) { 
            this.salary = salary;
        } else {
            System.out.println("Negative salary rejected.");
        }
    }
    void displayBasic() { 
                System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    protected String getEmployeeStatus() { 
        if (salary >= 50000) {
            return "Senior Employee";
        } else {
            return "Regular Employee";
        }
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName,double salary, String licenseNo) {super(employeeId, employeeName, salary); 
        this.licenseNo = licenseNo; 
    }
    public String getLicenseNo() {
        return licenseNo;
    }
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() { 
        displayBasic();
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
        System.out.println("Status: " + getEmployeeStatus());
    }
}
class StoreManager extends Employee {
    private int storeSection;
    StoreManager(int employeeId, String employeeName,double salary, int storeSection) {
        super(employeeId, employeeName, salary); 
        this.storeSection = storeSection;
    }
    public int getStoreSection() {
        return storeSection;
    }
    public void setStoreSection(int storeSection) {
        this.storeSection = storeSection;
    }
    void displayStoreManager() {
        displayBasic();
        System.out.println("Role: Store Manager");
        System.out.println("Store Section: " + storeSection);
        System.out.println("Status: " + getEmployeeStatus());
    }
}
class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees) {double totalSalary = 0; 
        for (Employee employee : employees) { 
            if (employee instanceof Pharmacist) {Pharmacist pharmacist = (Pharmacist) employee;pharmacist.displayPharmacist();
            } 
            else if (employee instanceof StoreManager) { StoreManager manager = (StoreManager) employee; manager.displayStoreManager();
            }
            totalSalary += employee.getSalary();
        }
        System.out.println("Total Employees: "+ Employee.employeeCount);
        System.out.println("Total Salary: " + totalSalary);
    }
}
public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee pharmacist = new Pharmacist( 101, "Sahil Kumar", 45000, "PH12345");
        Employee storeManager = new StoreManager( 102, "Ayesha Khan", 60000, 5);
        Employee[] employees = {
            pharmacist,
            storeManager
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}