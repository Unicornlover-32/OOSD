package Lab2B.Q3;

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

	//print rectangle method
	public void printRectangle()
	{
		for (int i = 0; i < length; i++) // Printing the length of the rectangle loop
		{
			for (int x = 0; x < width; x++)	// Printing the width of the rectangle loop
			{
				if (i == 0 || i == length - 1) // Full print rows of stars on the first and last instance
											   // of length loop
				{
					System.out.print("*");
				}
				else
				{
					if (x == 0 || x == width - 1) // Print first and last columns for rectangle 
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
