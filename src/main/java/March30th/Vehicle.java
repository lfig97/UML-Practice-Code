package March30th;

public abstract class Vehicle extends Product{
    private int qty;
    private double price;

    public Vehicle(int qty,double price){
        this.qty = qty;
        this.price = price;
    }

    public abstract void calcTotal();



    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
