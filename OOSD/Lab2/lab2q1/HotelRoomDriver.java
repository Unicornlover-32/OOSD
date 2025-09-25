package lab2q1;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				18/09/25
//Purpose : 			Hotel room linking room type to number

public class HotelRoomDriver {

	public static void main(String[] args) 
	{
		HotelRoom roomA= new HotelRoom();		// Create an instance of our HotelRoom class
		HotelRoom roomB= new HotelRoom(201, "Double");	// Create second instance using Constructor #2
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		System.out.println(roomA.toString());
		System.out.println(roomB.toString());
		
	}//end main

}//end HotelRoomDriver
