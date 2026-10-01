
import java.util.*;

class Customer {
    public String name;
    public String location;

    private List<Order> orders = new ArrayList<>();

    Customer(String n, String loc) {
        this.name = n;
        this.location = loc;
    }

    public void randomize() {
        System.out.println(name + ": randomize() called");
    }

    public void reconnect() {
        System.out.println(name + ": reconnect() called");
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name + " | Location: " + location);

        for (Order o : orders)
            o.confirm();
    }
}

class Order {
    public String date;
    public String number;

    Order(String d, String n) {
        this.date = d;
        this.number = n;
    }

    public void confirm() {
        System.out.println("Order " + number + " dated " + date + " confirmed.");
    }

    public void close() {
        System.out.println("Order " + number + " closed.");
    }
}

class SpecialOrder extends Order {

    SpecialOrder(String d, String n) {
        super(d, n);
    }

    @Override
    public void confirm() {
        System.out.println("[Special] Order " + number + " confirmed.");
    }

    public void dispatch() {
        System.out.println("[Special] Order " + number + " dispatched via priority courier.");
    }
}

class NormalOrder extends Order {

    NormalOrder(String d, String n) {
        super(d, n);
    }

    @Override
    public void confirm() {
        System.out.println("[Normal] Order " + number + " confirmed.");
    }

    public void dispatch() {
        System.out.println("[Normal] Order " + number + " dispatched via standard delivery.");
    }

    public void receive() {
        System.out.println("[Normal] Order " + number + " received by customer.");
    }
}

public class ClassDiagramDemo {

    public static void main(String[] args) {

        Customer c = new Customer("Ravi", "Hyderabad");

        c.randomize();
        c.reconnect();

        SpecialOrder so =
            new SpecialOrder("2026-06-01", "ORD-101");

        NormalOrder no =
            new NormalOrder("2026-06-02", "ORD-102");

        c.addOrder(so);
        c.addOrder(no);

        c.displayOrders();

        so.dispatch();
        so.close();

        no.dispatch();
        no.receive();
        no.close();
    }
}