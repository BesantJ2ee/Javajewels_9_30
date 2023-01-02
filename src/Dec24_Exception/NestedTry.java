package Dec24_Exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//outer try
		try {
			// inner try block 1
			try {
				System.out.println("going to divide by 0 Expecting Arithmetic exception");
				int b = 39 / 0;
			
			// catch block of inner try block 1
			}catch (NumberFormatException e) {
				System.out.println(e);
			}
		} 
		//outer catch
		catch (Exception e) {
			System.out.println("handled the exception (outer catch)");
		}

	}

}
