package March30th;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(2,5000.00);
        Horse horse = new Horse(1,1000.00);
        MotorBike motorbike = new MotorBike(1,3000.00);
        Vehicle truck = new Truck(1,10000.00);

        car.calcTotal();

        horse.calcTotal();
        horse.printExperience();

        motorbike.calcTotal();
        motorbike.printExperience();

        truck.calcTotal();

    }




}
