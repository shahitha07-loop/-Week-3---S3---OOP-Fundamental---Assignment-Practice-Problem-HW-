class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    // Constructor for permanent employees
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    // Constructor for interns (chains to the 3-argument constructor via this)
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Prints all four fields on one line
    public void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Permanent employee
        Employee emp1 = new Employee("E-101", "Divya", 65000);
        emp1.printProfile();

        // Intern employee
        Employee emp2 = new Employee("E-102", "Arjun");
        emp2.printProfile();
    }
}