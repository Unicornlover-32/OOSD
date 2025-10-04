package Lab2.Q4;

public class HotelRoom 
{
	private int roomNumber;
	private int roomOccupied;
	private double roomRate;
	private String roomType;
	
	// constructor #1
	public HotelRoom() 	
	{
		setRoomNumber(0);
		setRoomOccupied(0);
		setRoomRate(0);
		setRoomType("Single");
	}
	
	// constructor #2
	public HotelRoom(int number, String type, int occupied, double rate) 
	{
		setRoomNumber(number);
		setRoomOccupied(occupied);
		setRoomRate(rate);
		setRoomType(type);
	}
	
	// setter methods
	public void setRoomNumber(int number)
	{
		roomNumber = number;		
	}
	
	public void setRoomOccupied(int number)
	{
		if (!isOccupied())
		{
			roomOccupied = number;	
		}
		else
		{
			System.out.println("Already occupied");  // This is to show that the room hasnt been double booked
		}
	}
	
	public void setRoomRate(double rate)
	{
		roomRate = rate;		
	}
	
	public void setRoomType(String type)
	{
		roomType = type;		
	}

	// getter methods
	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public int getRoomOccupied()
	{
		return roomOccupied;
	}
	
	public double getRoomRate()
	{
		return roomRate;
	}
	
	public String getRoomType()
	{
		return roomType;
	}
	
	public Boolean isOccupied()
	{
		if (roomOccupied == 1) // If room is booked it will return true
		{
			return true;
		}
		else	// If room is vacant will return false
		{
			return false;
		}
	}

	// toString method to print out object
	public String toString()
	{
		if (roomOccupied == 0)
		{
			return "Your room number is " + roomNumber + ", room is vacant and has a rate of " + roomRate + ", type is " + roomType;
		}
		else
		{
			return "Your room number is " + roomNumber + ", room is occupied and has a rate of " + roomRate + ", type is " + roomType;
		}
	}
}
