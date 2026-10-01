import java.util.Scanner;


class WiFiUser {
    void login() {
        System.out.println("Logging into Campus Wi-Fi...");
    }
}


class Student extends WiFiUser {
    @Override
    void login() {
        System.out.println("Student logs in using Student ID and Password.");
    }
}


class Faculty extends WiFiUser {
    @Override
    void login() {
        System.out.println("Faculty logs in using Employee ID and Password.");
    }
}


class Guest extends WiFiUser {
    @Override
    void login() {
        System.out.println("Guest logs in using Temporary Access Code.");
    }
}


public class wifilogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        WiFiUser[] users = {
            new Student(),
            new Faculty(),
            new Guest()
        };

        System.out.println("Select User Type");
        System.out.println("1. Student");
        System.out.println("2. Faculty");
        System.out.println("3. Guest");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        users[choice - 1].login();

        sc.close();
    }
}