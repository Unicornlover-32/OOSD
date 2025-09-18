package lab2q2a;

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
	
	public void toString()
	{
		
	}
}
