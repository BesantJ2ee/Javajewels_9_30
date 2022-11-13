package November13;

public class switchdiscussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 4;

		switch (day) {
		case 10:
			System.out.println("first switch Monday");
			//break;
		case 9:
			System.out.println("first switch saturday");
		case 4:
			System.out.println(" first switch sunday");
			//break;
		case 7:
			System.out.println("first switch Wednesday");
			//break;
		case 8:
			System.out.println("first switch thursday");
			//break;
		}

		String day1 = "Monday";
		switch (day1) {
		case "Monday":
			System.out.println("Second swithchMonday");
			
		case "Tuesday":
			System.out.println("second switch tuesday");
			
		case "Wednesday":
			System.out.println("second switch Wednesday");
			break;
		default : 
	    	System.out.println("The days execued");
	    
	  
		
		}

	}

}
