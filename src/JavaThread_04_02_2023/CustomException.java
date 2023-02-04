package JavaThread_04_02_2023;

public class CustomException {

	static void validate(int age) throws ValidationAgeException {
		if (age < 19) {

			// throw an object of user defined exception
			throw new ValidationAgeException("age is not valid purchase liquor");
		} else {
			System.out.println("welcome to Brewery");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// calling the method
			validate(20);
		} catch (ValidationAgeException ex) {
			System.out.println("Caught the exception");

			// printing the message from ValidationAgeException object
			System.out.println("Exception occured: " + ex);
		}

	}

}
