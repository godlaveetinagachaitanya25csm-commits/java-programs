
class Employee {
    String name, designation;
    int id;
    double salary;
    boolean promotion;

    // Constructor 1
    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.promotion = true;
    }

    // Constructor 2
    Employee(int id, String name, String designation, double salary, boolean promotion) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.promotion = promotion;
    }

    void display() {
        System.out.println("ID:" + id + " Name:" + name +
                           " Designation:" + designation);

        System.out.println("Salary:" + salary +
                           " Promotion:" +
                           (promotion ? "Eligible" : "Not Eligible"));

        System.out.println("--------------------------------------");
    }
}

public class EmployeeSystem {

    public static void main(String[] args) {

        new Employee(101, "Ravi", "Manager", 75000.0).display();

        new Employee(102, "Priya", "Developer", 55000.0, false).display();

        new Employee(103, "Suresh", "Analyst", 48000.0, true).display();
    }
}