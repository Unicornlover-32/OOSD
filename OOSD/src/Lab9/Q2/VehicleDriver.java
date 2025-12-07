package Lab9.Q2;

public class VehicleDriver {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 35500);
        HGV hgv = new HGV("Volvo", "FH Aero", 115000);

        System.out.println("Car Details:");
        System.out.println(car.toString());
        System.out.println("Import Duty: " + car.calculateDuty());

        System.out.println("\nHGV Details:");
        System.out.println(hgv.toString());
        System.out.println("Import Duty: " + hgv.calculateDuty());
    }
}
