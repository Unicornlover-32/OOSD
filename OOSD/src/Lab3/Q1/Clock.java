package Lab3.Q1;

import java.util.Calendar;

//Student Name: 		Ethan Payne
//Student Id Number: 	C00309151
//Date: 				07/10/25
//Purpose : 			Create Time object and increment seconds for one minute

public class Clock {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

        long startTime = System.currentTimeMillis();        // Assign a variable to store the time 
        int oldMin = cal.get(Calendar.MINUTE);              // Store the current minute

        while (cal.get(Calendar.MINUTE) == oldMin)          // Run loop whilst the minute is the same
        {
            while (System.currentTimeMillis() - startTime < 1000)         
            {
                //Wait 1 second
            }
            t.tick();                                       // Call function to increment the second portion of the loop
            System.out.println(t.toString());               
            startTime = System.currentTimeMillis();         // Update start time to count another second
        }
	}
}
