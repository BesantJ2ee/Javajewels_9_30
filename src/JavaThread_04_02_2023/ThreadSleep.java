package JavaThread_04_02_2023;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 10; i++) {

				// it will sleep the main thread for 2 sec
				// ,each time the for loop runs
				Thread.sleep(2000);

				// printing the value of the variable
				System.out.println(i);
			}
		} catch (Exception e) {

			// catching the exception
			System.out.println(e);
		}
	}

}
