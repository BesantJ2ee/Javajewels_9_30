package Nov27;

public class Enum {
	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	
	enum colours {
		  ORANGE,
		  RED,
		  GREEN,
		  YELLOW,
		}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="20";
		String b ="20";
		
		if(a.equals(b)) {
			
		}
		
		colours colour1=colours.YELLOW;
		System.out.println(colour1);
		
		Level myVar =Level.HIGH;
		System.out.println(myVar);
	}

}
