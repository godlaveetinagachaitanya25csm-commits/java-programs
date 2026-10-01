import java.util. Scanner;
public class Swapp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enterr value of b:");
        int b = sc.nextInt(); 
int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping value of a is:"+a+"value of b is:"+b);
    }
}