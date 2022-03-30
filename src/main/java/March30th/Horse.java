package March30th;

public class Horse extends Vehicle implements IRideable{
    public Horse(int qty, double price) {
        super(qty, price);
    }


    @Override
    public void printExperience() {
        System.out.println("Bumpy ride");

    }

    @Override
    public void calcTotal() {
        System.out.println("Horse total: "+getQty()*getPrice());

    }
}
