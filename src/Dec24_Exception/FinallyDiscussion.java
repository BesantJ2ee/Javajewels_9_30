package Dec24_Exception;

public class FinallyDiscussion {
	
	void moving()
	{
		try {
			// below code do not throw any exception
			int data = 25 /0;
			System.out.println(data);
		}
		// catch won't be executed
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// will executed regardless of exception occurred
		finally {
			System.out.println("finally block always executed");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinallyDiscussion fshf = new FinallyDiscussion();
		fshf.moving();
		
		
		try {
			// below code do not throw any exception
			int data = 25 / 5;
			System.out.println(data);
		}
		// catch won't be executed
		catch (NullPointerException e) {
			System.out.println(e);
		}
		// will executed regardless of exception occurred
		finally {
			System.out.println("finally block always executed");
		}

		System.out.println("rest of code");

	}

}
