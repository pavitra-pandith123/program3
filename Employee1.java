package PROGRAM3;

class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Employee1{
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "15-08-1990", 101, 75000.00);
        emp.displayEmployeeDetails();
    }
}
