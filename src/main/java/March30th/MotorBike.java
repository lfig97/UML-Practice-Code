package March30th;

public class MotorBike extends Vehicle implements IRideable {
    public MotorBike(int qty, double price) {
        super(qty, price);
    }

    @Override
    public void printExperience() {
        System.out.println("Fasssst");

    }

    @Override
    public void calcTotal() {
        System.out.println("MotorBike total: "+getQty()*getPrice());

    }
}
