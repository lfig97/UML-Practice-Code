package March30th;

public class Car extends Vehicle{

    public Car(int qty, double price) {
        super(qty, price);
    }

    @Override
    public void calcTotal() {
        System.out.println("Car total: "+ getQty() *getPrice());

    }

}
