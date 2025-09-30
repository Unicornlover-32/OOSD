package lab2q3;

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
		if (isOccupied() == false)
		{
			roomOccupied = number;
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
	
	public boolean isOccupied()
	{
		if (roomOccupied == 1)
		{
			return true;
		}
		else
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
