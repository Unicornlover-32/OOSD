package Lab8.Q1;

public class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    public double volume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nRadius = " + radius;   
    }
    
}
