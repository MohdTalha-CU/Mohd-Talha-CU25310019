
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }
    public void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : Rs. " + salary);
    }
}
public class PrivateAccessMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Neha Gupta", 45000.0);
        System.out.println(" Employee Record ");
        emp.displayEmployee();   
    }
}