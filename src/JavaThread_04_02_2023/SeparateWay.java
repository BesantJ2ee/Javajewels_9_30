package JavaThread_04_02_2023;

interface Age {
	int x = 21;

	void getAge();
	

}
/**
 * 
 * Anonymous Inner class that extends a class
Anonymous Inner class that implements an interface
Anonymous Inner class that defines inside method/constructor argument
 * @author hp
 *
 */
public class SeparateWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	PersonImplementation class is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
		Age z1 = new Age(){
			@Override
			public void getAge() {
				// printing age
				System.out.print("Age is " + x);
			}
		};

		z1.getAge();

	}
}
