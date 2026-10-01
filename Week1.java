


class BankAccount 
{
   int accountnumber;
   String coustomername;
   double balance;
   String accounttype; 


BankAccount(int accno, String name, double bal, String type)
{
accountnumber = accno;
coustomername = name;
balance = bal;
accounttype = type;
}
 void deposit(double amount)
 {
    balance = balance + amount;
    System.out.println(amount +"deposited successfully");

 }

void withdraw(double amount)
{
    if(balance >= amount)
    {
        balance = balance - amount;
        System.out.println(amount+ "withdrawn successfull:");

    }
    else 
    {
        System.out.println("insuffient ammount");
    }
}
void transfer(BankAccount Receiver , double amount)
{
    if(balance >= amount)
    {
        balance = balance - amount;
        Receiver.balance = Receiver.balance + amount;
        System.out.println(amount +"transfed to " + Receiver.coustomername);
    }
    else{
        System.out.println("failed");
    }
}
void display()
{
   System.out.println("");
   System.out.println("accountnumber : " + accountnumber);
   System.out.println("customer name : " + coustomername);
   System.out.println("Account name : "+accounttype);
   System.out.println("balance : " + balance); 
}
}

class SavingAccount extends BankAccount{
    double interstRate;
    SavingAccount(int Accno, String name, double bal, double rate){
       super(Accno, name, bal,"saving");
       interstRate = rate; 
    }
    void calculateinterst()
    {
        double interst = balance * interstRate /100;
        System.out.println("interst = "+interst);

    }



@Override
void display (){
    super.display();
    System.out.println("intrestrate : " + interstRate + "%");

}
}
class CurrentAccount extends BankAccount {

    double overdraftLimit;

    CurrentAccount(int accNo, String name, double bal, double limit) {
        super(accNo, name, bal, "Current");
        overdraftLimit = limit;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Overdraft Limit : " + overdraftLimit);
    }
}
public class Week1{
    public static void main(String []args){
     SavingAccount s1= new SavingAccount(101,"chaitanya",10000,5);
     CurrentAccount c1 = new CurrentAccount(102,"chaitu",5000,3000);
     System.out.println("intial Account Details");
     s1.display();
    c1.display();
    System.out.println("\ndeposit:");
    s1.deposit(2000);
    System.out.println("\nWithdrawal:");
    s1.withdraw(2000);
    System.out.println("\nintrest:");
    s1.calculateinterst();
    
    
    }
}

