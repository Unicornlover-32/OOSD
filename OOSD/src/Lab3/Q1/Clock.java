package Lab3.Q1;

import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND));

        long startTime = System.currentTimeMillis();
        long currentTime = startTime;
        int oldMin = cal.get(Calendar.MINUTE);
        int newMin = oldMin;

        while (newMin == oldMin) 
        {
            while (currentTime - startTime < 1000) //Wait 1 second
            {
                currentTime = System.currentTimeMillis();
            }
            t.tick();
            System.out.println(t.toString());
            newMin = t.getMinute();
            startTime = System.currentTimeMillis();
            currentTime = startTime;
        }
	}
}
