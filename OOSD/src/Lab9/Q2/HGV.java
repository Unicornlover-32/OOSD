package Lab9.Q2;

public class HGV extends RoadVehicle implements ImportDuty {
    private double price;
    
    public HGV(String make, String model, double price) {
        super(make, model);
        this.price = price;
    }

    @Override
    //Calculate import duty based on HGV price
    public double calculateDuty() {
        return price * HGVTAXRATE;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrice: " + price;
    }    
}
