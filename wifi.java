// Parent Class
class WiFiUser {
    void login() {
        System.out.println("User login to campus Wi-Fi.");
    }
}

// Child Class - Student
class Student extends WiFiUser {
    @Override
    void login() {
        System.out.println("Student logs in using Student ID and Password.");
    }
}

// Child Class - Faculty
class Faculty extends WiFiUser {
    @Override
    void login() {
        System.out.println("Faculty logs in using Employee ID and Password.");
    }
}

// Child Class - Guest
class Guest extends WiFiUser {
    @Override
    void login() {
        System.out.println("Guest logs in using Temporary Access Code.");
    }
}

// Main Class
public class wifi{
    public static void main(String[] args) {

        WiFiUser s = new Student();
        WiFiUser f = new Faculty();
        WiFiUser g = new Guest();

        s.login();
        f.login();
        g.login();
    }
}