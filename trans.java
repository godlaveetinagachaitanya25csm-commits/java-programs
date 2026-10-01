import java.util.Scanner;


class transport {
    void travel () {
        System.out.println("a university provides different transport facilities:");
    }
}


class clgbus extends transport{
    @Override
    void travel() {
        System.out.println("clgbuses are use for long distance");
    }
}

class clgvan extends transport {
    @Override
    void travel() {
        System.out.println("clgvans are used for less distance");
    }
}

class electricshuttle extends transport {
    @Override
    void travel() {
        System.out.println("neew tech");
    }
}


public class trans{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        transport[] users = {
            new clgbus(),
            new clgvan(),
            new electricshuttle()
        };

        System.out.println("Select User Type");
        System.out.println("1. clgbus");
        System.out.println("2. clgvan");
        System.out.println("3. electicshuttle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        users[choice - 1].travel();

        sc.close();
    }
}