interface Employee {
    String getName();
    double calculatePay();
    void displayDetails();
}

class RegularEmployee implements Employee {
    private String name;
    private double basic;

    RegularEmployee(String n, double b) {
        name = n;
        basic = b;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return basic + basic * 0.2 + basic * 0.1 + basic * 0.05;
    }

    public void displayDetails() {
        System.out.println("Regular: " + name + " | Pay: " + calculatePay());
    }
}

class ContractEmployee implements Employee {
    private String name;
    private double rate;
    private int hrs;

    ContractEmployee(String n, double r, int h) {
        name = n;
        rate = r;
        hrs = h;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return rate * hrs;
    }

    public void displayDetails() {
        System.out.println("Contract: " + name + " | Pay: " + calculatePay());
    }
}

class Vendor implements Employee {
    private String name;
    private double fee;

    Vendor(String n, double f) {
        name = n;
        fee = f;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return fee * 0.85;
    }

    public void displayDetails() {
        System.out.println("Vendor: " + name + " | Net Pay: " + calculatePay());
    }
}

public class EmployeeCategories {
    public static void main(String[] args) {

        Employee[] emp = {
            new RegularEmployee("Ravi", 40000),
            new ContractEmployee("Priya", 500, 160),
            new Vendor("TechSol", 150000)
        };

        for (Employee e : emp)
            e.displayDetails();
    }
}