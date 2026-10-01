import java.util.Scanner;

class MultipleExceptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.print("Enter divisor: ");
            int b = sc.nextInt();

            System.out.println("Result = " + (a / b));

            int[] arr = {10, 20, 30};

            System.out.println("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element = " + arr[index]);
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }
    }
}