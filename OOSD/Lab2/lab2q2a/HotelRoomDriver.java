package lab2q2a;

import ie.carlowIT.lab1.Thermometer;

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
		roomA.toString();
		roomB.toString();
		
		
	}//end main

}//end HotelRoomDriver
