package lab2q4;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				18/09/25
//Purpose : 			Hotel room linking room type to number

public class HotelRoomDriver {

	public static void main(String[] args) 
	{
		HotelRoom roomA= new HotelRoom();						// Create an instance of our HotelRoom class
		HotelRoom roomB= new HotelRoom(201, "Double", 0, 80);	// Create second instance using Constructor #2
		HotelRoom roomC= new HotelRoom(202, "Single", 0, 90);   // Create third instance using Constructor #2
		
		roomA.setRoomNumber(200);
		roomA.setRoomOccupied(1);			// Added to show if room is occupied
		roomA.setRoomRate(80);				// Added to show the rate of room
		roomA.setRoomType("Single");
		System.out.println(roomA.toString());		
		System.out.println(roomB.toString());
		System.out.println(roomC.toString());
		
	}//end main

}//end HotelRoomDriver
