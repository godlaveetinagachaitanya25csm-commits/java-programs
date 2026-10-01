
public class MarksAverage {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide marks as command line arguments.");
            return;
        }

        double total = 0;

        System.out.print("Marks entered: ");

        for (String mark : args) {
            double m = Double.parseDouble(mark);
            total += m;
            System.out.print(m + " ");
        }

        System.out.println();

        double average = total / args.length;

        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println("Subjects: " + args.length);
    }
}