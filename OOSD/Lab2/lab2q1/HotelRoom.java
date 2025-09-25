package lab2q1;

public class HotelRoom 
{
	private int roomNumber;
	private String roomType;
	
	public HotelRoom() 
	{
		setRoomNumber(0);
		setRoomType("Single");
	}
	
	public HotelRoom(int number, String type) 
	{
		setRoomNumber(number);
		setRoomType(type);
	}
	
	public void setRoomNumber(int number)
	{
		roomNumber = number;		
	}
	
	public void setRoomType(String type)
	{
		roomType = type;		
	}


	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public String getRoomType()
	{
		return roomType;
	}
	
	public String toString()
	{
		return "Your room number is " + roomNumber + ", type is " + roomType;
	}
}
