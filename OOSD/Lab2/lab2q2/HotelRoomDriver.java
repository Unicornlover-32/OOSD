package lab2q2;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				18/09/25
//Purpose : 			Hotel room linking room type to number

public class HotelRoomDriver {

	public static void main(String[] args) 
	{
		HotelRoom roomA= new HotelRoom();						// Create an instance of our HotelRoom class
		HotelRoom roomB= new HotelRoom(201, 0, 80, "Double");	// Create second instance using Constructor #2
		
		roomA.setRoomNumber(200);
		roomA.setRoomOccupied(1);			// Added to show if room is occupied
		roomA.setRoomRate(80);				// Added to show the rate of room
		roomA.setRoomType("Single");
		System.out.println(roomA.toString());		
		System.out.println(roomB.toString());
		
	}//end main

}//end HotelRoomDriver
