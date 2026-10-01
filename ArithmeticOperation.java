public class ArithmeticOperation {
    int x = 10;
    int y = 20;

    void add(){
        System.out.println("add x and y is:"+ (x+y));
    }
    void sub(){
    System.out.println("sub x and y is:"+ (x-y));
    }
    void mul(){
        System.out.println("mul x and y is:"+(x*y));
    }
    void div(){
        System.out.println("division x and y"+(x%y));
    }
public static void main(String[] args) {
    ArithmeticOperation ao = new ArithmeticOperation();
    System.out.println("value of x is"+ ao.x);
    System.out.println("value of y is"+ ao.y);        
    
    ao.add();
    ao.sub();
    ao.mul();
    ao.div();
}
}