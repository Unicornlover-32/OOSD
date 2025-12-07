package Lab9.Q2;

public class Car extends RoadVehicle implements ImportDuty {
    private double price;

    public Car(String make, String model, double price) {
        super(make, model);
        this.price = price;
    }
    
    @Override
    //Calculate import duty based on car price
    public double calculateDuty() {
        return price * CARTAXRATE;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nPrice: " + price;
    }
}
