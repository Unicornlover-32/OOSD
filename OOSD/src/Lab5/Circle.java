package Lab5;

public class Circle extends Point{
    private int radius;

    //Constructors
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    //Getters
    public int getRadius() {
        return radius;
    }

    //Setters
    public void setRadius(int radius) {
        this.radius = radius;
    }   

    //toString method
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
