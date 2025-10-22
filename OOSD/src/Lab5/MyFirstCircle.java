package Lab5;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				16/10/25
//Purpose : 			Create circle driver class

public class MyFirstCircle {
    public static void main(String[] args) {
        Point myPoint = new Point(10, 20);

        Circle myCircle = new Circle(15, 30, 5);

        System.out.println("Point details: " + myPoint);
        System.out.println("Circle details: " + myCircle);
    }
}
