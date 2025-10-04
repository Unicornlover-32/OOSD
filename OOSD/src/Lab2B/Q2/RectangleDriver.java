package Lab2B.Q2;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				04/10/25
//Purpose : 			Create the driver program for a rectangle object

public class RectangleDriver {
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(5.0);
        rectangle.setWidth(10);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(rectangle.toString());
    }
}
