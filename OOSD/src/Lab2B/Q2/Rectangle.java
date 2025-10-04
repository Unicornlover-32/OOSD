package Lab2B.Q2;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				04/10/25
//Purpose : 			Create rectangle objects

public class Rectangle {
    private double length;
	private double width;
	
	// constructor #1
	public Rectangle() 	
	{
		setLength(1.0);
		setWidth(1.0);
	}
	
	// constructor #2
	public Rectangle(double length, double width) 
	{
		setLength(length);
		setWidth(width);
	}
	
	// setter methods
	public void setLength(double number)
	{
		if (number > 0 && number < 40) //verify size greater than 0 and less than 40
        {
            length = number;
        }	
	}
	
	public void setWidth(double number)
	{
		if (number > 0 && number < 40) //verify size greater than 0 and less than 40
        {
            width = number;
        }	
	}
	

	// getter methods
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}

	public String getArea()
	{
		return "The area of the rectangle is " + (length * width);
	}

	public String getPerimeter()
	{
		return "The perimeter of the rectangle is " + (length * 2 + width * 2);
	}

	// toString method to print out object
	public String toString()
	{
		return "Length = " + length + ", width = " + width;
	}
}
