import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to perform multiplication table");
        int a = sc.nextInt();
        int i = 1;
        for(i=1;i<=10;i++){
        System.out.println(a+"x"+i+"="+(a*i));
        }
        
    }
}


