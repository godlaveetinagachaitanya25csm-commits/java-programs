
class Account {
    protected int accNumber;
    protected double balance;
    protected String accType;

    Account(int n, double b, String t) {
        accNumber = n;
        balance = b;
        accType = t;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + " | Balance: " + balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Acc: " + accNumber + " | Type: " + accType + " | Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double rate;

    SavingsAccount(int n, double b, double r) {
        super(n, b, "Savings");
        rate = r;
    }

    void calculateInterest() {
        double i = balance * rate / 100;
        System.out.println("Interest: " + i);
        balance += i;
    }
}

class CurrentAccount extends Account {
    private double overdraft;

    CurrentAccount(int n, double b, double o) {
        super(n, b, "Current");
        overdraft = o;
    }

    @Override
    void withdraw(double amt) {
        if (amt <= balance + overdraft) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt + " | Balance: " + balance);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}

public class BankManagement {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(1001, 5000.0, 4.0);

        sa.display();
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.calculateInterest();
        sa.display();

        CurrentAccount ca = new CurrentAccount(1002, 3000.0, 5000.0);

        ca.display();
        ca.deposit(1000);
        ca.withdraw(7000);
        ca.display();
    }
}
