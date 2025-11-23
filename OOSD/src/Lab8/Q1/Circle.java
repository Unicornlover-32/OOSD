package Lab8.Q1;

public class Circle extends TwoDShape {
    private double radius;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nRadius = " + radius;   
    }  
} 
