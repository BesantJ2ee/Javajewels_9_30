package Dec4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JaVAdATE_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate myObj = LocalDate.now();
		 LocalDateTime myObj2 = LocalDateTime.now();
		
		 
		 String printMonth= myObj.getMonth().toString();
		// System.out.println(printMonth);
		 // Create a date object
		// System.out.println("LocalDate"+myObj);
		// System.out.println("LocalDateTime"+myObj2);
		 myObj.plusDays(5);
		 myObj.minusDays(3);
		// System.out.println("after"+ myObj.plusDays(5));
		 //System.out.println( myObj.minusDays(3));
		
		 
		 
		 //System.out.println(myObj);
		    
		    LocalTime myObj1 = LocalTime.now();
		   
		   // System.out.println(myObj1);
		    
		    LocalDateTime myObj3 = LocalDateTime.now();
		   // System.out.println(myObj3);
		    
		    //formatter
		    LocalDateTime myDateObj = LocalDateTime.now();
		    System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yy HH:MM:SS");

		    String formattedDate = myDateObj.format(myFormatObj);
		    System.out.println("After formatting: " + formattedDate);
	}

}
