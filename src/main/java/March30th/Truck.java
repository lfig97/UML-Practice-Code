package March30th;

public class Truck extends Vehicle{
    public Truck(int qty, double price) {
        super(qty, price);
    }

    @Override
    public void calcTotal() {
        System.out.println("Truck total: "+getQty()*getPrice());

    }
}
