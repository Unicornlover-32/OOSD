package Lab5;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				16/10/25
//Purpose : 			Create Point class to describe a point in 2D space

public class Point {
    protected int x;
    protected int y;

    //Constructors
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    //Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //toString method
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
