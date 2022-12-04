package Dec4;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClassFormattingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		Date ad= new Date();
		
		ZonedDateTime
		
	      // display time and date using toString()
	      System.out.println(ad.toString());
	      
	      
	      Date dNow = new Date( );
	      SimpleDateFormat ft = 
	      new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss ");

	      System.out.println("Current Date changed: " + ft.format(dNow));
	      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
	    	         "Oct", "Nov", "Dec"};
	      
	      GregorianCalendar gcalendar = new GregorianCalendar();
	      
	      // Display current time and date information.
	      System.out.print("Date: ");
	      System.out.println(months[gcalendar.get(Calendar.MONTH)]);
	      System.out.println(" " + gcalendar.get(Calendar.DATE) + " ");
	      System.out.println(gcalendar.get(Calendar.YEAR));
	      
	      System.out.println(gcalendar.get(Calendar.AM));
	

	
	}

}
