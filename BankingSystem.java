abstract class Bank {
    abstract double getRateOfInterest();

    void displayInterest() {
        System.out.println("Rate of Interest: " + getRateOfInterest() + "%");
    }
}

class RBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        String[] names = {"RBI", "SBI", "HDFC"};
        Bank[] banks = {new RBI(), new SBI(), new HDFC()};

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter bank name: ");

        String input = sc.next();

        for (int i = 0; i < names.length; i++)
            if (names[i].equalsIgnoreCase(input)) {
                banks[i].displayInterest();
                return;
            }

        System.out.println("Bank not found.");
    }
}